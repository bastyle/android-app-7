package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityArBinding


//class ArActivity:AppCompatActivity() {
class ArActivity:CustomActivity() {
    private lateinit var binding:ActivityArBinding

    companion object {
        private const val TAG = "ArActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate")
        binding = ActivityArBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.textView = binding.textView
        super.onCreate(savedInstanceState)
    }

}