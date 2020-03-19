package mustafaozhan.github.com.mycurrencies.ui.slider

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.viewpager.widget.ViewPager
import mustafaozhan.github.com.basemob.activity.BaseViewBindingActivity
import mustafaozhan.github.com.mycurrencies.R
import mustafaozhan.github.com.mycurrencies.data.preferences.PreferencesRepository
import mustafaozhan.github.com.mycurrencies.databinding.ActivitySliderBinding
import mustafaozhan.github.com.mycurrencies.ui.main.activity.MainActivity
import mustafaozhan.github.com.scopemob.whether
import javax.inject.Inject

class SliderActivity : BaseViewBindingActivity<ActivitySliderBinding>() {

    companion object {
        const val SLIDE_SIZE = 4
        const val TEXT_SIZE = 36f
        const val HTML_DOT_CODE = "&#8226;"
    }

    @Inject
    lateinit var preferencesRepository: PreferencesRepository

    override fun bind() {
        binding = ActivitySliderBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

        addBottomDots(0)
        changeStatusBarColor()
        setListeners()
    }

    private fun setListeners() {

        binding.viewPager.apply {
            adapter = SliderPagerAdapter(applicationContext)
            addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

                override fun onPageSelected(position: Int) {
                    addBottomDots(position)

                    binding.btnNext.text = if (position == SLIDE_SIZE - 1) {
                        getString(R.string.got_it)
                    } else {
                        getString(R.string.next)
                    }
                }

                override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) = Unit
                override fun onPageScrollStateChanged(arg0: Int) = Unit
            })
        }

        binding.btnNext.setOnClickListener {
            getNextItem()
                .whether { it < SLIDE_SIZE }
                ?.let { binding.viewPager.currentItem = it }
                ?: run { launchMainActivity() }
        }
    }

    private fun addBottomDots(currentPage: Int) {
        binding.layoutDots.removeAllViews()
        val dots = arrayListOf<TextView>().apply {
            repeat(SLIDE_SIZE) {
                add(TextView(applicationContext))
            }
        }

        dots.forEach { textView ->
            textView.text = HtmlCompat.fromHtml(HTML_DOT_CODE, HtmlCompat.FROM_HTML_MODE_LEGACY)
            textView.textSize = TEXT_SIZE
            textView.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark))
            binding.layoutDots.addView(textView)
        }

        if (dots.size > 0) {
            dots[currentPage].setTextColor(ContextCompat.getColor(applicationContext, R.color.colorPrimaryLight))
        }
    }

    private fun getNextItem() = binding.viewPager.currentItem.inc()

    private fun launchMainActivity() {
        binding.progressBar.visibility = View.VISIBLE
        preferencesRepository.updateMainData(sliderShown = true)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }
}