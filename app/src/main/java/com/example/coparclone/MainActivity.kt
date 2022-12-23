package com.example.coparclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.coparclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.page_1->{
                    showToast("page_1")
                    true
                }
                R.id.scitka_id->{

                    showToast("scitka_id")
                    true
                }
                R.id.account_id->{

                    showToast("account_id")
                    true
                }
                R.id.favorites_id->{

                    showToast("favorites_id")
                    true
                }
                else->  false
            }

        }
    }
    private fun showToast(s:String){

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}