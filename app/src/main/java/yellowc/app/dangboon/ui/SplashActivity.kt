package yellowc.app.dangboon.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import yellowc.app.dangboon.R
import yellowc.app.dangboon.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}