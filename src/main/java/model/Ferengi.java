/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Ferengi extends Ser {

    private int nivelCivilizacion = 1;
    private double latinum;

    public Ferengi(String nombre, double latinum) {
        super(nombre);
        this.latinum = latinum;
    }

    public double getLatinum() {
        return latinum;
    }

    public void setLatinum(double latinum) {
        this.latinum = latinum;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Ferengi: " + nombre + " - Latinum: " + latinum;
    }
}
