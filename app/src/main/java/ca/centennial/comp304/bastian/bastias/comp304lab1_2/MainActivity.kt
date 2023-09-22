package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firstFragment: FirstFragment
    private lateinit var secondFragment: SecondFragment

    companion object {
        private const val TAG = "MainActivity"
        public const val MESSAGES_KEY="LIFE_CIRCLE_MSG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate:::::")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firstFragment= FirstFragment()
        secondFragment= SecondFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        //
        val bundle = Bundle()
        val items = arrayListOf<String>(resources.getString(R.string.second_fragment_title),TAG.plus(" onCreate executed"))
        //bundle.putStringArrayList(MESSAGES_KEY, items)
        bundle.putStringArrayList(resources.getString(R.string.life_circle_msg_key), items)
        secondFragment.arguments=bundle

        fragmentTransaction.add(R.id.fragment_container_1, firstFragment, "FirstFragment")
        fragmentTransaction.add(R.id.fragment_container_2, secondFragment, "SecondFragment")
        fragmentTransaction.commit()
        //Toast.makeText(this,"Toast from Activity", Toast.LENGTH_LONG).show()
    }
}