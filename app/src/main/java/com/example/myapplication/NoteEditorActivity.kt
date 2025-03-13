package com.example.myapplication


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NoteEditorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_editor)

        val titleEditText: EditText = findViewById(R.id.titleEditText)
        val contentEditText: EditText = findViewById(R.id.contentEditText)
        val charCountTextView: TextView = findViewById(R.id.charCountTextView)
        val saveButton: Button = findViewById(R.id.saveButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)

        contentEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                charCountTextView.text = "Characters: ${s?.length ?: 0}"
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        saveButton.setOnClickListener {
            // Save logic (e.g., add to list or database)
            finish()
        }

        cancelButton.setOnClickListener {
            finish()
        }
    }
}
