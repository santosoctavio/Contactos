package com.santos.contactos;

import java.io.Serializable;

/**
 * Created by Santos on 05/09/2017.
 */

public class contacto implements Serializable {
    String Nombre, Email, Twitter, FechaNac;
    int Telefono;

    public contacto(String nombre, String email, String twitter, String fechaNac, int telefono) {
        Nombre = nombre;
        Email = email;
        Twitter = twitter;
        FechaNac = fechaNac;
        Telefono = telefono;
    }

    public String getTwitter() {
        return Twitter;
    }
    public void setTwitter(String twitter) {
        Twitter = twitter;
    }
    public String getFechaNac() {
        return FechaNac;
    }
    public void setFechaNac(String fechaNac) {
        FechaNac = fechaNac;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getNumero() {
        return Telefono;
    }
    public void setNumero(int telefono) {
        Telefono = telefono;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {

        return this.Nombre + "  / "+ this.Email;
    }


}
