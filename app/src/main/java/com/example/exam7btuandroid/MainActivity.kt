package simplifiedcoding.net.kotlinretrofittutorial.activities
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.exam7btuandroid.R
import ... |

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R. layout.activity_main)
        buttonSignUp. setOnClickListener {


            val email = editTextEmail. text.toString().trin()

            val password = editTextPassword.text.toString().trim() ;


            if(email.isEmpty()){
                editTextEmail.error = “Email required” }

            editTextEmail. requestFocus() ;
            return@set0nClickListener

        }

        if(password. isempty ()){
            editTextPassword.error = "Password is required"
            editTextPassword.requestFocus()
            return@setOnClickListener
        }
