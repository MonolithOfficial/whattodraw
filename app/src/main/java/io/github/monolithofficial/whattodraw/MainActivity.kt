package io.github.monolithofficial.whattodraw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val animalArray = listOf("elephant", "giraffe", "cat", "walrus", "wombat")
        val descriptionArray = listOf("excellent", "tall", "crazy", "spoopy", "scary")
        val colorArray = listOf("black", "white", "indigo", "red", "crimson", "grey")
        val verbArray = listOf("dying", "dancing", "reading", "biting", "speaking", "coding")

        generateBtn.setOnClickListener {
            val rnds = (0..4).random()

            val animal = animalArray.get(index = rnds)
            val desc = descriptionArray.get(index = rnds)
            val color = colorArray.get(index =rnds)
            val verb = verbArray.get(index = rnds)
            val generatedText = "$animal $desc $color $verb"
            btn1.text = animal
            btn2.text = desc
            btn3.text = color
            btn4.text = verb
        }
        btn1.setOnClickListener {
            val rnds2 = (0..4).random()
            btn1.text = animalArray.get(index = rnds2)
        }
    }


}
