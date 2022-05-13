package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorAtivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var etNumber1:EditText
    lateinit var etNumber2:EditText
    lateinit var tvResult:TextView
    lateinit var btnSubtract:Button
    lateinit var tvResult1:TextView
    lateinit var btnMultiply:Button
    lateinit var tvResult2: TextView
    lateinit var btnModulus:Button
    lateinit var tvResult3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_ativity)
        btnAdd = findViewById(R.id.btnAdd)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvResult=findViewById(R.id.tvResult)
        btnSubtract = findViewById(R.id.btnSubtract)
        tvResult1=findViewById(R.id.tvResult1)
        btnMultiply = findViewById(R.id.btnMultiply)
        tvResult2=findViewById(R.id.tvResult2)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult3=findViewById(R.id.tvResult3)

        btnAdd.setOnClickListener {
            val Number1 = etNumber1.text.toString().toInt()
            val Number2 = etNumber2.text.toString().toInt()
            getResult(Number1,Number2)
        }
        btnSubtract.setOnClickListener{
            val Number1=etNumber1.text.toString().toInt()
            val Number2=etNumber2.text.toString().toInt()
            getResult1(Number1,Number2)
        }
        btnMultiply.setOnClickListener{
            val Number1=etNumber1.text.toString().toInt()
            val Number2=etNumber2.text.toString().toInt()
            getResult2(Number1,Number2)
        }
        btnModulus.setOnClickListener{
            val Number1=etNumber1.text.toString().toInt()
            val Number2=etNumber2.text.toString().toInt()
            getResult3(Number1,Number2)
        }
    }
    fun getResult(Number1:Int,Number2:Int){
        val result=Number1+Number2
        tvResult.text=result.toString()
    }
    fun getResult1(Number1: Int,Number2 :Int){
        val result=Number1-Number2
        tvResult1.text=result.toString()
    }
    fun getResult2(Number1: Int,Number2: Int){
        val result=Number1*Number2
        tvResult2.text=result.toString()
    }
    fun getResult3(Number1: Int,Number2: Int){
        val result=Number1%Number2
        tvResult3.text=result.toString()
    }
    }