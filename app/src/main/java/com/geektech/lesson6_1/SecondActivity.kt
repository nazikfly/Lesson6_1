package com.geektech.lesson6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import com.geektech.lesson6_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ActivityResultLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent(), ActivityResultCallback {
                  binding.etSecond.setText(it)
        })

        binding.btnSecond.setOnClickListener {
            ActivityResultContracts.GetContent(this@SecondActivity, MainActivity::class.java))
        }

    }
}
