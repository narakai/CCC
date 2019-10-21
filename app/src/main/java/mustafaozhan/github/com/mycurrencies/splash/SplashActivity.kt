package mustafaozhan.github.com.mycurrencies.splash

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import mustafaozhan.github.com.mycurrencies.base.activity.BaseActivity
import mustafaozhan.github.com.mycurrencies.main.activity.MainActivity
import mustafaozhan.github.com.mycurrencies.slider.SliderActivity

/**
 * Created by Mustafa Ozhan on 2018-07-20.
 */
class SplashActivity : BaseActivity<SplashActivityViewModel>() {
    override fun getDefaultFragment(): Fragment? = null
    override fun getLayoutResId(): Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(
            Intent(
                this,
                if (viewModel.isSliderShown() == true) {
                    MainActivity::class.java
                } else {
                    SliderActivity::class.java
                }
            )
        )

        finish()
    }
}
