package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Glavnyi extends AppCompatActivity {
    private ImageButton voiti;
    private Button pets;
    private Button zakaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glavnui);
        voiti=(ImageButton) findViewById(R.id.btnvoiti);
        pets=(Button) findViewById(R.id.pets);
        zakaz=(Button) findViewById(R.id.zakaz);

        voiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Glavnyi.this, Vxod.class);
                startActivity(intent);
            }
        });

        pets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Glavnyi.this, Pets.class);
                startActivity(intent);
            }
        });

        zakaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Glavnyi.this, Zakaz.class);
                startActivity(intent);
            }
        });


    }
}