package com.example.abouteme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener{
            setNickName(it)
        }
    }

    private fun setNickName(view: View) {
        val nicknameText:TextView=findViewById(R.id.nickname_text)
        val nicknameEdit:EditText=findViewById(R.id.nickname_edit)

        nicknameText.text=nicknameEdit.text
        nicknameEdit.visibility=View.GONE
        nicknameText.visibility=View.VISIBLE
        view.visibility=View.GONE

        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }
}
