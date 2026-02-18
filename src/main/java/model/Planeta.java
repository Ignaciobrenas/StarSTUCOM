/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Planeta implements Serializable {

    private String nombre;
    private String galaxia;
    private String clima;
    private boolean floraRoja;
    private boolean seresAcuaticos;
    private int capacidad;
    private ArrayList<Ser> habitantes;

    public Planeta(String nombre, String galaxia, String clima, boolean floraRoja, boolean seresAcuaticos, int capacidad) {
        this.nombre = nombre;
        this.galaxia = galaxia;
        this.clima = clima;
        this.floraRoja = floraRoja;
        this.seresAcuaticos = seresAcuaticos;
        this.capacidad = capacidad;
        this.habitantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public String getClima() {
        return clima;
    }

    public boolean isFloraRoja() {
        return floraRoja;
    }

    public boolean isSeresAcuaticos() {
        return seresAcuaticos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Ser> getHabitantes() {
        return habitantes;
    }

    public boolean agregarHabitante(Ser ser) {
        if (habitantes.size() >= capacidad) {
            return false;
        }
        habitantes.add(ser);
        return true;
    }

    public boolean eliminarHabitante(Ser ser) {
        return habitantes.remove(ser);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Planeta)) return false;
        Planeta otroPlaneta = (Planeta) obj;
        return this.nombre.equalsIgnoreCase(otroPlaneta.nombre);
    }

    @Override
    public String toString() {
        String flora = floraRoja ? "Flora Roja" : "";
        String acuaticos = seresAcuaticos ? "Peces" : "";
        String extras = "";
        if (floraRoja && seresAcuaticos) {
            extras = " - Flora Roja - Peces";
        } else if (floraRoja) {
            extras = " - Flora Roja";
        } else if (seresAcuaticos) {
            extras = " - Peces";
        }
        return "[ Galaxia: " + galaxia + " - Capacidad: " + capacidad + " - Clima: " + clima + extras + " ]";
    }
}
