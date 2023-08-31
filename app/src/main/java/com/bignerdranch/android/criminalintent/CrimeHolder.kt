package com.bignerdranch.android.criminalintent

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.criminalintent.databinding.ListItemCrimeBinding

class CrimeHolder(private val binding: ListItemCrimeBinding): RecyclerView.ViewHolder(binding.root) {
    fun populate(crime: Crime){
        binding.crimeTitle.text = crime.title
        binding.crimeDate.text = crime.date.toString()
        binding.crimeSolved.visibility=if(crime.isSolved){
            View.VISIBLE
        }else{
            View.GONE
        }
        binding.root.setOnClickListener{
            Toast.makeText(
                binding.root.context, "${crime.title} clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}