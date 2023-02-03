package lab3p2_rodrigovasquez;

import java.util.Scanner;

public class Lab3P2_RodrigoVasquez {

    public static void main(String[] args) {
        //ArrayList & Clase = Consecionaria & Clientes 
        //Clase Madre = Vehiculo 
        //Clase Hijos = Carro, Camion, Bus, Motocicleta, Bicecleta 
        Scanner scMain = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---------------------------------------------------------");
            System.out.println("                 < B I E N V E N I D O >                 ");
            System.out.println("---------------------------------------------------------");
            System.out.print("""
                               [1] CRUD Concesionaria 
                               [2] CRUD Clientes
                               [3] CRUD Vehículos
                               [4] Compra / Venta de Vehículos por parte de un Cliente
                               [5] Salida
                               """);
            System.out.println("---------------------------------------------------------");
            System.out.print("Ingrese que accion desea realizar: ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Cerrando el sistema...");
                    System.out.println("Muchas gracias por utilizar este programa");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 5); 
    }
    
}
