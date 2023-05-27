package com.example.testnou.room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.testnou.R;

public class WordsActivity extends AppCompatActivity {

    private TextView textViewWords;

    private WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        getSupportActionBar().hide();

        textViewWords = findViewById(R.id.textViewWords);

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);
        wordViewModel.getAllWords().observe(this, words -> textViewWords.setText(words.toString()));
    }

    public void openAddWordActivityOnClick(View view) {
        Intent intent = new Intent(WordsActivity.this, AddWordActivity.class);
        startActivity(intent);
    }
}