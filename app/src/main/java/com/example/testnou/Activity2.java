package com.example.testnou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        Example_Items example_items = intent.getParcelableExtra("example item");

        int imageRes = example_items.getmImageResource();

        ImageView imageView = findViewById(R.id.image_activity2);
        imageView.setImageResource(imageRes);
    }
}