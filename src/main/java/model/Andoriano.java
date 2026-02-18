/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Andoriano extends Ser {

    private int nivelCivilizacion = 2;
    private String rango;
    private boolean aenar;

    public Andoriano(String nombre, String rango, boolean aenar) {
        super(nombre);
        this.rango = rango;
        this.aenar = aenar;
    }

    public String getRango() {
        return rango;
    }

    public boolean isAenar() {
        return aenar;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Andoriano: " + nombre + " - Aenar: " + (aenar ? "si" : "no") + " si Rango: " + rango;
    }
}
