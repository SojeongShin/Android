package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*class RadioListener : View.OnClickListener {
            override fun onClick(v: View?) {
                if (v == null) return  // v뒤에 ? 사용하지 않는 법
                var sb = StringBuilder()

                when (v.id) {
                    R.id.radioRed -> sb.append((v as RadioButton).text)  // v의 view에서 구체적인 속성 가져올 때
                    R.id.radioBlue -> sb.append((v as RadioButton).text)
                    R.id.radioGreen -> sb.append((v as RadioButton).text)
                }
                sb.append("를 선택했습니다!")
                showToast(sb.toString())
            }
        }

        val radioRed:RadioButton = findViewById(R.id.radioRed)
        val radioBlue:RadioButton = findViewById(R.id.radioBlue)
        val radioGreen:RadioButton = findViewById(R.id.radioGreen)

        when {
            radioRed.isChecked -> showToast("Red 가 기본 선택되어 있습니다.")
            radioBlue.isChecked -> showToast("Blue 가 기본 선택되어 있습니다.")
            radioGreen.isChecked -> showToast("Green 이 기본 선택되어 있습니다.")
        }
        val lis = RadioListener()
        radioRed.setOnClickListener(lis)
        radioBlue.setOnClickListener(lis)
        radioGreen.setOnClickListener(lis)
    }*/

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var id: Int = radioGroup.checkedRadioButtonId
        when (id) {
            R.id.radioRed -> showToast("RED 가 기본 선택")
            R.id.radioBlue -> showToast("BLUE 가 기본 선택")
            R.id.radioGreen -> showToast("GREEN 이 기본 선택")
            else -> showToast(">>> 아무것도 선택되어 있지 않습니다.")
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            var sb = StringBuilder()
            var radioButton: RadioButton = findViewById(checkedId)

            val buttonSelect: Button = findViewById(R.id.buttonSelect)
            buttonSelect.setOnClickListener {
                when(radioGroup.checkedRadioButtonId) {
                    R.id.radioRed -> sb.append("Red 를 선택하셨군요!")
                    R.id.radioBlue-> sb.append("Blue 를 선택하셨군요!")
                    R.id.radioGreen -> sb.append("Green 을 선택하셨군요!")

                }
                showToast(sb.toString())
            }
        }
    }
    fun showToast(msg:String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }

}