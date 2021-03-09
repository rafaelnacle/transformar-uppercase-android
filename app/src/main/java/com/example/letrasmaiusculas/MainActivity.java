package com.example.letrasmaiusculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View v) {
        EditText texto = (EditText)findViewById(R.id.texto);
        String mensagem = texto.getText().toString();

        mensagem = mensagem.toUpperCase();

        TextView resultado = findViewById(R.id.resultado);
        resultado.setText(mensagem);

        System.out.println(mensagem);
    }
}