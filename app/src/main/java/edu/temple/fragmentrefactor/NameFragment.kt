package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false).apply {
            findViewById<Button>(R.id.changeButton).setOnClickListener {
                val name = findViewById<EditText>(R.id.nameEditText).text

                findViewById<TextView>(R.id.displayTextView).text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }
    }


}