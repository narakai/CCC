// Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
package mustafaozhan.github.com.mycurrencies.ui.main.settings.model

import com.github.mustafaozhan.basemob.model.BaseEvent
import mustafaozhan.github.com.mycurrencies.model.Currency

interface SettingsEvent : BaseEvent {
    fun onSelectDeselectButtonsClick(value: Int)

    fun onItemClick(currency: Currency)
}