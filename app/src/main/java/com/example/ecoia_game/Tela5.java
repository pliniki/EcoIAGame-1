package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5 extends AppCompatActivity {

    private Button botaoContinuar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela5);

        //Navegaçãp
        botaoContinuar3 = findViewById(R.id.buttonGo3);
        botaoContinuar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela5.this, Tela7.class);
                startActivity(in);
            }
        });
    }


}