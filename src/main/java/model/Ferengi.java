package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ignac
 */
public class Ferengi extends Ser {
    private static int nivelCivilizacion = 1;
    private static boolean latinum;

    public Ferengi(String nombre) {
        super(nombre);
    }

    public static int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public static void setNivelCivilizacion(int nivelCivilizacion) {
        Ferengi.nivelCivilizacion = nivelCivilizacion;
    }

    public static boolean isLatinum() {
        return latinum;
    }

    public static void setLatinum(boolean latinum) {
        Ferengi.latinum = latinum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    public String toString() {
        return super.toString() + ", Ferengi{" +
                "nivelCivilizacion=" + nivelCivilizacion +
                ", latinum=" + latinum +
                '}';
    }
    
}
