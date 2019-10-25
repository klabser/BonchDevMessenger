package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity
import kotlinx.android.synthetic.main.fragment_chat.*

class ChatFragmenst : Fragment() {
    private lateinit var buttonToProfile: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        buttonToProfile = view.findViewById(R.id.send_message_button)

        buttonToProfile.setOnClickListener({
            (context as MainAppActivity).replaceProfileFragment()
        })

        return view
    }


}

