package com.geektech.lesson6_1

import android.content.Intent
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
                  binding.etSecond.text
        })

        binding.btnSecond.setOnClickListener {
           // ActivityResultContracts.GetContent(this@SecondActivity, MainActivity::class.java))
            intent=  Intent(this@SecondActivity,MainActivity::class.java)
            intent?.getStringExtra("key");
            setResult(RESULT_OK, intent);
            finish();
        }

    }
}
