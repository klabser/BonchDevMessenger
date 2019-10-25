package bonch.dev.school.UI.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import bonch.dev.school.UI.fragments.ChatFragmenst
import bonch.dev.school.UI.fragments.PasswordFragment
import bonch.dev.school.UI.fragments.ProfileFragment
import kotlinx.android.synthetic.main.fragment_chat.*

class MainAppActivity : AppCompatActivity() {

    var fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, ChatFragmenst())
            .commit()

    }


    fun replaceProfileFragment() {
        val fragment = ProfileFragment()
        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack("fragment_profile")
            .commit()


    }


    /*fun openPasswordFragment(){
        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_2, PasswordFragment())
            .addToBackStack("fragment_password")
            .commit()
    }*/

        /*fun showDialogWindow(){
            val dialog = PasswordFragment()
            dialog.show(fragmentManager, "PasswordFragment")
        }*/

    /*fun replacePasswordFragment() {
        val fragment = PasswordFragment()
        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack("fragment_password")
            .commit()


    }*/




}

