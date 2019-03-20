package com.example.alumno_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity
{
    Spinner spnEstados;
    ListView lstCiudades;
    ImageView imgEstados,imgCiudades;
    ImageButton imgbSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnEstados=(Spinner)findViewById(R.id.spnEstados);
        lstCiudades=(ListView)findViewById(R.id.lstCiudades);
        imgEstados=(ImageView)findViewById(R.id.imgEstados);
        imgCiudades=(ImageView)findViewById(R.id.imgCiudades);
        imgbSalir=(ImageButton)findViewById(R.id.imgbSalir);

        imgEstados.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent infoescudo = new Intent(view.getContext(),Escudo.class);
                startActivity(infoescudo);

            }
        });

        ArrayAdapter Estados = ArrayAdapter.createFromResource(this, R.array.Estados,
        android.R.layout.simple_spinner_item);
        spnEstados.setAdapter(Estados);

        spnEstados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> lista, View view, int position, long id)
            {
                if (lista.getItemAtPosition(position).equals("Mexico"))
                {
                    ArrayAdapter listaMexico = ArrayAdapter.createFromResource(MainActivity.this,R.array.Mexico, android.R.layout.simple_gallery_item);
                    lstCiudades.setAdapter(listaMexico);
                    imgEstados.setImageResource(R.drawable.mexico);
                    imgCiudades.setImageResource(R.drawable.mexicoini);
                }
                if (lista.getItemAtPosition(position).equals("Nayarit"))
                {
                    ArrayAdapter listaNayarit = ArrayAdapter.createFromResource(MainActivity.this,R.array.Nayarit, android.R.layout.simple_gallery_item);
                    lstCiudades.setAdapter(listaNayarit);
                    imgEstados.setImageResource(R.drawable.nayarit);
                    imgCiudades.setImageResource(R.drawable.mapanayarit);
                    CdNayarit();
                }
                if (lista.getItemAtPosition(position).equals("Guanajuato"))
                {
                    ArrayAdapter listaGuanajuato = ArrayAdapter.createFromResource(MainActivity.this,R.array.Guanajuato, android.R.layout.simple_gallery_item);
                    lstCiudades.setAdapter(listaGuanajuato);
                    imgEstados.setImageResource(R.drawable.guanajuatoe);
                    imgCiudades.setImageResource(R.drawable.mapaguana);
                    CdGuana();
                }
                if (lista.getItemAtPosition(position).equals("Yucatan"))
                {
                    ArrayAdapter listaYucatan = ArrayAdapter.createFromResource(MainActivity.this,R.array.Yucatan, android.R.layout.simple_gallery_item);
                    lstCiudades.setAdapter(listaYucatan);
                    imgEstados.setImageResource(R.drawable.yucatan);
                    imgCiudades.setImageResource(R.drawable.mapayucatan);
                    CdYucatan();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        imgbSalir.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
            finishAffinity();
            }
        });
    }

    public void  CdNayarit()
    {
        lstCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View view, int position, long id)
            {
                switch (position)
                {
                    case 0: imgCiudades.setImageResource(R.drawable.tepicna);break;
                    case 1: imgCiudades.setImageResource(R.drawable.sayulitana);break;
                    case 2: imgCiudades.setImageResource(R.drawable.guayabitosna);break;
                }

            }
        });


    }
    public void CdGuana()
    {
        lstCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View view, int position, long id)
            {
                switch (position)
                {
                    case 0: imgCiudades.setImageResource(R.drawable.guanajuatogu);break;
                    case 1: imgCiudades.setImageResource(R.drawable.irapuatogu);break;
                    case 2: imgCiudades.setImageResource(R.drawable.leongu);break;
                }

            }
        });

    }
    public void CdYucatan()
    {
        lstCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View view, int position, long id)
            {
                switch (position)
                {
                    case 0: imgCiudades.setImageResource(R.drawable.izamalyu);break;
                    case 1: imgCiudades.setImageResource(R.drawable.progresoyu);break;
                    case 2: imgCiudades.setImageResource(R.drawable.meridayu);break;
                }

            }
        });

    }

}




