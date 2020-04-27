// Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
package mustafaozhan.github.com.mycurrencies.util

import android.app.Activity
import android.app.AlertDialog
import com.github.mustafaozhan.scopemob.inCase
import mustafaozhan.github.com.mycurrencies.R

@Suppress("LongParameterList")
fun showDialog(
    activity: Activity,
    title: String,
    description: String,
    positiveButton: String,
    cancelable: Boolean = true,
    function: () -> Unit = {}
) {
    if (!activity.isFinishing) {
        AlertDialog
            .Builder(activity, R.style.AlertDialogCustom)
            .setIcon(R.mipmap.ic_launcher)
            .setTitle(title)
            .setMessage(description)
            .setPositiveButton(positiveButton) { _, _ -> function() }
            .setCancelable(cancelable)
            .inCase(cancelable) { setNegativeButton(activity.getString(R.string.cancel), null) }
            .show()
    }
}

@Suppress("LongParameterList")
fun showDialog(
    activity: Activity,
    title: Int,
    description: Int,
    positiveButton: Int,
    cancelable: Boolean = true,
    function: () -> Unit = {}
) {
    if (!activity.isFinishing) {
        AlertDialog
            .Builder(activity, R.style.AlertDialogCustom)
            .setIcon(R.mipmap.ic_launcher)
            .setTitle(activity.getString(title))
            .setMessage(activity.getString(description))
            .setPositiveButton(activity.getText(positiveButton)) { _, _ -> function() }
            .setCancelable(cancelable)
            .inCase(cancelable) { setNegativeButton(activity.getString(R.string.cancel), null) }
            .show()
    }
}