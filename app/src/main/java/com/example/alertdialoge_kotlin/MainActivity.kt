package com.example.alertdialoge_kotlin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity()
{

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById<Button>(R.id.button)

           button.setOnClickListener {

     val builder =AlertDialog.Builder(this)
               //set title for alert dialog
               builder.setTitle("delete messages")
               //set message for alert dialog
               builder.setMessage("welcome back")
               builder.setIcon(android.R.drawable.ic_dialog_alert)
builder.setPositiveButton("Yes"){dialogInterface, which ->
    Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
}
      builder.setNegativeButton("No"){dialogInterface, which ->

          Toast.makeText(applicationContext,"clicked no",Toast.LENGTH_LONG).show()

      }
               //performing cancel action
               builder.setNeutralButton("Cancel"){dialogInterface , which ->
                   Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
               }

       val alertDialog:AlertDialog =builder.create()
               alertDialog.setCancelable(false)
               alertDialog.show()

           }

    }
}
