package lab3p2_rodrigovasquez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3P2_RodrigoVasquez {

    public static void main(String[] args) {
        //ArrayList & Clase = Consecionaria & Clientes 
        ArrayList<Concesionaria> concesionarias = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner scMain = new Scanner(System.in);
        int opcion;
        do {
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
                    crudCliente(clientes);
                    break;
                case 3:
                    if (concesionarias.size() == 0) {
                        System.out.println("No se pueden agregar vehículos si no hay concesionarias");
                    } else {

                    }
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

    public static ArrayList crudCliente(ArrayList<Cliente> clientes) {
        Scanner scClient = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------------------------");
            System.out.println("    < C L I E N T E S >");
            System.out.println("---------------------------");
            System.out.print("""
                               [1] Agregar
                               [2] Eliminar
                               [3] Salir
                               """);
            System.out.println("---------------------------");
            System.out.print("Ingrese la accion a realizar: ");
            opcion = scClient.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String name = scClient.nextLine();
                    name = scClient.nextLine();
                    double saldo = (Math.random() * (50000 - 10000)) + 1;
                    System.out.println("Su saldo es de: " + saldo);
                    clientes.add(new Cliente(clientes.size() + 1, name, saldo));
                    System.out.println("Se ha añadido el cliente a la lista");
                    break;
                case 2:
                    if (clientes.size() == 0) {
                        int num = 1;
                        for (Cliente cliente : clientes) {
                            System.out.println("#" + num + ": " + cliente);
                            num++;
                        }
                        System.out.print("Ingrese que cliente desea eliminar: ");
                        int elim = scClient.nextInt();
                        if ((elim - 1) > clientes.size()) {
                            System.out.println("Posicion Invalida");
                        } else if ((elim - 1) < 0) {
                            System.out.println("Posicion Invalida");
                        } else {
                            clientes.remove(elim - 1);
                            System.out.println("Se ha removido el cliente de la lista");
                        }
                    } else {
                        System.out.println("No hay clientes en la lista");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion != 3);
        return clientes;
    }



}
