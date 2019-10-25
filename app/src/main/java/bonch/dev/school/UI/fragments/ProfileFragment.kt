package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity

class ProfileFragment: Fragment() {

    private lateinit var buttonToPassword: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        buttonToPassword = view.findViewById(R.id.change_password_button)
        buttonToPassword.setOnClickListener({
            (context as MainAppActivity).showDialogWindow()
        })
        /*buttonToPassword.setOnClickListener({
            (context as MainAppActivity).openPasswordFragment()
        })*/
        /*buttonToPassword.setOnClickListener({

            (context as MainAppActivity).replacePasswordFragment()
        })*/
        return view

    }
}