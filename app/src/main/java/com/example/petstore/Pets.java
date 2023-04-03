package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pets extends AppCompatActivity {
    private Button glav;
    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets);
        glav=(Button) findViewById(R.id.glavzak);

        glav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Pets.this, Glavnyi.class);
                startActivity(intent);
            }
        });

        create=(Button) findViewById(R.id.sozdat3);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Pets.this, CreatePet .class);
                startActivity(intent);
            }
        });
    }
}