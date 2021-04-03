package id.my.arieftb.threadexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonMainBackgroundExample.setOnClickListener {
            Intent(this, BackgroundExampleActivity::class.java).also {
                startActivity(it)
            }
        }

        buttonMainNetworkExample.setOnClickListener {
            Intent(this, NetworkExampleActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}