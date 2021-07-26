package com.hyeonseungson.in02twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        // Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        val numberImage = findViewById<ImageView>(R.id.numberImageArea)

        if (getData == "1") {
            numberImage.setImageResource(R.drawable.one)
        }
        if (getData == "2") {
            numberImage.setImageResource(R.drawable.two)
        }
        if (getData == "3") {
            numberImage.setImageResource(R.drawable.three)
        }
        if (getData == "4") {
            numberImage.setImageResource(R.drawable.four)
        }
        if (getData == "5") {
            numberImage.setImageResource(R.drawable.five)
        }
        if (getData == "6") {
            numberImage.setImageResource(R.drawable.six)
        }
        if (getData == "7") {
            numberImage.setImageResource(R.drawable.seven)
        }
        if (getData == "8") {
            numberImage.setImageResource(R.drawable.eight)
        }
        if (getData == "9") {
            numberImage.setImageResource(R.drawable.nine)
        }

    }
}