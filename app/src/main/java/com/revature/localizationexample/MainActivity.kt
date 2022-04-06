package com.revature.localizationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.revature.localizationexample.ui.theme.LocalizationExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalizationExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextView1()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TextView1() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.description),
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.about_us),
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.tc),
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center
        )

    }
}