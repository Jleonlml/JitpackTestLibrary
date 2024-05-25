package com.devartdgo.test_library.sampleComponent.defaults

import android.graphics.fonts.FontStyle
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

enum class TextStyleDefaults(val style: TextStyle) {
    DefaultText(TextStyle(fontSize = TextSizes.Default.size, color = Color.Black)),
    Error(TextStyle(fontSize = TextSizes.Big.size, color = Color.Red))
}

enum class TextSizes(val size: TextUnit) {
    Default(18.sp),
    Medium(20.sp),
    Big(30.sp),

    LineHeightDefault(16.sp)
}
