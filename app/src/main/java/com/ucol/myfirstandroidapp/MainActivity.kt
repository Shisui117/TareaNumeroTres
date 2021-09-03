package com.ucol.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namet = findViewById<TextView>(R.id.text_1)
        val name = findViewById<EditText>(R.id.date_1)
        val numt = findViewById<TextView>(R.id.text_3)
        val num = findViewById<EditText>(R.id.date_2)
        val button = findViewById<Button>(R.id.go_button)
        button.setOnClickListener {
            if (name.text.isEmpty()){
                Toast.makeText(this, "Write something please", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                namet.text = name.text
        }

        val numero: Int = num.getText().toString().toInt()
        var resultado=0
        var resultado2 =0
        if (numero >= 1 || numero <= 9){
            (numero * 7).also { resultado = it }
        } else {
            if (resultado >= 10 || resultado <= 99){
                var res1=0;
                var res2=0;
                res1 = resultado % 100/10
                res2 = resultado % 10/1
                (res1 + res2).also { resultado2 = it }
            }else{
                 (resultado2 >= 100);
                }

            }
    }
}
