package com.zfuncode.databindingchapterempat.dbrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.zfuncode.databindingchapterempat.R
import com.zfuncode.databindingchapterempat.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity(), ContactAdapter.ItemClickListener {

    lateinit var binding : ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contact)

        val listkontak = arrayListOf(
            Contact("Eliezer", "72654",R.drawable.girl),
            Contact("Ferdi Sambo", "346273",R.drawable.oke),
            Contact("Yoshua", "43634232",R.drawable.girl),
            Contact("Kuat Maruf", "573463",R.drawable.oke),
            Contact("RIcky Rizal", "36436",R.drawable.girl)
        )

        binding.rvContact.adapter= ContactAdapter(listkontak, this)
        binding.rvContact.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }

    override fun onItemClicked(detail: Contact) {
        var pindah = Intent(this, DetailContact::class.java)
        pindah.putExtra("detail",detail)
        startActivity(pindah)
    }


//    override fun onKlik(dataitem: Contact) {
//        var pindah = Intent(this, DetailContact::class.java)
//        pindah.putExtra("detailcontact", dataitem)
//        startActivity(pindah)
//    }
}