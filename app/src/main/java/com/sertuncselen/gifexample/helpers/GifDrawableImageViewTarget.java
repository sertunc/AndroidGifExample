package com.sertuncselen.gifexample.helpers;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;

public class GifDrawableImageViewTarget extends ImageViewTarget<Drawable> {

    private int mLoopCount;

    public GifDrawableImageViewTarget(ImageView view, int loopCount) {
        super(view);
        mLoopCount = loopCount;
    }

    @Override
    protected void setResource(Drawable resource) {
        if (resource instanceof GifDrawable) {
            if (mLoopCount > 0) {
                ((GifDrawable) resource).setLoopCount(mLoopCount);
            }
        }
        view.setImageDrawable(resource);
    }
}
