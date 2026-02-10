/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author ignac
 */
public class Planeta {
    private String nombre;
    private String galaxia;
    private String clima;
    
    private boolean floraRoja;
    private boolean seresAcuaticos;
    private static ArrayList<Ser> habitantes = new ArrayList<>();

    public Planeta(String nombre, String galaxia, String clima, boolean floraRoja, boolean seresAcuaticos) {
        this.nombre = nombre;
        this.galaxia = galaxia;
        this.clima = clima;
        this.floraRoja = floraRoja;
        this.seresAcuaticos = seresAcuaticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public boolean isFloraRoja() {
        return floraRoja;
    }

    public void setFloraRoja(boolean floraRoja) {
        this.floraRoja = floraRoja;
    }

    public boolean isSeresAcuaticos() {
        return seresAcuaticos;
    }

    public void setSeresAcuaticos(boolean seresAcuaticos) {
        this.seresAcuaticos = seresAcuaticos;
    }

    public static ArrayList<Ser> getHabitantes() {
        return habitantes;
    }

    public static void setHabitantes(ArrayList<Ser> habitantes) {
        Planeta.habitantes = habitantes;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planeta other = (Planeta) obj;
        if (this.floraRoja != other.floraRoja) {
            return false;
        }
        if (this.seresAcuaticos != other.seresAcuaticos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.galaxia, other.galaxia)) {
            return false;
        }
        return Objects.equals(this.clima, other.clima);
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", galaxia=" + galaxia + ", clima=" + clima + ", floraRoja=" + floraRoja + ", seresAcuaticos=" + seresAcuaticos + '}';
    }
    
}
