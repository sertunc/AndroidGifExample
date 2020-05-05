package com.sertuncselen.gifexample.helpers

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.target.ImageViewTarget
import com.sertuncselen.gifexample.interfaces.IImageHelper

class GlideImageHelper(context: Context) : IImageHelper {

    private val mGlideInstance = Glide.with(context)

    override fun loadGif(targetView: ImageView, resourceId: Int, loopCount: Int) {
        mGlideInstance
            .load(resourceId)
            .into(GifDrawableImageViewTarget(targetView, loopCount))
    }
}

class GifDrawableImageViewTarget(view: ImageView?, private val mLoopCount: Int) :
    ImageViewTarget<Drawable?>(view) {

    override fun setResource(resource: Drawable?) {
        if (resource is GifDrawable) {
            if (mLoopCount > 0) {
                resource.setLoopCount(mLoopCount)
            }
        }
        view.setImageDrawable(resource)
    }
}