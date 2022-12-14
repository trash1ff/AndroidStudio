package com.example.projetofucapi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void entrarClicando(View view){

        Intent intent = new Intent(this, Tela2.class);

        EditText inputLogin = findViewById(R.id.editLogin);
        intent.putExtra("login", inputLogin.getText().toString());

        EditText inputSenha = findViewById(R.id.editSenha);
        intent.putExtra("senha", inputSenha.getText().toString());

        startActivity(intent);



    }


}