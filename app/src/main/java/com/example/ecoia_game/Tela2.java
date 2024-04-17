package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    private Button botaoVoltar;
    private Button botaoContinuar;
    TextView textView2;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        //Navegaçãp
        botaoVoltar = findViewById(R.id.buttonBack);
        textView2 = findViewById(R.id.textView2);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela2.this, MainActivity.class);
                startActivity(in);
            }
        });

        botaoContinuar = findViewById(R.id.buttonCadastrart1);
        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela2.this, Tela3.class);
                startActivity(in);
            }
        });

        showItem(); //Apresentar o nome cadastrado no banco de dados
    }

    //Show user from db
    public void showItem() {
        try {
            db = openOrCreateDatabase("crudapp", MODE_PRIVATE, null);
            String sql = "SELECT nickname FROM nomes WHERE id = (SELECT MAX(id) FROM nomes)";
            Cursor myCursor = db.rawQuery(sql, null);

            if (myCursor.moveToFirst()) {
                String itemName = myCursor.getString(0);
                textView2.setText(itemName);
            } else {
                textView2.setText("Nickname: N/A");
            }

            myCursor.close();
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}