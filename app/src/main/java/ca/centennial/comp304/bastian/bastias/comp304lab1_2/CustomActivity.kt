package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class CustomActivity:AppCompatActivity() {

    protected lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textView.text= this::class.java.simpleName.plus(":")
        addMessage("onCreate")
    }

    protected fun addMessage( msg: String){
        textView.text = textView.text.toString().plus("\n").plus(this::class.java.simpleName).plus(" $msg").plus(" executed")
    }

    override fun onStart() {
        super.onStart()
        addMessage("onStart")
    }
    override fun onStop() {
        super.onStop()
        addMessage("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        addMessage("onDestroy")
    }

}