package com.example.coffeecheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkAmericano:CheckBox = findViewById(R.id.checkAmericano)
        val checkLatte:CheckBox = findViewById(R.id.checkLatte)
        val checkDecaf:CheckBox = findViewById(R.id.checkDecaf)

        val buttonPay: Button = findViewById(R.id.buttonPay)
        buttonPay.setOnClickListener {
            var sb = StringBuilder()  // 스트링빌더는 마음대로 문자열을 추가 가능
            // 선택하지 않았을 때
            if (!checkAmericano.isChecked && !checkLatte.isChecked && !checkDecaf.isChecked) {
                sb.append(" Nothing selected. Plz order AGAIN! ")
            }
            // 단일선택 시 is
            else if (checkAmericano.isChecked && !checkLatte.isChecked && !checkDecaf.isChecked){
                sb.append("Americano ")
                sb.append("is ordered, Thanks! ")
            }
            else if (!checkAmericano.isChecked && checkLatte.isChecked && !checkDecaf.isChecked){
                sb.append("Latte ")
                sb.append("is ordered, Thanks! ")
            }
            else if (!checkAmericano.isChecked && !checkLatte.isChecked && checkDecaf.isChecked){
                sb.append("Decaf ")
                sb.append("is ordered, Thanks! ")
            }
            // 복수 선택 시 are
            else {
                if (checkAmericano.isChecked) sb.append("Americano ")
                if (checkLatte.isChecked) sb.append("Latte ")
                if (checkDecaf.isChecked) sb.append("and Decaf ")
                sb.append("are ordered. Thanks! ")
            }
            // Toast로 팝업 알림창 
            Toast.makeText(applicationContext,
                sb.toString(),
                Toast.LENGTH_SHORT).show()
        }
    }
}
