package com.a2015090569.cecyt9.examen;

/**
 * Created by CECyT9 on 31/03/2017
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cosa1 extends AppCompatActivity {
    EditText pesos;
    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosa1);
        pesos = (EditText) findViewById(R.id.cosa);
        msj = (TextView) findViewById(R.id.Idddd);
    }
    public void onClickConvertir(View v) {
        if(pesos.getText().equals(" ")){
            msj.setText("Inválido");
        }else{
            double money, conversion;
            money = Double.parseDouble(pesos.getText().toString());
            conversion = money/15;


            Intent envia = new Intent(this, Cosa2.class);
            Bundle datos = new Bundle();
            datos.putDouble("Pesos", money);
            datos.putDouble("Dolares", conversion);
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }

    }
}
