package view;

import controller.CensusControler;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ignac
 */
public class Inicio {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    CensusControler.registrarPlaneta();
                    break;
                case 2:
                    CensusControler.censarSer();
                    break;
                case 3:
                    CensusControler.borrarSer();
                    break;
                case 4:
                    CensusControler.obtenerSerPorNombre();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Registar un planeta nuevo");
        System.out.println("2. Censar un ser en un planetal");
        System.out.println("3. Borrar el ser");
        System.out.println("4. Obterner planeta por nombre");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
    }
}