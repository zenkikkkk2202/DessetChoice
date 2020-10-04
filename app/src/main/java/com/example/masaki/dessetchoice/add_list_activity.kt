package com.example.masaki.dessetchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_add_list_activity.*

class add_list_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_list_activity)

        val db = FirebaseFirestore.getInstance()
        val TAG = ""



        add_list.setOnClickListener{
            val listname = edit_listname.text.toString()
            val dessert1 = edit_dessert1.text.toString()
            val dessert2 = edit_dessert2.text.toString()
            val dessert3 = edit_dessert3.text.toString()
            val dessert4 = edit_dessert4.text.toString()
            val dessert5 = edit_dessert5.text.toString()

            val list = hashMapOf(
                "listname" to listname,
                "dessert1" to dessert1,
                "dessert2" to dessert2,
                "dessert3" to dessert3,
                "dessert4" to dessert4,
                "dessert5" to dessert5
            )

            db.collection("lists")
                .add(list)
                .addOnSuccessListener { documentReference ->
                    Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.w(TAG, "Error adding document", e)
                }

        }

    }
}