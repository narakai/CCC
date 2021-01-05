/*
 * Copyright (c) 2021 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.ccc.backend.controller

import com.github.mustafaozhan.ccc.common.data.api.ApiRepository
import com.github.mustafaozhan.ccc.common.data.db.OfflineRatesDao
import com.github.mustafaozhan.ccc.common.log.kermit
import com.github.mustafaozhan.ccc.common.model.CurrencyType
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class ApiController(
    private val apiRepository: ApiRepository,
    private val offlineRatesDao: OfflineRatesDao
) {
    companion object {
        private const val SECOND: Long = 1000
        private const val DAY = (12 * 60 * 60 * SECOND)
    }

    fun startSyncApi() = GlobalScope.launch {
        kermit.d { "Api refreshApi" }
        while (isActive) {
            kermit.d { "refreshing" }
            updateCurrencies()

            delay(DAY)
        }
    }

    private suspend fun updateCurrencies() {
        CurrencyType.values().forEach { base ->

            delay(SECOND)

            apiRepository
                .getRatesByBaseViaApi(base.name)
                .execute({ currencyResponse ->
                    offlineRatesDao.insertOfflineRates(currencyResponse.rates)
                }, { error ->
                    kermit.e(error) { error.message.toString() }
                })
        }
    }
}
