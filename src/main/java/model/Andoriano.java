/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ignac
 */
public class Andoriano extends Ser{
    private static int nivelCivilizacion = 2;
    private static String rango;
    private static boolean aenar;

    public Andoriano(String nombre) {
        super(nombre);
    }

    public static int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public static void setNivelCivilizacion(int nivelCivilizacion) {
        Andoriano.nivelCivilizacion = nivelCivilizacion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        if (rango.equalsIgnoreCase("entrenador") || rango.equalsIgnoreCase("defensor") || rango.equalsIgnoreCase("luchador") || rango.equalsIgnoreCase("caballero") ) {
            Andoriano.rango = rango;
        } else {
            throw new IllegalArgumentException("Genero no valido");
        }
    }

    public boolean isAenar() {
        return aenar;
    }

    public void setAenar(boolean aenar) {
        this.aenar = aenar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Andoriano{" + "rango=" + rango + ", aenar=" + aenar + '}';
    }
}
