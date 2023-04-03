package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locol extends AppCompatActivity {
    private Button vyitii;
    private Button btnNag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locol);
        vyitii=(Button) findViewById(R.id.vyiti);
        btnNag=(Button) findViewById(R.id.btnNagl);

        vyitii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Locol.this, Registrasia.class);
                startActivity(intent);
            }
        });
        btnNag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Locol.this, Glavnyi.class);
                startActivity(intent);
            }
        });

    }
}