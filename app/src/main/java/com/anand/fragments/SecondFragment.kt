package com.anand.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */

//actually I am in a corporate office right now, so cant talk loudly
//I will show u this things...u can practise
class SecondFragment : Fragment() {

    //lateinit means we will initialize the variable later on
    private lateinit var text: String

    companion object {

        //this will create a instance of SecondFragment
        //the variable will be pushed in the bundle
        fun newInstance(text: String): SecondFragment {
            val f = SecondFragment()
            val b = Bundle()
            b.putString("text", text)
            f.arguments = b
            return f
        }

    }

    //see for fragemnts, we have written a lot of code right,
    //if we use navigation graph, then only 2-3 lines of code required
    //all of these not needed


    //after the fragment is oncreated, we can retrieve the variables
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        text = arguments?.getString("text")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView.text = text

    }

}
