package com.amou.guess_homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var secret = Random().nextInt(100)+1
    var numbers = 1
    var numberl = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_secret2.setText(secret.toString())
        button_guess2.setOnClickListener {
            var number = ed_number2.text.toString().toInt()
            var message = "你猜對了 秘密數字就是$secret"

            if (number<secret){
                message = "請猜${number+1}~${numberl}"
                numbers = number+1
            }else if(number>secret){
                message = "請猜${numbers}~${number-1}"
                numberl = number-1
            }
            AlertDialog.Builder(this)
                .setTitle("GUESS")
                .setMessage(message)
                .setPositiveButton("OK",null)
                .show()

        }
    }
}
