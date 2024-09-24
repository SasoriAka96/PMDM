package com.example.elmejorvideojuego

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Creamos un evento para cuando pulsemos un boton se cambie el texto de acuerdo al radio button seleccionado

        findViewById<RadioGroup>(R.id.radioGroup).setOnCheckedChangeListener { _,
                                                                               i ->

            when (i) {

                //Cuando el boton de fallout este seleccionado el textview elegido cambia a "Te gusta el Fallout"

                R.id.radioButtonFallout -> findViewById<TextView>(R.id.textViewCual).text =
                    (getString(R.string.te_gusta_el) + " " + (getString(R.string.fallout)))

                R.id.radioButtonLol -> findViewById<TextView>(R.id.textViewCual).text =
                    (getString(R.string.te_gusta_el) + " " + (getString(R.string.lol)))

                R.id.radioButtonFortnite -> findViewById<TextView>(R.id.textViewCual).text =
                    (getString(R.string.te_gusta_el) + " " + (getString(R.string.fortnite)))

                R.id.radioButtonTf2 -> findViewById<TextView>(R.id.textViewCual).text =
                    (getString(R.string.te_gusta_el) + " " + (getString(R.string.tf2)))
            }

        }

        //Comprobamos que cuando el checkbox de te gusta este seleccionado el textview elegido cambia a "Te gusta"

        findViewById<CheckBox>(R.id.checkBoxTeGusta).setOnClickListener {

            if (findViewById<CheckBox>(R.id.checkBoxTeGusta).isChecked) {
                findViewById<TextView>(R.id.textViewCual).text = (getString(R.string.ckbx_mola))

            } else {
                findViewById<TextView>(R.id.textViewCual).text = (getString(R.string.ckbx_noMola))
            }
        }

    }
}
