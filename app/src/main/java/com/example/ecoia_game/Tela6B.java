package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela6B extends AppCompatActivity {

    private ImageView garbageRed;
    private ImageView garbageGreen;
    private ImageView garbageMarron;
    private ImageView garbageWhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela6b);

        garbageRed = findViewById(R.id.garbageRed);
        garbageGreen = findViewById(R.id.garbageGreen);
        garbageMarron = findViewById(R.id.garbageMarron);
        garbageWhite = findViewById(R.id.garbageWhite);

        garbageRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela6B.this, Tela5.class);
                startActivity(in);
            }
        });
        garbageGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela6B.this, Tela4.class);
                startActivity(in);
            }
        });
        garbageMarron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela6B.this, Tela4.class);
                startActivity(in);
            }
        });
        garbageWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela6B.this, Tela4.class);
                startActivity(in);
            }
        });
    }
}