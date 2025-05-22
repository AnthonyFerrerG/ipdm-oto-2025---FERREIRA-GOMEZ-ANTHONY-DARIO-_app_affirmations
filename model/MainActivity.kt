package com.example.affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.affirmations.data.Datasource
import com.example.affirmations.ui.AffirmationList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                AffirmationList(affirmationList = Datasource().loadAffirmations())
            }
        }
    }
}
