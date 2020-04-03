package com.duanpham.navigationdrawer

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_inbox.*


class InboxFragment : Fragment() {

    private lateinit var mContext: Context
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inbox, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonAddSensor.setOnClickListener() { view ->
            Log.d("Button Add Sensor", "Selected")
            val dialogView = LayoutInflater.from(mContext).inflate(R.layout.add_sensor, null)
            val builder = AlertDialog.Builder(mContext)
            builder.setView(dialogView).show()
        }

        buttonRemoveFan.setOnClickListener() { view ->
            Log.d("Button Remove fan", "Selected")
            val dialogView = LayoutInflater.from(mContext).inflate(R.layout.remove_fan, null)
            val builder = AlertDialog.Builder(mContext)
            builder.setView(dialogView).show()
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
}
