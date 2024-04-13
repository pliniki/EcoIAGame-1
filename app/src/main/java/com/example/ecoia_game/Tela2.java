package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {
    private Button botaoVoltar;
    private Button botaoContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        //Navegaçãp
        botaoVoltar = findViewById(R.id.buttonBack);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela2.this, MainActivity.class);
                startActivity(in);
            }
        });

        botaoContinuar = findViewById(R.id.buttonGo);
        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela2.this, Tela3.class);
                startActivity(in);
            }
        });
    }
}