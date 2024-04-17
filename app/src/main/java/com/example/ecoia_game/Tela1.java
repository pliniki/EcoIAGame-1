package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {
    EditText editTextNomeCompleto;
    EditText editTextNickName;
    Button buttonCadastrart1;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);

        editTextNomeCompleto = findViewById(R.id.editTextNomeCompleto);
        editTextNickName = findViewById(R.id.editTextNickName);
        buttonCadastrart1 = findViewById(R.id.buttonCadastrart1);
        createDb();

        buttonCadastrart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarUsuario();
            }
        });
    }
    public void createDb() {
        try {
            db = openOrCreateDatabase("crudapp", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS nomes(" + " id INTEGER PRIMARY KEY " +
                    "AUTOINCREMENT" + ", nome VARCHAR) "+", nickname VARCHAR");
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarUsuario() {
        if (!TextUtils.isEmpty(editTextNomeCompleto.getText().toString()) && !TextUtils.isEmpty(editTextNickName.getText().toString())) {
            try {
                db = openOrCreateDatabase("crudapp", MODE_PRIVATE, null);
                String sql = "CREATE TABLE IF NOT EXISTS nomes (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, nickname TEXT)";
                db.execSQL(sql);
                String sqlInsert = "INSERT INTO nomes (nome, nickname) VALUES(?, ?)";
                SQLiteStatement stmt = db.compileStatement(sqlInsert);
                stmt.bindString(1, editTextNomeCompleto.getText().toString());
                stmt.bindString(2, editTextNickName.getText().toString());
                stmt.executeInsert();
                db.close();

                Intent in = new Intent(Tela1.this, Tela2.class);
                startActivity(in);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
        }
    }

}