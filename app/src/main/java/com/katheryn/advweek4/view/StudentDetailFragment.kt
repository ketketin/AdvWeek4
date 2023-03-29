package com.katheryn.advweek4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.katheryn.advweek4.R
import com.katheryn.advweek4.viewmodel.DetailViewModel
import com.katheryn.advweek4.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_student_detail.*
import kotlinx.android.synthetic.main.student_list_item.*
import kotlinx.android.synthetic.main.student_list_item.txtID
import kotlinx.android.synthetic.main.student_list_item.txtName

class StudentDetailFragment : Fragment() {
    private lateinit var viewModel: DetailViewModel

    fun observeViewModel(){
        viewModel.studentLD.observe(viewLifecycleOwner, Observer {
            txtID.setText(it.id)
            txtName.setText(it.name)
            txtBod.setText(it.bod)
            txtPhone.setText(it.phone)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        viewModel.fetch()

        observeViewModel()
    }


}