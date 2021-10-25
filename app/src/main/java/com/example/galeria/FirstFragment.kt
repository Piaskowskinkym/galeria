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
import android.provider.MediaStore

import android.content.Intent




/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    var licznik = 1
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.checkBox.setOnClickListener {
            if(binding.checkBox.isChecked()){
                binding.imageView.setVisibility(View.INVISIBLE)
            }else{
                binding.imageView.setVisibility(View.VISIBLE)
            }
        }
        binding.ibKamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        }

        binding.ibPrawo.setOnClickListener{

            licznik++
            when(licznik) {
                1 -> binding.imageView.setImageResource(R.drawable.bialy)
                2 -> binding.imageView.setImageResource(R.drawable.zolty)
                3 -> binding.imageView.setImageResource(R.drawable.zloty)
                4 -> binding.imageView.setImageResource(R.drawable.karmazyn)

            }
        }
        binding.ibLewo.setOnClickListener{

            licznik--
            when(licznik) {
                1 -> binding.imageView.setImageResource(R.drawable.bialy)
                2 -> binding.imageView.setImageResource(R.drawable.zolty)
                3 -> binding.imageView.setImageResource(R.drawable.zloty)
                4 -> binding.imageView.setImageResource(R.drawable.karmazyn)
            }

        }


        return binding.root

    }
}

