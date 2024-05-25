package com.devartdgo.jitpacktestlibrary.jitpackLibrary

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.devartdgo.jitpacktestlibrary.R
import com.devartdgo.test_library.sampleComponent.defaults.TextStyleDefaults

@Composable
fun TestComposable(
    style: TextStyle = TextStyleDefaults.DefaultText.style,
    color: Color = MaterialTheme.colorScheme.primary
) {
    Text(
        text = stringResource(id = R.string.libraryString),
        style = style,
        color = color
    )
}