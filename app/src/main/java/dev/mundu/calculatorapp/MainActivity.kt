package dev.mundu.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.pm.ShortcutXmlParser
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var  etNum1:TextInputEditText
    lateinit var tilNum2:TextInputLayout
    lateinit var  etNum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1 = findViewById(R.id.tilNum1)
        etNum1 = findViewById(R.id.etNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivide = findViewById(R.id.btnDivide)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1=etNum1.text.toString().toDouble()
            var num2=etNum2.text.toString().toDouble()
            add(num1,num2)
        }

        btnSubtract.setOnClickListener {
            var num1=etNum1.text.toString().toDouble()
            var num2=etNum2.text.toString().toDouble()
            subtract(num1,num2)
        }

        btnModulus.setOnClickListener {
            var num1=etNum1.text.toString().toDouble()
            var num2=etNum2.text.toString().toDouble()
            modulus(num1,num2)
        }

        btnDivide.setOnClickListener {
            var num1=etNum1.text.toString().toDouble()
            var num2=etNum2.text.toString().toDouble()
            divide(num1,num2)
        }

    }
    fun add(num1:Double,num2:Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun subtract(num1:Double,num2:Double){
        var total=num1-num2
        tvResult.text=total.toString()
    }
    fun modulus(num1:Double,num2:Double){
        var total=num1%num2
        tvResult.text=total.toString()
    }
    fun divide(num1:Double,num2:Double){
        var total=num1/num2
        tvResult.text=total.toString()
    }
}