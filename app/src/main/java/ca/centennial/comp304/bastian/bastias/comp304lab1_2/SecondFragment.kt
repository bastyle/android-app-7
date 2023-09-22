package ca.centennial.comp304.bastian.bastias.comp304lab1_2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.FragmentFirstBinding
import ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.FragmentSecondBinding

//class SecondFragment:Fragment(R.layout.fragment_second) {
class SecondFragment:Fragment() {

    companion object{
        private const val TAG = "BottomFragment"
    }



    private lateinit var binding: FragmentSecondBinding
    private lateinit var life_circle_array: ArrayList<String>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ca.centennial.comp304.bastian.bastias.comp304lab1_2.databinding.FragmentSecondBinding.inflate(layoutInflater,container,false)
        life_circle_array= arguments?.getStringArrayList(resources.getString(R.string.life_circle_msg_key)) as ArrayList<String>
        life_circle_array.add(TAG.plus(" onCreateView executed"))
        Toast.makeText(requireActivity(),TAG.plus(" onCreateView executed"), Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        life_circle_array.add(TAG.plus(" onViewCreated executed"))
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(requireActivity(),TAG.plus(" onStart executed"), Toast.LENGTH_SHORT).show()
        if (life_circle_array != null) {
            life_circle_array.forEach {
                //binding.textView1.text= data?.get(1) ?: "nothing"
                binding.textView1.text= binding.textView1.text.toString() + "\n"+it
            }
        }
    }
}