package com.ose4g.zurilistviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.databinding.ActivityLoginBinding




class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //login process
        binding.materialButton.setOnClickListener {
            loginProcess()
        }


        //clear error message when the edittext is clicked so helper text can be seen
        binding.emailEditText.setOnClickListener{
            binding.emailInputLayout.error = null
        }


        binding.passwordEditText.setOnClickListener {
            binding.passwordInputLayout2.error = null
        }
    }

    fun loginProcess()
    {
        //checks that email and password are ok
        val condition1 = binding.emailEditText.text.toString().equals(getString(R.string.zuri_email))
        val condition2 = binding.passwordEditText.text.toString().equals(getString(R.string.zuri_password))

        //logs in if both condtions are met
        if(condition1 && condition2) {
            startActivity(Intent(this@LoginActivity, ListViewActivity::class.java))
            finish()
        }
        //shows error message otherwise
        else
        {
            binding.emailInputLayout.error = getString(R.string.email_error_message)
            binding.passwordInputLayout2.error = getString(R.string.password_error_message)
        }
    }


}