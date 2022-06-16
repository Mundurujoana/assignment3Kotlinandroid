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
            tvResult.text=""
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
                if(num1.isBlank()){
                    tilNum1.setError("number is required")
                    return@setOnClickListener
                }

                if(num2.isBlank()){
                    tilNum2.setError("number is required")
                    return@setOnClickListener
                }

                add(num1.toDouble(),num2.toDouble())

            }


        btnSubtract.setOnClickListener {
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            if(num1.isBlank()){
                tilNum1.setError("number is required")
                return@setOnClickListener
            }

            if(num2.isBlank()){
                tilNum2.setError("number is required")
                return@setOnClickListener
            }

        subtract(num1.toDouble(),num2.toDouble())
        }

        btnModulus.setOnClickListener {
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            if(num1.isBlank()){
                tilNum1.setError("number is required")
                return@setOnClickListener
            }

            if(num2.isBlank()){
                tilNum2.setError("number is required")
                return@setOnClickListener
            }

        modulus(num1.toDouble(),num2.toDouble())
        }

        btnDivide.setOnClickListener {
            var num1=etNum1.text.toString()
            var num2=etNum2.text.toString()
            if(num1.isBlank()){
                tilNum1.setError("number is required")
                return@setOnClickListener
            }

            if(num2.isBlank()){
                tilNum2.setError("number is required")
                return@setOnClickListener
            }

        divide(num1.toDouble(),num2.toDouble())
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
