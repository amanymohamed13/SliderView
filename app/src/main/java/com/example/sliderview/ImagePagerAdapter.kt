package com.example.sliderview
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sliderview.databinding.ImageContainerBinding


class ImagePagerAdapter(private val images: List<Int>) :
    RecyclerView.Adapter<ImagePagerAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val binding = ImageContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SliderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bind(images[position])
    }

    override fun getItemCount(): Int = images.size

    inner class SliderViewHolder(private val binding: ImageContainerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(imageResId: Int) {
            binding.imageView.setImageResource(imageResId)
        }
    }
}