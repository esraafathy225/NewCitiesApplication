package com.example.newcitiesapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.navigationapp.CityAdapter
import com.example.newcitiesapplication.databinding.ActivityMainBinding
import com.example.newcitiesapplication.databinding.FragmentCitiesBinding
import com.example.newcitiesapplication.ui.theme.NewCitiesApplicationTheme

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // 4  main components
        // Activity   Services   Broadcast receiver   content provider

        // Intent




        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.floatingActionButton.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/plain"

            intent.putExtra(Intent.EXTRA_EMAIL, "esraa.fathy225@gmail.com")
            intent.putExtra(Intent.EXTRA_TEXT, "How are you?")


            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }


        }

    }
}