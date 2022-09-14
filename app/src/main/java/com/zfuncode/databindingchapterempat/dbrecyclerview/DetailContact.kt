


package com.zfuncode.databindingchapterempat.dbrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zfuncode.databindingchapterempat.R

class DetailContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_contact)

        var getDetail = intent.getSerializableExtra("detail") as Contact
        Log.d("oke", getDetail.toString())
    }

//    https://github.com/enpassio/Databinding/blob/master/DatabindingWithRecyclerViewKotlin/app/src/main/res/layout/item_product.xml
}