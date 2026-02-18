/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Nibiriano extends Ser {

    private int nivelCivilizacion = 2;
    private boolean vegetariano;

    public Nibiriano(String nombre, boolean vegetariano) {
        super(nombre);
        this.vegetariano = vegetariano;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Nibiriano: " + nombre + " - Dieta: " + (vegetariano ? "Flora Roja" : "Peces");
    }
}
