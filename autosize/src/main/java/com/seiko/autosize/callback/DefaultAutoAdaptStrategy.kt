package com.seiko.autosize.callback

import android.app.Activity
import android.content.res.Configuration
import com.seiko.autosize.AutoSize
import com.seiko.autosize.AutoSizeConfig

open class DefaultAutoAdaptStrategy(
    private val designWidthInDp: Float = 360f,
    private val designHeightInDp: Float = 640f
) : AutoAdaptStrategy {

    override fun apply(target: Any, activity: Activity) {
        val isVertical = activity.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT
        if (isVertical) {
            AutoSize.autoConvertDensity(activity, designWidthInDp, AutoSizeConfig.screenWidth)
        } else {
            AutoSize.autoConvertDensity(activity, designHeightInDp, AutoSizeConfig.screenHeight)
        }
    }
}