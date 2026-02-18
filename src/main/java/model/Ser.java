/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

import java.io.Serializable;

public abstract class Ser implements Serializable {

    protected String nombre;

    public Ser(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Ser)) return false;
        Ser otroSer = (Ser) obj;
        return this.nombre.equalsIgnoreCase(otroSer.nombre);
    }

    @Override
    public abstract String toString();
}
