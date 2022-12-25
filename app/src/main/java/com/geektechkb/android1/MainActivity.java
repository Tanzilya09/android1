package com.geektechkb.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etText;
    private Button button;
    String text = "WhatsApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = findViewById(R.id.et_text);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etText.getText().toString().trim();
                if (text.isEmpty()){
                    etText.setError("Заполни поле");
                }else {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("text",text);
                    startActivity(intent);
                }
            }
        });
        Log.e("lifecycle", "onClick: ");
    }
}