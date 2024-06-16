package com.smbvt.bst.reels.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.smbvt.bst.reels.R
import com.smbvt.bst.reels.ui.theme.fonts.AnimatedText

@Composable
fun MainScreen(onClickViewReels: () -> Unit = {}) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(modifier = Modifier.align(Alignment.Center), onClick = { onClickViewReels() }) {
            AnimatedText(text = stringResource(id = R.string.view_reels))
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}