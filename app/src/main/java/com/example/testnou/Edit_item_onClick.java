package com.example.testnou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.testnou.recyclerView.MyAdapter;
import com.example.testnou.recyclerView.RecyclerViewInterface;
import com.example.testnou.recyclerView.Trips;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Edit_item_onClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item_on_click);
        getSupportActionBar().hide();

    }

}