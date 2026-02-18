/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Vulcaniano extends Ser {

    private int nivelCivilizacion = 3;
    private int indiceMeditacion;

    public Vulcaniano(String nombre, int indiceMeditacion) {
        super(nombre);
        this.indiceMeditacion = indiceMeditacion;
    }

    public int getIndiceMeditacion() {
        return indiceMeditacion;
    }

    public void setIndiceMeditacion(int indiceMeditacion) {
        this.indiceMeditacion = indiceMeditacion;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Vulcaniano: " + nombre + " - Nivel de meditación: " + indiceMeditacion;
    }
}
