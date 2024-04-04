package com.example.poker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.poker.R;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Button toNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent myIntent  = new Intent(MainActivity.this, RankNumPad.class);
        String[] suit_list = new String[]{Character.toString((char)9830),Character.toString((char)9829),Character.toString((char)9824),Character.toString((char)9827)};
        Spinner suit_dropdown = findViewById(R.id.suit_spinner);
        ArrayAdapter<String> suit_adapter =new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,suit_list);
        suit_dropdown.setAdapter(suit_adapter);
        toNext = findViewById(R.id.go_to_numpad);
        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RankNumPad.class));
            }
        });
    }
}