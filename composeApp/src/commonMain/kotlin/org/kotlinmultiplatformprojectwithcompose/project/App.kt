package org.kotlinmultiplatformprojectwithcompose.project


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import resourcesharinginkotlinmultiplatform.composeapp.generated.resources.Res
import resourcesharinginkotlinmultiplatform.composeapp.generated.resources.language

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = stringResource(Res.string.language))


        }
    }
}