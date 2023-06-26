package com.comst19.chapter3

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toolbar
import com.comst19.chapter3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.tossHomeTolbar.inflateMenu(R.menu.toss_home_tolbar)
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}