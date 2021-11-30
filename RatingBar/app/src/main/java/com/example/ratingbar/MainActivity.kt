package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
        /*ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(
                applicationContext,
                "평점은 $rating",
                Toast.LENGTH_SHORT
            ).show()
        }*/

        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            var rating = ratingBar.rating.toString()
            val button: Button = findViewById(R.id.button)

            button.setOnClickListener {
                Toast.makeText(
                    applicationContext,
                    "평점은 $rating",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}