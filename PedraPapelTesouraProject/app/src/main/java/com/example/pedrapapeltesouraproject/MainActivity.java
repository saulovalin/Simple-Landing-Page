package com.example.pedrapapeltesouraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

   public void opcaoSelecionada(String opcaoSelecionada){

       ImageView imageResultado = findViewById(R.id.imageResultado);
       TextView textoResutado = findViewById(R.id.textView4);

        int numero = new Random().nextInt(3);//0 1 2
       String[] opcoes = {"pedra", "papel", "tesoura"};
       String opcaoApp = opcoes[ numero ];

       switch ( opcaoApp ){
           case "pedra" :
               imageResultado.setImageResource(R.drawable.pedra);
               break;
           case "papel" :
               imageResultado.setImageResource(R.drawable.papel);
               break;
           case "tesoura" :
               imageResultado.setImageResource(R.drawable.tesoura);
               break;
       }

       if(
               (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
               (opcaoApp == "papel" && opcaoSelecionada == "pedra")  ||
               (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")
       ) {//App ganhador
           textoResutado.setText("Você perdeu :( ");

       } else if (
               (opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
               (opcaoSelecionada == "papel" && opcaoApp == "pedra")  ||
               (opcaoSelecionada == "pedra" && opcaoApp == "tesoura")
       ) {//Usuario ganhador
           textoResutado.setText("Você ganhou :) ");

       }else {//Empate
           textoResutado.setText("Empatamos ;) ");
       }

       System.out.println("item clicado: " + opcaoApp );



   }

}