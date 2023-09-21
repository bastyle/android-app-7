package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firstFragment: FirstFragment

    companion object {
        private const val TAG = "MainActivity Lab 1 Exercise 2"
        public const val MSG_KEY="MSG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        binding = ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firstFragment= FirstFragment()
        val secondFragment= SecondFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()


        fragmentTransaction.add(R.id.fragment_container_1, firstFragment, "FirstFragment")
        fragmentTransaction.add(R.id.fragment_container_2, secondFragment, "SecondFragment")
        fragmentTransaction.commit()
        Toast.makeText(this,"Toast from Activity", Toast.LENGTH_LONG).show()
    }
}