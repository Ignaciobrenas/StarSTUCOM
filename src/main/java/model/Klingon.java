/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Klingon extends Ser {

    private int nivelCivilizacion = 3;
    private int nivelFuerza;

    public Klingon(String nombre, int nivelFuerza) {
        super(nombre);
        this.nivelFuerza = nivelFuerza;
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Klingon: " + nombre + " - Fuerza: " + nivelFuerza;
    }
}
