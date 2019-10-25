package bonch.dev.school.UI.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        sign_in_button.setOnClickListener {
            val intent = Intent(SignInActivity@this, MainAppActivity::class.java)
            startActivity(intent)

        }

        sign_up_button.setOnClickListener {
            val intent = Intent(SignUpActivity@this, MainAppActivity::class.java)
            startActivity(intent)

        }

    }
}
