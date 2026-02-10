/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ignac
 */
public class Humano extends Ser {

    private static int nivelCivilizacion = 1;
    private static int edad;
    private static String genero;

    public Humano(String nombre) {
        super(nombre);
    }

    

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public void setNivelCivilizacion(int nivelCivilizacion) {
        this.nivelCivilizacion = nivelCivilizacion;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        if (genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("femenino")) {
            Humano.genero = genero;
        } else {
            throw new IllegalArgumentException("Genero no valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public static void setEdad(int edad) {
        if (edad >= 0 && edad <= 130) {
            Humano.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 130");
        }
    }

    public int getEdad() {
        return edad;
    }

}
