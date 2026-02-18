/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

public class Humano extends Ser {

    private int nivelCivilizacion = 1;
    private int edad;
    private String genero;

    public Humano(String nombre, int edad, String genero) {
        super(nombre);
        this.edad = edad;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    @Override
    public String toString() {
        return "Humano: " + nombre + " - Edad: " + edad + " - Género: " + genero;
    }
}
