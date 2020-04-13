package mustafaozhan.github.com.mycurrencies.ui.main.fragment.calculator.model

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.github.mustafaozhan.basemob.model.BaseState
import mustafaozhan.github.com.mycurrencies.model.Currency

data class CalculatorState(val observer: CalculatorViewStateObserver) : BaseState() {
    val input: MutableLiveData<String> = observer.input
    val base: MutableLiveData<String> = observer.base
    val currencyList: MutableLiveData<MutableList<Currency>> = MutableLiveData(mutableListOf())
    val output: MutableLiveData<String> = MutableLiveData("")
    val symbol: MutableLiveData<String> = MutableLiveData("")
    val loading: MutableLiveData<Boolean> = MutableLiveData(false)
    val empty: MutableLiveData<Boolean> = MutableLiveData(true)
}

data class CalculatorViewStateObserver(
    val input: MediatorLiveData<String> = MediatorLiveData<String>(),
    val base: MediatorLiveData<String> = MediatorLiveData<String>()
)