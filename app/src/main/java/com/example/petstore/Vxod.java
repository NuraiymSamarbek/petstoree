package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vxod extends AppCompatActivity {
    private Button glavV;
    private Button reggg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vxod);
        glavV=(Button) findViewById(R.id.voiti2);
        reggg=(Button) findViewById(R.id.btRegis);

        glavV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vxod.this, Glavnyi.class);
                startActivity(intent);
            }
        });


        reggg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vxod.this, Registrasia.class);
                startActivity(intent);
            }
        });


    }
}