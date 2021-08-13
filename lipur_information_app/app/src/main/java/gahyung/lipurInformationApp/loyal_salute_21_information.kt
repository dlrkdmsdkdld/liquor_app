package gahyung.lipurInformationApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loyal_salute_21_information.*

class loyal_salute_21_information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loyal_salute_21_information)

        btn_back_loyal_salute_21.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}