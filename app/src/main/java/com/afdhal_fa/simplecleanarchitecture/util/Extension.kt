package com.afdhal_fa.simplecleanarchitecture.util

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

fun ImageView.load(url: String) {
    Glide.with(this.context)
        .load(url)
        .thumbnail(0.3f)
        .placeholder(ColorDrawable(Color.LTGRAY))
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions.fitCenterTransform())
        .into(this)
}

@BindingAdapter("loadImage")
fun loadPortraitImage(view: ImageView, imageUrl: String?) {
    if (imageUrl.isNullOrEmpty()) return

    val url = "https://image.tmdb.org/t/p/w185/$imageUrl"

    Glide.with(view.context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .thumbnail(0.2f)
        .placeholder(ColorDrawable(Color.LTGRAY))
        .into(view)
}
