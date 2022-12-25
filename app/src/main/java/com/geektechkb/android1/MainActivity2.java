package com.geektechkb.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private ImageView ivImage;
    ImageView photo;
    String textW = "WhatsApp";
    String textY = "YouTube";
    String textG = "Chrome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivImage = findViewById(R.id.iv_image);
        Bundle argument = getIntent().getExtras();
        String text = argument.getString("text");
        if (argument != null){
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        switch (text){
            case "WhatsApp":
                photo.setImageResource(R.drawable.p);
                break;
            case "YouTube":
                photo.setImageResource(R.drawable.k);
                break;
            case "Chrome":
                photo.setImageResource(R.drawable.t);
                break;
        }
    }
}