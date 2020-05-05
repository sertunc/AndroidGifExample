package com.sertuncselen.gifexample

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sertuncselen.gifexample.helpers.GlideImageHelper

class MainActivity : AppCompatActivity() {

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.imageView)

        val imageHelper = GlideImageHelper(this)
        imageHelper.loadGif(img, R.drawable.untitled, 0)
    }
}
