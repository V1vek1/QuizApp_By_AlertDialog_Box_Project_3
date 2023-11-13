package com.helllo.quizappbydialogboxproject3

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.helllo.quizappbydialogboxproject3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btn1.setOnClickListener {
            val sweet = arrayOf("Gulab jamun", "Rasmallai", "Kaju katli") //Maine yha "Array" bnaya "arrayOf"
            // function ki help se
            val builder2 = AlertDialog.Builder(this)

            builder2.setTitle("Which one is Your Favorite sweet?")  //phir maine "AlertBox 2" ko tittle" diya

            //Yaha maine "sweet" name ke Array ko '0' se initialize karke pass kiya h, phir code kiya ki btao User
            //ne kya Click kiya h
            builder2.setSingleChoiceItems(sweet, 0, DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when "yes" is clicked ?

                Toast.makeText(this, "You clicked on ${sweet[which]}", Toast.LENGTH_SHORT).show()
            })

            //What action should be performed when "Submit" is Clicked ?
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //Yha mai kuch nahi kar rha hu Submit per Click krwane ke baad
            })

            //What action should be performed when "Decline" is Clicked ?
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })

            //Yha per maine "Alert Dialogue Box" ko dikhane ke liye code likha
            builder2.show()

        }




        binding.btn2.setOnClickListener {

            val sweet = arrayOf("Gulab jamun", "Rasmallai", "Kaju katli") //Maine yha "Array" bnaya "arrayOf"
            // function ki help se

            val builder2 = AlertDialog.Builder(this)

            builder2.setTitle("Which are the Your Favorite sweet?")  //phir maine "AlertBox 2" ko tittle" diya

            //Yaha maine "sweet" name ke Array ko 'null' se initialize karke pass kiya h, phir code kiya ki btao User
            //ne kya kya Select kiya h
            builder2.setMultiChoiceItems(sweet, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

                Toast.makeText(this, "You clicked on ${sweet[which]}", Toast.LENGTH_SHORT).show()
            })

            //What action should be performed when "Submit" is Clicked ?
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //Yha mai kuch nahi kar rha hu Submit per Click krwane ke baad
            })

            //What action should be performed when "Decline" is Clicked ?
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })

            //Yha per maine "Alert Dialogue Box" ko dikhane ke liye code likha
            builder2.show()
        }




        binding.btn3.setOnClickListener {
            val subject = arrayOf("DSA", "OOPS", "Computer Network", "DBMS", "Operating System", "Software Engineering") //Maine yha "Array" bnaya "arrayOf"
            // function ki help se
            val builder2 = AlertDialog.Builder(this)

            builder2.setTitle("Which are the Your Favorite subjects?")  //phir maine "AlertBox 2" ko tittle" diya

            //Yaha maine "subject" name ke Array ko '0' se initialize karke pass kiya h, phir code kiya ki btao User
            //ne kya Click kiya h
            builder2.setMultiChoiceItems(subject, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

                Toast.makeText(this, "You clicked on ${subject[which]}", Toast.LENGTH_SHORT).show()
            })

            //What action should be performed when "Submit" is Clicked ?
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //Yha mai kuch nahi kar rha hu Submit per Click krwane ke baad
            })

            //What action should be performed when "Decline" is Clicked ?
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })

            //Yha per maine "Alert Dialogue Box" ko dikhane ke liye code likha
            builder2.show()

        }





//Abb mujhe "findViewByID" ka use nahi karna pad rha h kyuki maine "View Binding" ka Code Likh diya h
        binding.btn4.setOnClickListener {
            val builder1 = AlertDialog.Builder(this) //Yha per maine ek Variable bnaya h, "builder1" name ka
            // jisme ek "AlertDialog" Class bna h

            builder1.setTitle("Are You Sure")   //maine jo "Alert Dialog" bnaya h usko maine "Tittle" diya h yha per
            builder1.setMessage("Do you want to Close the App?")   //maine jo "Alert Dialog" bnaya h usko maine "message" diya h yha per
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)  //maine jo "Alert Dialog" bnaya h usko maine "Icon" diya h yha per



            //What action should be performed when "Yes" is Clicked ?
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->

                finish() //isse App Close Jho jayega
            })

            //What action should be performed when "No" is Clicked ?
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->

            })

            //Yha per maine "Alert Dialogue Box" ko dikhane ke liye code likha
            builder1.show()

        }

    }
}