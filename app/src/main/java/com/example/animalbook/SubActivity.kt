package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animalbook.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    private lateinit var title: TitleFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
                setContentView(binding.root)

        binding.lionButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, LionFragment())
                addToBackStack(null)
                commit()
            }
        }

        binding.hippoButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, HppoFragment())
                addToBackStack(null)
                commit()
            }
        }

        binding.girraffeButon.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, GiraffeFragment())
                addToBackStack(null)
                commit()
            }
        }

    }
}