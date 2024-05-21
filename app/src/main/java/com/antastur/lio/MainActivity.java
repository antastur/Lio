package com.antastur.lio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView cuerpo,color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuerpo=findViewById(R.id.cuerpo);
        color=findViewById(R.id.color);

    }


    public void jugar(View view) {

        int valorColor = 1 + (int) (Math.random()*4);
        int valorCuerpo = 1 + (int) (Math.random()*4);

        switch (valorColor) {

            case 1: color.setImageResource(R.drawable.amarilla);break;
            case 2: color.setImageResource(R.drawable.azul);break;
            case 3: color.setImageResource(R.drawable.roja);break;
            case 4: color.setImageResource(R.drawable.verde);break;
        }

        switch (valorCuerpo) {

            case 1: cuerpo.setImageResource(R.drawable.manodchaok);break;
            case 2: cuerpo.setImageResource(R.drawable.manoizdaok);break;
            case 3: cuerpo.setImageResource(R.drawable.piedchook);break;
            case 4: cuerpo.setImageResource(R.drawable.pieizdo2ok);break;
        }

    }

    public void salir(View view){
        finish();
        System.exit(0);

    }


}