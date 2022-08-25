package com.example.appalertas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_alertas_ciudadano extends AppCompatActivity {

   ImageButton btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_alertas_ciudadano);

/*        btn = (ImageButton) findViewById(R.id.btnAccidente);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(menu_alertas_ciudadano.this, reportar_alerta_falsa.class);
                startActivity(intent);
                finish();
            }
        });*/
    }
}