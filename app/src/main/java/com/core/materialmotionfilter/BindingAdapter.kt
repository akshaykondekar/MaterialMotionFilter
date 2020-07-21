package com.core.materialmotionfilter

import android.graphics.Paint
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.textview.MaterialTextView

@BindingAdapter("image_url")
fun imageUrl(imageView: ImageView, url : String){
    Glide.with(imageView)
        .load(url)
        .into(imageView)
}

@BindingAdapter("strike_thru")
fun strikeThru(materialTextView: MaterialTextView, isStrike : Boolean){
    when {
        isStrike -> {
            materialTextView.paintFlags = materialTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
    }
}