package com.example.galeria

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.galeria.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    var licznik = 1
    val jeden = "jesteś na pierwszym zdjęciu"
    val cztery = "jesteś na ostatnim zdjęciu"
    val tJeden = Toast.makeText(activity,jeden,Toast.LENGTH_SHORT)
    val tCztery = Toast.makeText(activity,cztery,Toast.LENGTH_SHORT)
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.ibPrawo.setOnClickListener{
            if(licznik==4){
                tCztery.show()
            }else{
            licznik++
            when(licznik) {
                1 -> binding.imageView.setImageResource(R.drawable.bialy)
                2 -> binding.imageView.setImageResource(R.drawable.zolty)
                3 -> binding.imageView.setImageResource(R.drawable.zloty)
                4 -> binding.imageView.setImageResource(R.drawable.karmazyn)
            }
            }
        }
        binding.ibLewo.setOnClickListener{
            if(licznik==1){
            tJeden.show()
            }else{
            licznik--
            when(licznik) {
                1 -> binding.imageView.setImageResource(R.drawable.bialy)
                2 -> binding.imageView.setImageResource(R.drawable.zolty)
                3 -> binding.imageView.setImageResource(R.drawable.zloty)
                4 -> binding.imageView.setImageResource(R.drawable.karmazyn)
            }
            }
        }


        return binding.root

    }
}

