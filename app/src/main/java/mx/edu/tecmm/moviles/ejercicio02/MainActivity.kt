package mx.edu.tecmm.moviles.ejercicio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var mi_Imagen: ImageView; //va a dar el valor más adelante

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mi_Imagen= findViewById(R.id.imageView3);
        val imgRes= R.drawable.dado;
        mi_Imagen.setImageResource(imgRes)
    }



    fun lanzaDado(miVista: View){ //Este tipo de métodps
        val numerito= Random.nextInt(6)+1;
        val numAleatorio: TextView = findViewById(R.id.txtNumero);
        numAleatorio.text=numerito!!.toString();
        val imgRes= when(numerito){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            6 -> R.drawable.dice_6;
            else-> R.drawable.dado;
        }
        mi_Imagen.setImageResource(imgRes);
    }
}