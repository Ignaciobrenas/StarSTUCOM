/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ignac
 */
public class Vulcaniano extends Ser{
    private static int nivelCivilizacion = 3 ;
    private static int indiceMeditacion;

    public Vulcaniano(String nombre) {
        super(nombre);
    }

    public static int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public static void setNivelCivilizacion(int nivelCivilizacion) {
        Vulcaniano.nivelCivilizacion = nivelCivilizacion;
    }

    public static int getIndiceMeditacion() {
        return indiceMeditacion;
    }

    public static void setIndiceMeditacion(int indiceMeditacion) {
        if (indiceMeditacion >= 0 && indiceMeditacion <= 10) {
            Vulcaniano.indiceMeditacion = indiceMeditacion;
        } else {
            System.out.println("Error: El indice de mediacion debe estar entre 0 y 130");
        };
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vulcaniano{" + '}';
    }
    
}
