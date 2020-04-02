package com.example.ktempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    private lateinit var valorTempEditText: EditText
    private lateinit var celciusRadioButton: RadioButton
    private lateinit var fahreinheitRadioButton: RadioButton
    private lateinit var converterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valorTempEditText = findViewById(R.id.valorTempEditText)
        celciusRadioButton = findViewById(R.id.celciusRadioButton)
        fahreinheitRadioButton = findViewById(R.id.fahreinheitRadioButton)
        converterButton = findViewById(R.id.converterButton)

        converterButton.setOnClickListener { converter(it) }
    }

    fun converter(view: View){
        var temp: Double = valorTempEditText.text.toString().toDouble()

        if (celciusRadioButton.isChecked){
            temp = (temp - 32) * 5/9
        } else if (fahreinheitRadioButton.isChecked){
            temp = (temp * 9/5) + 32
        }

        valorTempEditText.setText(temp.toString())
    }
}
