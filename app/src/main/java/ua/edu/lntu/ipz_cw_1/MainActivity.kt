package ua.edu.lntu.ipz_cw_1

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.ipz_cw_1.ui.theme.IPZ_CW_1_Martyniuk_IlliaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_Martyniuk_IlliaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFFE0E0E0)),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.android_logo),
                            contentDescription = ""
                        )
                        Text(text = "Illya Martyniuk", style = MaterialTheme.typography.bodyLarge)
                        Text(text = "Backend developer", style = MaterialTheme.typography.bodySmall)
                    }

                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.ic_phone),
                                contentDescription = ""
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "+380 99 999 99 99",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
//                        Row {
//                            Text(text = "Email: ", style = MaterialTheme.typography.bodySmall)
//                            Text(text = "
//                    }
                    }
                }
            }
        }
    }
}