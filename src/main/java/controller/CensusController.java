/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * @author ignac
 */
package controller;

import model.*;

import java.io.*;
import java.util.ArrayList;

public class CensusController {

    private ArrayList<Planeta> planetas;
    private static final String FICHERO_PLANETAS = "Planetas.txt";
    private static final String FICHERO_SERES = "Seres.txt";

    public CensusController() {
        planetas = new ArrayList<>();
        cargarDatos();
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public boolean registrarPlaneta(Planeta planeta) {
        if (planetas.contains(planeta)) {
            return false;
        }
        planetas.add(planeta);
        guardarDatos();
        return true;
    }

    public boolean censarSer(Ser ser, String nombrePlaneta) {
        Planeta planeta = obtenerPlanetaPorNombre(nombrePlaneta);
        if (planeta == null) return false;

        if (serYaExiste(ser)) return false;

        if (!validarReglas(ser, planeta)) return false;

        boolean resultado = planeta.agregarHabitante(ser);
        if (resultado) guardarDatos();
        return resultado;
    }

    public boolean borrarSer(String nombreSer) {
        for (Planeta planeta : planetas) {
            for (Ser ser : planeta.getHabitantes()) {
                if (ser.getNombre().equalsIgnoreCase(nombreSer)) {
                    planeta.eliminarHabitante(ser);
                    guardarDatos();
                    return true;
                }
            }
        }
        return false;
    }

    public Ser obtenerSerPorNombre(String nombre) {
        for (Planeta planeta : planetas) {
            for (Ser ser : planeta.getHabitantes()) {
                if (ser.getNombre().equalsIgnoreCase(nombre)) {
                    return ser;
                }
            }
        }
        return null;
    }

    public Planeta obtenerPlanetaPorNombre(String nombre) {
        for (Planeta planeta : planetas) {
            if (planeta.getNombre().equalsIgnoreCase(nombre)) {
                return planeta;
            }
        }
        return null;
    }

    public boolean serYaExiste(Ser ser) {
        for (Planeta planeta : planetas) {
            if (planeta.getHabitantes().contains(ser)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarReglas(Ser ser, Planeta planeta) {
        if (ser instanceof Klingon) {
            if (planeta.getClima().equalsIgnoreCase("Cálido")) {
                return false;
            }
        }

        if (ser instanceof Ferengi) {
            if (planeta.getClima().equalsIgnoreCase("Frío")) {
                return false;
            }
        }

        if (ser instanceof Nibiriano) {
            Nibiriano nib = (Nibiriano) ser;
            if (nib.isVegetariano() && !planeta.isFloraRoja()) {
                return false;
            }
            if (!nib.isVegetariano() && !planeta.isSeresAcuaticos()) {
                return false;
            }
        }

        if (ser instanceof Vulcaniano) {
            for (Ser habitante : planeta.getHabitantes()) {
                if (habitante instanceof Andoriano) {
                    return false;
                }
            }
        }

        if (ser instanceof Andoriano) {
            for (Ser habitante : planeta.getHabitantes()) {
                if (habitante instanceof Vulcaniano) {
                    return false;
                }
            }
        }

        return true;
    }

    public ArrayList<Ser> obtenerSeresPorEspecie(String especie) {
        ArrayList<Ser> resultado = new ArrayList<>();
        for (Planeta planeta : planetas) {
            for (Ser ser : planeta.getHabitantes()) {
                switch (especie.toLowerCase()) {
                    case "humano":
                        if (ser instanceof Humano) resultado.add(ser);
                        break;
                    case "vulcaniano":
                        if (ser instanceof Vulcaniano) resultado.add(ser);
                        break;
                    case "andoriano":
                        if (ser instanceof Andoriano) resultado.add(ser);
                        break;
                    case "nibiriano":
                        if (ser instanceof Nibiriano) resultado.add(ser);
                        break;
                    case "klingon":
                        if (ser instanceof Klingon) resultado.add(ser);
                        break;
                    case "ferengi":
                        if (ser instanceof Ferengi) resultado.add(ser);
                        break;
                }
            }
        }
        return resultado;
    }

    public void guardarDatos() {
        try (ObjectOutputStream oosPlanetas = new ObjectOutputStream(new FileOutputStream(FICHERO_PLANETAS))) {
            oosPlanetas.writeObject(planetas);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }


    public void cargarDatos() {
        File fichero = new File(FICHERO_PLANETAS);
        if (!fichero.exists()) return;

        try (ObjectInputStream oisPlanetas = new ObjectInputStream(new FileInputStream(FICHERO_PLANETAS))) {
            planetas = (ArrayList<Planeta>) oisPlanetas.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
            planetas = new ArrayList<>();
        }
    }
}
