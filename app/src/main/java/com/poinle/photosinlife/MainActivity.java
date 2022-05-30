package com.poinle.photosinlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_library(View view) {
        startActivity(new Intent(MainActivity.this, LibraryActivity.class));
    }

    public void Video(View view) {
        Toast.makeText(this, "You don't have video", Toast.LENGTH_SHORT).show();
    }

    public void Trash(View view) {
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
    }
}