package com.core.materialmotionfilter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.core.materialmotionfilter.databinding.CvProductItemBinding

class ProductsAdapter(private val products : List<Products>)
    : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
    private val set = ConstraintSet()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        CvProductItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))

    override fun getItemCount() = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
            = holder.bind(products[position])

    inner class ViewHolder(val binding : CvProductItemBinding)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(products: Products) {
            binding.product = products
        }
    }
}