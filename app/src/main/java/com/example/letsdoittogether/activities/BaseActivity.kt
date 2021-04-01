package com.example.letsdoittogether.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.letsdoittogether.R
import com.google.android.material.snackbar.Snackbar


 open class BaseActivity : AppCompatActivity() {

     fun showErrorSnackBar(message:String,errorMassage:Boolean ){
         val snackBar =
             Snackbar.make(findViewById(android.R.id.content),message,Snackbar.LENGTH_LONG)
                 val snackBarView = snackBar.view

                if (errorMassage){
                    snackBarView.setBackgroundColor(
                            ContextCompat.getColor(
                                    this, R.color.colorSnackBarError
                            )
                    )
                }else{
                    snackBarView.setBackgroundColor(
                            ContextCompat.getColor(
                                    this,R.color.colorSnackBarSuccess
                    ) )

                }
          snackBar.show()

     }


}