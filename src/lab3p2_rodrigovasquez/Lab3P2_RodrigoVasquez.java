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
                    int opcionVehiculo;
                    if (concesionarias.size() == 0) {
                        System.out.println("No se pueden agregar vehículos si no hay concesionarias");
                    } else {
                        do {
                            System.out.println("-----------------------------------");
                            System.out.println("       < V E H I C U L O S >");
                            System.out.println("-----------------------------------");
                            System.out.print("""
                                    [1] Agregar
                                    [2] Modificar
                                    [3] Eliminar 
                                    [4] Salir
                               """);
                            System.out.println("-----------------------------------");
                            System.out.print("Ingrese la accion a realizar: ");
                            opcionVehiculo = scMain.nextInt();
                            switch (opcionVehiculo) {
                                case 1:
                                    agregarVehiculo();
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    System.out.println("Saliendo...");
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                            }
                        } while (opcionVehiculo != 4);
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

    public static Vehiculo agregarVehiculo() {
        Scanner scVehi = new Scanner(System.in);
        System.out.print("Ingrese cuantas llantas tiene el vehiculo [2 / 4]: ");
        int llantas = scVehi.nextInt();
        if (llantas == 2) {
            System.out.println("---------------");
            System.out.print("""
                               [1] Motocicleta
                               [2] Bicicleta 
                               """);
            System.out.println("---------------");
            System.out.print("¿Que desea añadir? ");
            int tipoInt = scVehi.nextInt();
            if (tipoInt == 1) {
                System.out.print("Ingrese el color de la motocicleta: ");
                String colorMoto = scVehi.nextLine();
                colorMoto = scVehi.nextLine();
                System.out.print("Ingrese la marca de la motocicleta: ");
                String marcaMoto = scVehi.nextLine();
                System.out.print("Ingrese el modelo de la motocicleta: ");
                String modeloMoto = scVehi.nextLine();
                System.out.print("Ingrese el año de fabricación: ");
                int yearMoto = scVehi.nextInt();
                System.out.print("Ingrese el precio del vehículo: ");
                int precioMoto = scVehi.nextInt();
                int cantLlantas = 2;
                System.out.print("Ingrese el tipo de desplazamiento que tiene la motocicleta: ");
                String desplazamiento = scVehi.nextLine();
                desplazamiento = scVehi.nextLine();
                char caracter;
                boolean electrica = false;
                do {
                    System.out.print("¿Es la moto electrica? [S/N]: ");
                    caracter = scVehi.next().charAt(0);
                    if (caracter == 's' || caracter == 'S' || caracter == 'n' || caracter == 'N') {
                        if (caracter == 's' || caracter == 'S') {
                            electrica = true;
                        } else {
                            electrica = false;
                        }
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                } while (caracter != 's' && caracter != 'S' && caracter != 'n' && caracter != 'N');
                Motocicleta moto = new Motocicleta(desplazamiento, electrica, colorMoto, marcaMoto, modeloMoto, yearMoto, precioMoto, cantLlantas);
                return moto;
            } else if (tipoInt == 2) {
                System.out.print("Ingrese el color de la bicicleta: ");
                String colorBici = scVehi.nextLine();
                colorBici = scVehi.nextLine();
                System.out.print("Ingrese la marca de la bicicleta: ");
                String marcaBici = scVehi.nextLine();
                System.out.print("Ingrese el modelo de la bicicleta: ");
                String modeloBici = scVehi.nextLine();
                System.out.print("Ingrese el año de fabricación: ");
                int yearBici = scVehi.nextInt();
                System.out.print("Ingrese el precio del vehículo: ");
                int precioBici = scVehi.nextInt();
                int cantLlantas = 2;
                System.out.print("Ingrese el radio de la rueda ");
                double radio = scVehi.nextDouble();
                System.out.print("Ingrese una descripcion de la bicicleta: ");
                String descripcion = scVehi.nextLine();
                descripcion = scVehi.nextLine();
                String tipo = "";
                int tipoBici;
                do {
                    System.out.println("""
                                   [1] BMX
                                   [2] Calle
                                   """);
                    System.out.print("Ingrese el tipo de bicicleta: ");
                    tipoBici = scVehi.nextInt();
                    if (tipoBici == 1) {
                        tipo = "BMX";
                    } else if (tipoBici == 2) {
                        tipo = "Calle";
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                } while (tipoBici != 1 && tipoBici != 2);
                Bicicleta bici = new Bicicleta(descripcion, tipo, radio, colorBici, marcaBici, modeloBici, yearBici, precioBici, cantLlantas);
                return bici;
            } else {
                System.out.println("Opcion Invalida");
            }
        } else if (llantas == 4) {
            
        } else {
            System.out.println("Opcion Invalida");
        }

    }

}
