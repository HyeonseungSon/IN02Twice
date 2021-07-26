package com.hyeonseungson.in02twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // postDelayed() : 대기 후 진행
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            // Splash Activity 종료
            finish()
            // 3초 뒤에 Main Activity 로 이동
        }, 3000)
    }
}