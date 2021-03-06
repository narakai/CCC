/*
 * Copyright (c) 2021 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.ccc.backend.controller

import com.github.mustafaozhan.ccc.common.db.OfflineRatesDao
import com.github.mustafaozhan.ccc.common.entity.CurrencyResponseEntity

class RootingController(private val offlineRatesDao: OfflineRatesDao) {
    fun getOfflineCurrencyResponseByBase(base: String): CurrencyResponseEntity? =
        offlineRatesDao.getOfflineCurrencyResponseByBase(base)
}
