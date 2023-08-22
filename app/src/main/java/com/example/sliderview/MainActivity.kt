package com.example.sliderview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sliderview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.fear1,
            R.drawable.fear2,
            R.drawable.fear3,
            R.drawable.fear4,
            R.drawable.fear5,
            R.drawable.fear6,
            R.drawable.fear7,
            R.drawable.fear8,
            R.drawable.fear9
        )

        val sliderAdapter = ImagePagerAdapter(images)
        binding.viewPager.adapter = sliderAdapter
    }
}