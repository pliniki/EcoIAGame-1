package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela9 extends AppCompatActivity {

    private ImageView garbageRed;
    private ImageView garbageGreen;
    private ImageView garbageMarron;
    private ImageView garbageWhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela9);

        garbageRed = findViewById(R.id.garbageRed2);
        garbageGreen = findViewById(R.id.garbageGreen2);
        garbageMarron = findViewById(R.id.garbageMarron2);
        garbageWhite = findViewById(R.id.garbageWhite2);

        garbageRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela9.this, Tela4.class);
                startActivity(in);
            }
        });
        garbageGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela9.this, Tela4.class);
                startActivity(in);
            }
        });
        garbageMarron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela9.this, Tela4.class);
                startActivity(in);
            }
        });
        garbageWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela9.this, Tela10.class);
                startActivity(in);
            }
        });
    }
}