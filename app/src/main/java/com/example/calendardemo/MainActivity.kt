package com.example.calendardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showDateRangePicker()
    }

    private fun showDateRangePicker(){
        val dateRangePicker= MaterialDatePicker.Builder.dateRangePicker().setTitleText("Select Date").setTheme(R.style.ThemeOverlay_App_DatePicker).build()

        dateRangePicker.show(
            supportFragmentManager, "Date_Range_Picker"
        )

        dateRangePicker.addOnPositiveButtonClickListener { datePicked->
            val startDate= datePicked.first
            val endDate= datePicked.second

            /* val builderRange = MaterialDatePicker.Builder.dateRangePicker()
             builderRange.set*/

            //  MaterialDatePicker.Builder.dateRangePicker().setTheme(Mater)

            if (startDate!= null && endDate!= null){

               /* binding.tvDateRange.text= "From: "+convertToDate(startDate) +
                        "\n To:"+convertToDate(endDate)*/


            }}
    }

    private fun convertToDate(time: Long): String{
        val date= Date(time)
        val format= SimpleDateFormat(
            "dd-MM-yyyy", Locale.getDefault()
        )
        return format.format(date)
    }
}