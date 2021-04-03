package id.my.arieftb.threadexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import id.my.arieftb.threadexample.model.UsersResponse
import kotlinx.android.synthetic.main.activity_network_example.*
import org.json.JSONObject

class NetworkExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network_example)

        buttonNetworkStart.setOnClickListener {
            getUsers()
        }
    }

    private fun getUsers() {
        val client = AsyncHttpClient()
        val url = "https://reqres.in/api/users?page=2"
        client.get(url, object : AsyncHttpResponseHandler() {
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
            ) {
                val userResponse =
                    Gson().fromJson(String(responseBody!!), UsersResponse::class.java)
                Log.d("ILT7", "onSuccess: ${userResponse.data}")
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
            ) {
                if (statusCode == 401) {
                    Toast.makeText( this@NetworkExampleActivity, "Unauthorized", Toast.LENGTH_SHORT).show()
                }
                Log.d("ITL7", "onSuccess: ${String(responseBody!!)}")
            }

        })
    }
}