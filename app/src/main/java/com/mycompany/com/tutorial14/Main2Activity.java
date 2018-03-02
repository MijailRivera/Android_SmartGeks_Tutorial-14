package com.mycompany.com.tutorial14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    Button btnVolver, btnFinalizar;
    TextView tvInfoEnviada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnVolver = (Button) findViewById(R.id.btnVolver);
        btnFinalizar = (Button) findViewById(R.id.btnFinalizar);
        tvInfoEnviada = (TextView) findViewById(R.id.tvRespuesta);

        Bundle bundle = getIntent().getExtras();

        String dato = bundle.getString("Info").toString();
        tvInfoEnviada.setText(dato);


        btnVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(volver);
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
