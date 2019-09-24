package com.anand.fragments


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSubmit.setOnClickListener {


            val text = input_box.text.toString()

            if (text.isNotEmpty()) {

                //here we need to show the second fragment
                //so here we will begin another fragment transaction
                //u cant get fragment manager variable from frgagment, so we need activity variable

                //we cant call R.id.frame_layout from this fragment as the layout file belongs to main activity.xml, so we will use the function call
                (activity as MainActivity).replace2ndFrag(text)
            }

        }

        //run it

    }

}
