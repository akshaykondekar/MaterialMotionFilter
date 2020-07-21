package com.core.materialmotionfilter

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.*
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.transition.TransitionManager
import com.core.materialmotionfilter.databinding.ActivityMainBinding
import com.google.android.material.color.MaterialColors
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialFade

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        setClickListeners()
        setRecyclerView()
        binding.fabSort.post {
            val transition = MaterialFade().apply {
                duration = 2000
            }
            TransitionManager.beginDelayedTransition(findViewById(android.R.id.content), transition)
            binding.fabSort.visibility = View.VISIBLE
        }
    }

    private fun setClickListeners() {
        binding.fabSort.setOnClickListener {
            val transition = buildContainerTransformer()

            transition.startView = binding.fabSort
            transition.endView = binding.cvSort

            transition.addTarget(binding.cvSort)

            TransitionManager.beginDelayedTransition(findViewById(android.R.id.content), transition)
            binding.cvSort.visibility = VISIBLE
            binding.fabScrim.visibility = VISIBLE
            binding.fabSort.visibility = GONE
        }

        binding.btnApply.setOnClickListener {
            val transition = buildContainerTransformer()

            transition.startView = binding.cvSort
            transition.endView = binding.fabSort

            transition.addTarget(binding.fabSort)

            TransitionManager.beginDelayedTransition(binding.coordinator, transition)
            binding.cvSort.visibility = GONE
            binding.fabScrim.visibility = GONE
            binding.fabSort.visibility = VISIBLE
        }
    }

    private fun setRecyclerView() {
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
        binding.rvProducts.layoutManager = layoutManager
        binding.rvProducts.adapter = ProductsAdapter(products)
        binding.rvProducts.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        binding.fabSort.show()
                    }
                    else -> {
                        binding.fabSort.hide()
                    }
                }
            }
        })
    }

    private fun buildContainerTransformer() = MaterialContainerTransform().apply {
        containerColor = MaterialColors.getColor(binding.root, R.attr.colorSecondary)
        scrimColor = Color.TRANSPARENT
        duration = 300
        interpolator = FastOutSlowInInterpolator()
        fadeMode = MaterialContainerTransform.FADE_MODE_IN
    }
}