package id.my.arieftb.threadexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_background_example.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BackgroundExampleActivity : AppCompatActivity() {

    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_example)

        buttonBackgroundCheck.setOnClickListener {
            doBackgroundProcessCheck()
        }

        buttonBackgroundStart.setOnClickListener {
            doBackgroundProcessExample()
        }
    }


    private fun doBackgroundProcessExample() {

        lifecycleScope.launch {
            for (i in 0 .. 10) {
                isRunning = true
                delay(1000)
                Log.d("ILT-7", "doBackgroundProcessExample: $i")
            }

            isRunning = false
        }
    }

    private fun doBackgroundProcessCheck() {
        if (isRunning) {
            Toast.makeText(this, "Background Process is Running", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Background Process is Finish", Toast.LENGTH_SHORT).show()
        }
    }
}