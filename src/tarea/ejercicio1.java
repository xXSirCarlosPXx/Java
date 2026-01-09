package tarea;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] horas = new int[5];
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};

        System.out.println("Ingrese la cantidad de horas de estudio dedicadas a 'Algoritmos y Estructuras de Datos':");
        for(int i = 0; i < 5; i++) {
            System.out.println("Cuantas horas de estudio dedico el dia " + dias[i] + "?");
            horas[i] = leer.nextInt();
        }

        System.out.println("Horas de estudio registradas:");
        for(int i = 0; i < 5; i++) {
            System.out.println(dias[i] + ": " + horas[i]);
        }
    }
}
