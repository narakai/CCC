// Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
package mustafaozhan.github.com.mycurrencies.ui.main.calculator.model

import com.github.mustafaozhan.basemob.model.BaseEvent
import mustafaozhan.github.com.mycurrencies.model.Currency

interface CalculatorEvent : BaseEvent {

    fun onKeyPress(key: String)

    fun onItemClick(currency: Currency, conversion: String)

    fun onItemLongClick(currency: Currency): Boolean

    fun onBarClick()

    fun onSpinnerItemSelected(base: String)
}