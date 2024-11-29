package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
            //criar uma variavel e associar o componente de UI<EditText>
            //recuperar o botao da tela

        //Colocar acao no botao setOnClickListener
        //recyoerar o texto digitado no edt peso

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String =  edtaltura.text.toString()
            if (pesoStr == "" || alturaStr == "") {
                //mostrar mensagem pro usuario
                Snackbar.make(
                    edtpeso,
                    "preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()


                val alturaq2 = altura * altura
                val resultado = peso / alturaq2

                println("o seu imc eh " + resultado)
            }
        }
    }
}