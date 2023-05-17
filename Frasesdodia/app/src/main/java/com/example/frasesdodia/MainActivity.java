package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Comece onde você está, use o que você tem e faça o que você pode.",
                "Não se importe tanto com a opinião dos outros. Se você quer muito algo, siga seu coração e junte forças para consegui-lo!",
                "Um dia você ainda vai olhar para trás e pensar: nossa, consegui tudo aquilo que parecia impossível!",
                "Tenha fé, tenha esperança e acredite! Você é mais forte do que pensa ser."
        };
        int numero = new Random().nextInt(4);//0 1 2 3

        TextView texto = findViewById(R.id.TextResultado);
        texto.setText( frases[numero]);

    }

}