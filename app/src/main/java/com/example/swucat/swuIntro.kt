package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class swuIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swu_intro)

        title="슈냥이 소개"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.cat1 -> {
                val intent = Intent(this, swucat1::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat2 -> {
                val intent = Intent(this, swucat2::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat3 -> {
                val intent = Intent(this, swucat3::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat4 -> {
                val intent = Intent(this, swucat4::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat5 -> {
                val intent = Intent(this, swucat5::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat6 -> {
                val intent = Intent(this, swucat6::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

