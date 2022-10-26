package com.example.myradiocheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick_RadioButton(view: View) {
        val imageViewFruit: ImageView = findViewById(R.id.imageViewFruit)
        when (view.id) {
            R.id.RBapple -> {
                imageViewFruit.setImageResource(R.drawable.yabloko)
            }
            R.id.RBpear -> {
                imageViewFruit.setImageResource(R.drawable.grusha)
            }
            R.id.RBgrape -> {
                imageViewFruit.setImageResource(R.drawable.vinohrad)
            }
        }
    }

    fun onClick_ChakedBoxes(view: View) {
        when (view.id) {
            R.id.checkBoxApple -> {
                val imageViewApple: ImageView = findViewById(R.id.imageViewApple)
                val checkBox: CheckBox = findViewById(R.id.checkBoxApple)
                if (checkBox.isChecked == true) {
                    imageViewApple.setImageResource(R.drawable.yabloko)

                } else {
                    imageViewApple.setImageResource(0)
                }
            }
            R.id.checkBoxPear -> {
                val imageViewPear: ImageView = findViewById(R.id.imageViewPear)
                val checkBox: CheckBox = findViewById(R.id.checkBoxPear)
                if (checkBox.isChecked == true) {
                    imageViewPear.setImageResource(R.drawable.grusha)

                } else {
                    imageViewPear.setImageResource(0)
                }
            }
            R.id.checkBoxGrape -> {
                val imageViewGrape: ImageView = findViewById(R.id.imageViewGrape)
                val checkBox: CheckBox = findViewById(R.id.checkBoxGrape)
                if (checkBox.isChecked == true) {
                    imageViewGrape.setImageResource(R.drawable.vinohrad)

                } else {
                    imageViewGrape.setImageResource(0)
                }
            }


        }
    }
}
