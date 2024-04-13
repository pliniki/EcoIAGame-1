package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    private Button botaoVermelho;
    private Button botaoAmarelo;
    private Button botaoPreto;
    private Button botaoVerde;
    private Button botaoAzul;
    private Button botaoLaranja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela3);

        //Navegaçãp
        botaoVermelho = findViewById(R.id.buttonRed);

        botaoVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela6.class);
                startActivity(in);
            }
        });

        botaoAmarelo = findViewById(R.id.buttonYellow);
        botaoAmarelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela4.class);
                startActivity(in);
            }
        });

        botaoPreto = findViewById(R.id.buttonBlack);
        botaoPreto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela4.class);
                startActivity(in);
            }
        });

        botaoVerde = findViewById(R.id.buttonGreen);
        botaoVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela4.class);
                startActivity(in);
            }
        });

        botaoAzul= findViewById(R.id.buttonBlue);
        botaoAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela4.class);
                startActivity(in);
            }
        });
        botaoLaranja= findViewById(R.id.buttonOrange);
        botaoLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela4.class);
                startActivity(in);
            }
        });
        botaoLaranja= findViewById(R.id.buttonBack2);
        botaoLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3.this, Tela2.class);
                startActivity(in);
            }
        });
    }
}