/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ignac
 */
public class Nibiriano extends Ser{
    private static int nivelCivilizacion = 2;
    private static boolean vegetariano;
    

    public Nibiriano(String nombre) {
        super(nombre);
    }

    public static int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public static void setNivelCivilizacion(int nivelCivilizacion) {
        Nibiriano.nivelCivilizacion = nivelCivilizacion;
    }

    public static boolean isVegetariano() {
        return vegetariano;
    }

    public static void setVegetariano(boolean vegetariano) {
        Nibiriano.vegetariano = vegetariano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nibiriano{" + '}';
    }
}
