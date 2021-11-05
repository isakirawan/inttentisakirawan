package com.isak.inttentisakirawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnMoveFirstPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        btnMoveFirstPage=findViewById(R.id.btn_move_first_page)
        btnMoveFirstPage.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null)
            when(v.id){
                R.id.btn_move_first_page->run{
                    val intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }
            }
    }
}