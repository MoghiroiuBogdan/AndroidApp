package com.example.testnou.room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.testnou.R;
import com.example.testnou.room.Word;
import com.example.testnou.room.WordViewModel;

public class AddWordActivity extends AppCompatActivity {
    private EditText editTextWord;
    private EditText editTextWord1;
    private EditText editTextWord2;
    private Button buttonInsertWord;
    private WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);
        getSupportActionBar().hide();

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);

        editTextWord = findViewById(R.id.editTextWord);
        editTextWord1 = findViewById(R.id.editTextText);
        editTextWord2 = findViewById(R.id.editTextText2);
        buttonInsertWord = findViewById(R.id.buttonSave);
        buttonInsertWord.setOnClickListener(v -> {
            String word = editTextWord.getText().toString();
            String word1 = editTextWord1.getText().toString();
            String word2 = editTextWord2.getText().toString();
            wordViewModel.insert(new Word(word, word1, word2));
            openWordsActivity();
        });
    }

    private void openWordsActivity() {
        Intent intent = new Intent(AddWordActivity.this, WordsActivity.class);
        startActivity(intent);
    }
}