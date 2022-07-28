package com.neppplus.fragmentpractice_20220728.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragmentpractice_20220728.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment(){

//    Fragment kt파일과 xml을 연결해주는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

//    Fragment의 동작 코드 작성
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        toastBtn.setOnClickListener {
            Toast.makeText(requireContext(), "thirdFrag입니다.", Toast.LENGTH_SHORT).show()
        }
    }

}