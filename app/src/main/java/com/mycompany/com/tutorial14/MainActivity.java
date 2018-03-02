package com.mycompany.com.tutorial14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSgte;
    EditText etInfoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSgte = (Button) findViewById(R.id.btnPantalla2);
        etInfoEnviar = (EditText) findViewById(R.id.etInfoEnviar);

        btnSgte.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra("Info", etInfoEnviar.getText().toString());
                startActivity(intent);
            }
        });
    }
}
