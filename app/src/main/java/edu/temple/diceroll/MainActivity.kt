package edu.temple.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Fragment created using factory method and added dynamically using fragmentTransaction
        // argument is the number of sides the die will have
        if(savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .add(R.id.diceFragmentContainer, DiceFragment.newInstance(6))
                .commit()
    }
}