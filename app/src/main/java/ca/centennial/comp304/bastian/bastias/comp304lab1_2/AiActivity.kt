package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.os.Bundle
import android.util.Log
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityAiBinding


class AiActivity:CustomActivity() {
    private lateinit var binding: ActivityAiBinding

    companion object {
        private const val TAG = "ArActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate")
        binding = ActivityAiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.textView = binding.textView
        super.onCreate(savedInstanceState)
        //super.addMessage("onCreate")
    }
// methods on create, start, stop, destroy are called intrinsically using inheritance from the super class CustomActivity

    /*override fun onStart() {
        super.onStart()
        super.addMessage("onStart")
    }

    override fun onStop() {
        super.onStop()
        super.addMessage("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        super.addMessage("onDestroy")
    }*/
}