package com.sertuncselen.gifexample.interfaces

import android.widget.ImageView

interface IImageHelper {
    fun loadGif(targetView: ImageView, resourceId: Int, loopCount: Int)
}