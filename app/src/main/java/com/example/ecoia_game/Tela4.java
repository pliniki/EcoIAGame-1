package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {

    private Button botaoContinuar2;
    private Button buttonVoltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela4);

        //Navegaçãp
        botaoContinuar2 = findViewById(R.id.buttonGo2);

        botaoContinuar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela4.this, Tela5.class);
                startActivity(in);
            }
        });

        buttonVoltar3 = findViewById(R.id.buttonBack3);

        buttonVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela4.this, Tela3.class);
                startActivity(in);
            }
        });
    }
}