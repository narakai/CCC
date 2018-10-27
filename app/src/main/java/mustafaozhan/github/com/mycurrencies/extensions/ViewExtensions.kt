package mustafaozhan.github.com.mycurrencies.extensions

import android.annotation.SuppressLint
import android.view.animation.AnimationUtils
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.jaredrummler.materialspinner.MaterialSpinner
import mustafaozhan.github.com.mycurrencies.R

/**
 * Created by Mustafa Ozhan on 2018-07-20.
 */
fun ImageView.setBackgroundByName(name: String) {
    when (name) {
        "AED" -> this.setImageResource(R.drawable.aed)
        "AFN" -> this.setImageResource(R.drawable.afn)
        "ALL" -> this.setImageResource(R.drawable.all)
        "AMD" -> this.setImageResource(R.drawable.amd)
        "ANG" -> this.setImageResource(R.drawable.ang)
        "AOA" -> this.setImageResource(R.drawable.aoa)
        "ARS" -> this.setImageResource(R.drawable.ars)
        "AUD" -> this.setImageResource(R.drawable.aud)
        "AWG" -> this.setImageResource(R.drawable.awg)
        "AZN" -> this.setImageResource(R.drawable.azn)
        "BAM" -> this.setImageResource(R.drawable.bam)
        "BBD" -> this.setImageResource(R.drawable.bbd)
        "BDT" -> this.setImageResource(R.drawable.bdt)
        "BGN" -> this.setImageResource(R.drawable.bgn)
        "BHD" -> this.setImageResource(R.drawable.bhd)
        "BIF" -> this.setImageResource(R.drawable.bif)
        "BMD" -> this.setImageResource(R.drawable.bmd)
        "BND" -> this.setImageResource(R.drawable.bnd)
        "BOB" -> this.setImageResource(R.drawable.bob)
        "BRL" -> this.setImageResource(R.drawable.brl)
        "BSD" -> this.setImageResource(R.drawable.bsd)
        "BTC" -> this.setImageResource(R.drawable.btc)
        "BTN" -> this.setImageResource(R.drawable.btn)
        "BWP" -> this.setImageResource(R.drawable.bwp)
        "BYN" -> this.setImageResource(R.drawable.byn)
        "BYR" -> this.setImageResource(R.drawable.byr)
        "BZD" -> this.setImageResource(R.drawable.bzd)
        "CAD" -> this.setImageResource(R.drawable.cad)
        "CDF" -> this.setImageResource(R.drawable.cdf)
        "CHF" -> this.setImageResource(R.drawable.chf)
        "CLF" -> this.setImageResource(R.drawable.clf)
        "CLP" -> this.setImageResource(R.drawable.clp)
        "CNY" -> this.setImageResource(R.drawable.cny)
        "COP" -> this.setImageResource(R.drawable.cop)
        "CRC" -> this.setImageResource(R.drawable.crc)
        "CUC" -> this.setImageResource(R.drawable.cuc)
        "CUP" -> this.setImageResource(R.drawable.cup)
        "CVE" -> this.setImageResource(R.drawable.cve)
        "CZK" -> this.setImageResource(R.drawable.czk)
        "DJF" -> this.setImageResource(R.drawable.djf)
        "DKK" -> this.setImageResource(R.drawable.dkk)
        "DOP" -> this.setImageResource(R.drawable.dop)
        "DZD" -> this.setImageResource(R.drawable.dzd)
        "EGP" -> this.setImageResource(R.drawable.egp)
        "ERN" -> this.setImageResource(R.drawable.ern)
        "ETB" -> this.setImageResource(R.drawable.etb)
        "EUR" -> this.setImageResource(R.drawable.eur)
        "FJD" -> this.setImageResource(R.drawable.fjd)
        "FKP" -> this.setImageResource(R.drawable.fkp)
        "GBP" -> this.setImageResource(R.drawable.gbp)
        "GEL" -> this.setImageResource(R.drawable.gel)
        "GGP" -> this.setImageResource(R.drawable.ggp)
        "GHS" -> this.setImageResource(R.drawable.ghs)
        "GIP" -> this.setImageResource(R.drawable.gip)
        "GMD" -> this.setImageResource(R.drawable.gmd)
        "GNF" -> this.setImageResource(R.drawable.gnf)
        "GTQ" -> this.setImageResource(R.drawable.gtq)
        "GYD" -> this.setImageResource(R.drawable.gyd)
        "HKD" -> this.setImageResource(R.drawable.hkd)
        "HNL" -> this.setImageResource(R.drawable.hnl)
        "HRK" -> this.setImageResource(R.drawable.hrk)
        "HTG" -> this.setImageResource(R.drawable.htg)
        "HUF" -> this.setImageResource(R.drawable.huf)
        "IDR" -> this.setImageResource(R.drawable.idr)
        "ILS" -> this.setImageResource(R.drawable.ils)
        "IMP" -> this.setImageResource(R.drawable.imp)
        "INR" -> this.setImageResource(R.drawable.inr)
        "IQD" -> this.setImageResource(R.drawable.iqd)
        "IRR" -> this.setImageResource(R.drawable.irr)
        "ISK" -> this.setImageResource(R.drawable.isk)
        "JEP" -> this.setImageResource(R.drawable.jep)
        "JMD" -> this.setImageResource(R.drawable.jmd)
        "JOD" -> this.setImageResource(R.drawable.jod)
        "JPY" -> this.setImageResource(R.drawable.jpy)
        "KES" -> this.setImageResource(R.drawable.kes)
        "KGS" -> this.setImageResource(R.drawable.kgs)
        "KHR" -> this.setImageResource(R.drawable.khr)
        "KMF" -> this.setImageResource(R.drawable.kmf)
        "KPW" -> this.setImageResource(R.drawable.kpw)
        "KRW" -> this.setImageResource(R.drawable.krw)
        "KWD" -> this.setImageResource(R.drawable.kwd)
        "KYD" -> this.setImageResource(R.drawable.kyd)
        "KZT" -> this.setImageResource(R.drawable.kzt)
        "LAK" -> this.setImageResource(R.drawable.lak)
        "LBP" -> this.setImageResource(R.drawable.lbp)
        "LKR" -> this.setImageResource(R.drawable.lkr)
        "LRD" -> this.setImageResource(R.drawable.lrd)
        "LSL" -> this.setImageResource(R.drawable.lsl)
        "LTL" -> this.setImageResource(R.drawable.ltl)
        "LVL" -> this.setImageResource(R.drawable.lvl)
        "LYD" -> this.setImageResource(R.drawable.lyd)
        "MAD" -> this.setImageResource(R.drawable.mad)
        "MDL" -> this.setImageResource(R.drawable.mdl)
        "MGA" -> this.setImageResource(R.drawable.mga)
        "MKD" -> this.setImageResource(R.drawable.mkd)
        "MMK" -> this.setImageResource(R.drawable.mmk)
        "MNT" -> this.setImageResource(R.drawable.mnt)
        "MOP" -> this.setImageResource(R.drawable.mop)
        "MRO" -> this.setImageResource(R.drawable.mro)
        "MUR" -> this.setImageResource(R.drawable.mur)
        "MVR" -> this.setImageResource(R.drawable.mvr)
        "MWK" -> this.setImageResource(R.drawable.mwk)
        "MXN" -> this.setImageResource(R.drawable.mxn)
        "MYR" -> this.setImageResource(R.drawable.myr)
        "MZN" -> this.setImageResource(R.drawable.mzn)
        "NAD" -> this.setImageResource(R.drawable.nad)
        "NGN" -> this.setImageResource(R.drawable.ngn)
        "NIO" -> this.setImageResource(R.drawable.nio)
        "NOK" -> this.setImageResource(R.drawable.nok)
        "NPR" -> this.setImageResource(R.drawable.npr)
        "NZD" -> this.setImageResource(R.drawable.nzd)
        "OMR" -> this.setImageResource(R.drawable.omr)
        "PAB" -> this.setImageResource(R.drawable.pab)
        "PEN" -> this.setImageResource(R.drawable.pen)
        "PGK" -> this.setImageResource(R.drawable.pgk)
        "PHP" -> this.setImageResource(R.drawable.php)
        "PKR" -> this.setImageResource(R.drawable.pkr)
        "PLN" -> this.setImageResource(R.drawable.pln)
        "PYG" -> this.setImageResource(R.drawable.pyg)
        "QAR" -> this.setImageResource(R.drawable.qar)
        "RON" -> this.setImageResource(R.drawable.ron)
        "RSD" -> this.setImageResource(R.drawable.rsd)
        "RUB" -> this.setImageResource(R.drawable.rub)
        "RWF" -> this.setImageResource(R.drawable.rwf)
        "SAR" -> this.setImageResource(R.drawable.sar)
        "SBD" -> this.setImageResource(R.drawable.sbd)
        "SCR" -> this.setImageResource(R.drawable.scr)
        "SDG" -> this.setImageResource(R.drawable.sdg)
        "SEK" -> this.setImageResource(R.drawable.sek)
        "SGD" -> this.setImageResource(R.drawable.sgd)
        "SHP" -> this.setImageResource(R.drawable.shp)
        "SLL" -> this.setImageResource(R.drawable.sll)
        "SOS" -> this.setImageResource(R.drawable.sos)
        "SRD" -> this.setImageResource(R.drawable.srd)
        "STD" -> this.setImageResource(R.drawable.std)
        "SVC" -> this.setImageResource(R.drawable.svc)
        "SYP" -> this.setImageResource(R.drawable.syp)
        "SZL" -> this.setImageResource(R.drawable.szl)
        "THB" -> this.setImageResource(R.drawable.thb)
        "TJS" -> this.setImageResource(R.drawable.tjs)
        "TMT" -> this.setImageResource(R.drawable.tmt)
        "TND" -> this.setImageResource(R.drawable.tnd)
        "TOP" -> this.setImageResource(R.drawable.top)
        "TRY" -> this.setImageResource(R.drawable.tryy)
        "TTD" -> this.setImageResource(R.drawable.ttd)
        "TWD" -> this.setImageResource(R.drawable.twd)
        "TZS" -> this.setImageResource(R.drawable.tzs)
        "UAH" -> this.setImageResource(R.drawable.uah)
        "UGX" -> this.setImageResource(R.drawable.ugx)
        "USD" -> this.setImageResource(R.drawable.usd)
        "UYU" -> this.setImageResource(R.drawable.uyu)
        "UZS" -> this.setImageResource(R.drawable.uzs)
        "VEF" -> this.setImageResource(R.drawable.vef)
        "VND" -> this.setImageResource(R.drawable.vnd)
        "VUV" -> this.setImageResource(R.drawable.vuv)
        "WST" -> this.setImageResource(R.drawable.wst)
        "XAF" -> this.setImageResource(R.drawable.xaf)
        "XAG" -> this.setImageResource(R.drawable.xag)
        "XAU" -> this.setImageResource(R.drawable.xau)
        "XCD" -> this.setImageResource(R.drawable.xcd)
        "XDR" -> this.setImageResource(R.drawable.xdr)
        "XOF" -> this.setImageResource(R.drawable.xof)
        "XPF" -> this.setImageResource(R.drawable.xpf)
        "YER" -> this.setImageResource(R.drawable.yer)
        "ZAR" -> this.setImageResource(R.drawable.zar)
        "ZMK" -> this.setImageResource(R.drawable.zmk)
        "ZMW" -> this.setImageResource(R.drawable.zmw)
        "ZWL" -> this.setImageResource(R.drawable.zwl)
        "transparent" -> this.setImageResource(R.drawable.transparent)
        else -> this.setImageResource(R.drawable.transparent)
    }
}

@SuppressLint("SetTextI18n")
fun TextView.addText(text: String) {
    this.text = this.text.toString() + text
}

fun AdView.loadAd(adId: Int) {
    MobileAds.initialize(context, resources.getString(adId))
    val adRequest = AdRequest.Builder().build()
    this.loadAd(adRequest)
}

fun WebView.fadeIO(isIn: Boolean) {
    if (isIn)
        this.startAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_in))
    else
        this.startAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_out))
}

fun MaterialSpinner.setSelectedIndex(lastUsed: Boolean, base: String) {
    if (lastUsed)
        this.selectedIndex = this.getItems<String>().indexOf("LAST USED")
    else
        this.selectedIndex = this.getItems<String>().indexOf(base)
}