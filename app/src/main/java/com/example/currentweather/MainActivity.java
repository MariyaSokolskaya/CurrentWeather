package com.example.currentweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText cityText;
    AppCompatButton loadButton;
    TextView tempText, pressureText, huminityText, descripText, speedText, sunriseText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityText = findViewById(R.id.city);
        loadButton = findViewById(R.id.load);
        tempText = findViewById(R.id.temp);
        pressureText = findViewById(R.id.pressure);
        huminityText = findViewById(R.id.huminity);
        descripText = findViewById(R.id.decription);
        speedText = findViewById(R.id.speed);
        sunriseText = findViewById(R.id.sunrise);

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}