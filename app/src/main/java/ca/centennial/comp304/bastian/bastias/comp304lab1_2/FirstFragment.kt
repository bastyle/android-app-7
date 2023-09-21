package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.FragmentFirstBinding

class FirstFragment:Fragment(ca.centennial.comp304.bastian.bastias.comp304lab1_2.R.layout.fragment_first) {
    companion object{
        private const val TAG = "FirstFragment"
    }

    var mobileArray = arrayOf(
        "Android", "IPhone", "WindowsMobile", "Blackberry",
        "WebOS", "Ubuntu", "Windows7", "Max OS X"
    )

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
        // Sample data
        val items = arrayOf<String>("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val items2 = resources.getStringArray(ca.centennial.comp304.bastian.bastias.comp304lab1_2.R.array.activities)
        //Toast.makeText(requireContext(),getString(ca.centennial.comp304.bastian.bastias.comp304lab1_2.R.string.app_name),Toast.LENGTH_LONG).show()
        val adapter = ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_single_choice, items2)

        binding.listView.adapter=adapter
        binding.listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE)
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)


            Toast.makeText(requireContext(),"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }

    }
}