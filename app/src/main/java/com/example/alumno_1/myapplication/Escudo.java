package com.example.alumno_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
public class Escudo extends AppCompatActivity
{
    Button btnR;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escudo);
        btnR=(Button)findViewById(R.id.btnR);

        btnR.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent inicio = new Intent(view.getContext(),MainActivity.class);
                startActivity(inicio);

            }
        });
    }
}
