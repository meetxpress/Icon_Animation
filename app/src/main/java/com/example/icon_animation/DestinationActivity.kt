package com.example.icon_animation

import android.content.Intent
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_destination.*

class DestinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)
        //val drawable: Drawable = done.drawable
        if (done.drawable is Animatable) {
            (done.drawable as Animatable).start()
            if(!(done.drawable as Animatable).isRunning){
                Handler().postDelayed({
                    startActivity(Intent(this@DestinationActivity, MainActivity::class.java))
                },1000)
            }
        }
    }
}
