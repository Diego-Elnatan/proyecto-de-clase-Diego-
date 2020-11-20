package com.example.proyectodeclase

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultado : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)
        val LbEH = findViewById<TextView>(R.id.Lb1)
        val LbEM = findViewById<TextView>(R.id.Lb2)
        val LbSH = findViewById<TextView>(R.id.Lb3)
        val LbSM = findViewById<TextView>(R.id.Lb4)
        val LbTH = findViewById<TextView>(R.id.Lb5)
        val LbTC = findViewById<TextView>(R.id.Lb6)
        var HEntrada = intent.getStringExtra("Hora de Entrada")
        var MEntrada = intent.getStringExtra("Minuto de Entrada")
        var HSalida = intent.getStringExtra("Hora de Salida")
        var MSalida = intent.getStringExtra("Minuto de Salida")
        var Hfinal  = intent.getIntExtra("Total de Horas", 0)
        var TCostos = intent.getIntExtra("Costo total", 0)
        LbEH.text = HEntrada.toString()
        LbEM.text = MEntrada.toString()
        LbSH.text = HSalida.toString()
        LbSM.text = MSalida.toString()
        LbTH.text = Hfinal.toString()
        LbTC.text = TCostos.toString()

    }

}
