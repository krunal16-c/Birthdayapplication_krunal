package com.example.birthdayapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// so while making this app i was not able to import
// nameInput so what i did was added kotlin extension plugin  to my build.gradle and after that
//import kotlinx.android.synthetic.main.activity_main.* imported this by presing alt+enter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        createBir

    }


    fun createBirthdayButton(view: View) {

          val name = nameInput.editableText.toString()
          val intent = Intent(this,BirthdayGreeting::class.java) //for going from one screen to another
          intent.putExtra(BirthdayGreeting.NAME_EXTRA,name)
          startActivity(intent)

//        Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show()
    }
}