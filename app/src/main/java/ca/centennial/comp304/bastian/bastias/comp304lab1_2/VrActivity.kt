package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.os.Bundle
import android.util.Log
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityArBinding
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityVrBinding

class VrActivity:CustomActivity() {
    private lateinit var binding: ActivityVrBinding

    companion object {
        private const val TAG = "VrActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate")
        binding = ActivityVrBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // set the textview referencing the super class CustomActivity
        super.textView = binding.textView
        super.onCreate(savedInstanceState)
    }
    // methods on create, start, stop, destroy are called intrinsically using inheritance
}