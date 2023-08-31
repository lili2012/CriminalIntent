package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.criminalintent.databinding.FragmentCrimeListBinding

private const val TAG = "CrimeListFragment"
class CrimeListFragment : Fragment(){
    private val crimeListViewModel: CrimeListViewModel by viewModels()
    private var binding: FragmentCrimeListBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total crimes: ${crimeListViewModel.crimes.size}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCrimeListBinding.inflate(inflater, container, false)
        val crimes= crimeListViewModel.crimes
        val adapter = CrimeListAdapter(crimes)
        binding!!.crimeRecyclerView.apply {
            this.adapter = adapter;
            layoutManager = LinearLayoutManager(context)
        }

        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}