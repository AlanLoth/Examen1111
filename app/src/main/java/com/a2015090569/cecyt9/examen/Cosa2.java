package com.a2015090569.cecyt9.examen;

/**
 * Created by CECyT9 on 31/03/2017
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cosa2 extends AppCompatActivity {
    double pesos, dolares;
    TextView muestraDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosa2);
        muestraDatos = (TextView) findViewById(R.id.msq);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        pesos = recibe.getDouble("Pesos");
        dolares = recibe.getDouble("Dolares");


        muestraDatos.setText("Perez Tafoya Alan Loth, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);


    }
    public void onCreate(View view){
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        pesos = recibe.getDouble("Pesos");
        dolares = recibe.getDouble("Dolares");


        muestraDatos.setText("Perez Tafoya Alan Loth, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);
    }
    public void onClickEnviar(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Examen 1er parcial ");
        intent.putExtra(Intent.EXTRA_TEXT, "Perez Tafoya Alan Loth, \nlos pesos a convertir son: $" + pesos
                + "\nla conversión fue de: $" + dolares);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
        startActivity(Intent.createChooser(intent, "Gmail"));

    }

}
