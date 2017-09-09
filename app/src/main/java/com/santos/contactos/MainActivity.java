package com.santos.contactos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {




    contacto[] listaContactos=new contacto[]{

    };

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cambiar titulo
        this.setTitle("Mis Contactos");


        //ListView donde se mostrarán los contacto
        lista = (ListView)findViewById(R.id.lsvContactos);
        //Adaptador para mostrar la lista de contactos
        ArrayAdapter adp = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaContactos);
        lista.setAdapter(adp);


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Mandar llamar la segunda actividad
                Intent i= new Intent(getApplication(),segundopaso.class);
                startActivityForResult(i,2);


            }
        });


    }

    //Recibe una lista de contactos y un contacto para juntar
    // devuelve  una lista nueva

    public contacto[] agregar(contacto[] ListaEnt,contacto nuevo){
        contacto[] ListaRes = ListaEnt;
        ListaEnt= new contacto[ListaEnt.length+1];
        for (int i =0; i <ListaRes.length;i++){
            ListaEnt[i]=ListaRes[i];
        }
        ListaEnt[ListaEnt.length-1]=(contacto)nuevo;
        return ListaEnt;


    };


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Guarda el contacto recibido en una variable de tipo contacto
        contacto contactos=(contacto) data.getSerializableExtra("lista");
        //actualiza la lista
        listaContactos=agregar(listaContactos,contactos);
        //Inserta la nueva lista al listview a mostrar
        ArrayAdapter adp = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaContactos);
        lista.setAdapter(adp);
    }


    // menu


}
