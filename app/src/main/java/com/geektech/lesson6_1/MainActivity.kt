package com.geektech.lesson6_1

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat.startActivityForResult
import com.geektech.lesson6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            initClick()
        }
       fun initClick() {
        binding.btnFirst.setOnClickListener {
            intent = Intent(this@MainActivity, SecondActivity::class.java)
            if (binding.btnFirst.text.isEmpty()) {
                Toast.makeText(
                    this,
                    getString(R.string.The_field_must_not_be_empty),
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                intent.putExtra("key", binding.btnFirst.text.toString())
            }

        }
    }
}



