package com.santos.contactos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Santos on 05/09/2017.
 */

public class segundopaso extends AppCompatActivity {


    EditText Nombre;
    EditText Telefono;
    EditText Email;
    EditText Twitter;
    EditText FechaNacimiento;
    Button btnAceptar;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        //Declaracion de variables
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundopaso);

        Nombre = (EditText) findViewById(R.id.txtNombre);
        Telefono = (EditText) findViewById(R.id.txtTelefono);
        Email = (EditText) findViewById(R.id.txtEmail);
        Twitter = (EditText) findViewById(R.id.txtTwitter);
        FechaNacimiento = (EditText) findViewById(R.id.txtFechaNacimiento);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);

//Guardar  los datos en variables
        btnAceptar.setOnClickListener(new View.OnClickListener()
                                       {

                                           @Override
                                           public void onClick(View v)
                                           {
                                               Intent intent = new Intent();

                                               String nombre = Nombre.getText().toString();
                                               int telefono = Integer.parseInt(Telefono.getText().toString());
                                               String email = Email.getText().toString();
                                               String twitter = Twitter.getText().toString();
                                               String fechaNacimiento = FechaNacimiento.getText().toString();
                                               //Nuevo objeto contacto
                                               contacto contactos = new contacto(nombre,email, twitter, fechaNacimiento,telefono);
                                               intent.putExtra("lista",contactos);
                                               setResult(RESULT_OK,intent);
                                               finish();


                                           }
                                       }


        );




    }


}
