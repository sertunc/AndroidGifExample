package com.sertuncselen.gifexample.helpers

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.sertuncselen.gifexample.interfaces.IImageHelper

class GlideImageHelper(context: Context) : IImageHelper {

    private val mGlideInstance = Glide.with(context)

    override fun loadGif(targetView: ImageView, resourceId: Int, loopCount: Int) {
        mGlideInstance
            .load(resourceId)
            .into(GifDrawableImageViewTarget(targetView, loopCount))
    }
}