/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ignac
 */
public class Klingon extends Ser {

    private static int nivelCivilizacion = 3;
    private static int nivelFuerza;

    public Klingon(String nombre) {
        super(nombre);
    }

    public static int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public static void setNivelCivilizacion(int nivelCivilizacion) {
        Klingon.nivelCivilizacion = nivelCivilizacion;
    }

    public static int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        if (nivelFuerza >= 50 && nivelFuerza <= 350) {
            this.nivelFuerza = nivelFuerza;
        } else {
            System.out.println("Error: el nivel de fuerza debe estar entre 50 y 350");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
