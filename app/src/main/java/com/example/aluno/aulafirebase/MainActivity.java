package com.example.aluno.aulafirebase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends Activity {
 FirebaseAuth usuario = FirebaseAuth.getInstance();
 private EditText login;
private EditText pass;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void metodo (View view){

        login = findViewById(R.id.login);
        String users = login.getText().toString();

        pass = findViewById(R.id.senha);
        String senha = pass.getText().toString();


        usuario.createUserWithEmailAndPassword(users, senha);
    }
}
