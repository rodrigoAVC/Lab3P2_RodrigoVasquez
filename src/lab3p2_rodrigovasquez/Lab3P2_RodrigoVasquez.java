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
                    crudConce(concesionarias);
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
                                    Vehiculo test = agregarVehiculo();
                                    vehiculos.add(test);
                                    if (test instanceof Carro) {
                                        for (Vehiculo vehiculo : vehiculos) {
                                            if (vehiculo == test) {
                                                Carro c = ((Carro) vehiculos.get(0));
                                                int num = 1;
                                                for (Concesionaria concesionaria : concesionarias) {
                                                    System.out.println("#" + num + ": " + concesionaria);
                                                }
                                                System.out.println("¿A que concesionaria desea agregar el carro? ");
                                                int opcionConce = scMain.nextInt();
                                                if (opcionConce - 1 > concesionarias.size() && opcionConce - 1 < 0) {
                                                    System.out.println("Opcion Invalida");
                                                } else {
                                                    ((Concesionaria) concesionarias.get(opcionConce - 1)).getListaVenta().add(c);
                                                }
                                            }
                                        }
                                    } else if (test instanceof Camion) {
                                        for (Vehiculo vehiculo : vehiculos) {
                                            if (vehiculo == test) {
                                                Camion c = ((Camion) vehiculos.get(0));
                                                int num = 1;
                                                for (Concesionaria concesionaria : concesionarias) {
                                                    System.out.println("#" + num + ": " + concesionaria);
                                                }
                                                System.out.println("¿A que concesionaria desea agregar el camion? ");
                                                int opcionConce = scMain.nextInt();
                                                if (opcionConce - 1 > concesionarias.size() && opcionConce - 1 < 0) {
                                                    System.out.println("Opcion Invalida");
                                                } else {
                                                    ((Concesionaria) concesionarias.get(opcionConce - 1)).getListaVenta().add(c);
                                                }
                                            }
                                        }
                                    } else if (test instanceof Bus) {
                                        for (Vehiculo vehiculo : vehiculos) {
                                            if (vehiculo == test) {
                                                Bus c = ((Bus) vehiculos.get(0));
                                                int num = 1;
                                                for (Concesionaria concesionaria : concesionarias) {
                                                    System.out.println("#" + num + ": " + concesionaria);
                                                }
                                                System.out.println("¿A que concesionaria desea agregar el bus? ");
                                                int opcionConce = scMain.nextInt();
                                                if (opcionConce - 1 > concesionarias.size() && opcionConce - 1 < 0) {
                                                    System.out.println("Opcion Invalida");
                                                } else {
                                                    ((Concesionaria) concesionarias.get(opcionConce - 1)).getListaVenta().add(c);
                                                }
                                            }
                                        }
                                    } else if (test instanceof Motocicleta) {
                                        for (Vehiculo vehiculo : vehiculos) {
                                            if (vehiculo == test) {
                                                Motocicleta c = ((Motocicleta) vehiculos.get(0));
                                                int num = 1;
                                                for (Concesionaria concesionaria : concesionarias) {
                                                    System.out.println("#" + num + ": " + concesionaria);
                                                }
                                                System.out.println("¿A que concesionaria desea agregar la moto? ");
                                                int opcionConce = scMain.nextInt();
                                                if (opcionConce - 1 > concesionarias.size() && opcionConce - 1 < 0) {
                                                    System.out.println("Opcion Invalida");
                                                } else {
                                                    ((Concesionaria) concesionarias.get(opcionConce - 1)).getListaVenta().add(c);
                                                }
                                            }
                                        }
                                    } else if (test instanceof Bicicleta) {
                                        for (Vehiculo vehiculo : vehiculos) {
                                            if (vehiculo == test) {
                                                Bicicleta c = ((Bicicleta) vehiculos.get(0));
                                                int num = 1;
                                                for (Concesionaria concesionaria : concesionarias) {
                                                    System.out.println("#" + num + ": " + concesionaria);
                                                }
                                                System.out.println("¿A que concesionaria desea agregar la bici? ");
                                                int opcionConce = scMain.nextInt();
                                                if (opcionConce - 1 > concesionarias.size() && opcionConce - 1 < 0) {
                                                    System.out.println("Opcion Invalida");
                                                } else {
                                                    ((Concesionaria) concesionarias.get(opcionConce - 1)).getListaVenta().add(c);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    int numV = 1;
                                    for (Vehiculo vehi : vehiculos) {
                                        System.out.println("#" + numV + ": " + vehi);
                                        numV++;
                                    }
                                    System.out.print("Eliga que vehiculo desea eliminar: ");
                                    int numElim = scMain.nextInt();
                                    if (numElim - 1 < 0 || numElim - 1 > vehiculos.size()) {
                                        System.out.println("Opcion Invalida");
                                    } else {
                                        vehiculos.remove(numV - 1);
                                        System.out.println("Vehiculo eliminado");
                                    }
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

    public static Concesionaria crudConce(ArrayList<Concesionaria> concesionarias) {
        Scanner scConce = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-------------------------------------");
            System.out.println("    < C O N C E S I O N A R I A >");
            System.out.println("-------------------------------------");
            System.out.print("""
                             [1] Agregar
                             [2] Modificar
                             [3] Eliminar
                             [4] Salir
                             """);
            System.out.println("-------------------------------------");
            System.out.print("Ingrese la accion a realizar: ");
            opcion = scConce.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la concesionaria: ");
                    String name = scConce.nextLine();
                    name = scConce.nextLine();
                    System.out.print("Ingrese la dirrecion de la concesionaria: ");
                    String dire = scConce.nextLine();
                    double saldo = (Math.random() * (100000 - 30000)) + 1;
                    System.out.println("Su saldo es de: " + saldo);
                    concesionarias.add(new Concesionaria(name, dire, concesionarias.size() + 1, saldo));
                    System.out.println("Se ha añadido la concesionaria");
                    break;
                case 2:
                    int numMod = 1;
                    for (Concesionaria concesionaria : concesionarias) {
                        System.out.println("#" + numMod + ": " + concesionaria);
                        numMod++;
                    }
                    System.out.print("Eliga que concesionaria desea modificar: ");
                    int numConce = scConce.nextInt();
                    if (numConce < 0 || numConce > concesionarias.size()) {
                        System.out.println("Opcion Invalida");
                    } else {
                        System.out.print("Ingrese la nueva direccion: ");
                        String newDire = scConce.nextLine();
                        newDire = scConce.nextLine();
                        concesionarias.get(numConce - 1).setDireccion(newDire);
                        System.out.println("Se ha cambiado la dirrecion");
                    }
                    break;
                case 3:
                    int numMElim = 1;
                    for (Concesionaria concesionaria : concesionarias) {
                        System.out.println("#" + numMElim + ": " + concesionaria);
                        numMElim++;
                    }
                    System.out.print("Eliga que concesionaria desea eliminar: ");
                    int num = scConce.nextInt();
                    if (num < 0 || num > concesionarias.size()) {
                        System.out.println("Opcion Invalida");
                    } else {
                        concesionarias.remove(num - 1);
                        System.out.println("Se ha eliminado concesionaria");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 4);
        return concesionarias;
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
                    if (clientes.size() > 0) {
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
        int llantas;
        do {
            System.out.print("Ingrese cuantas llantas tiene el vehiculo [2 / 4]: ");
            llantas = scVehi.nextInt();
            if (llantas == 2) {
                int tipoInt;
                do {
                    System.out.println("---------------");
                    System.out.print("""
                               [1] Motocicleta
                               [2] Bicicleta 
                               """);
                    System.out.println("---------------");
                    System.out.print("¿Que desea añadir? ");
                    tipoInt = scVehi.nextInt();
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
                        while (yearMoto < 0) {
                            System.out.println("No se acceptan numeros negativos");
                            System.out.print("Ingrese el año de fabricacion: ");
                            yearMoto = scVehi.nextInt();
                        }
                        System.out.print("Ingrese el precio del vehículo: ");
                        int precioMoto = scVehi.nextInt();
                        while (precioMoto < 0) {
                            System.out.println("No se acceptan numeros negativos");
                            System.out.print("Ingrese el precio: ");
                            precioMoto = scVehi.nextInt();
                        }
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
                        while (yearBici < 0) {
                            System.out.println("No se acceptan numeros negativos");
                            System.out.print("Ingrese el año de fabricacion: ");
                            yearBici = scVehi.nextInt();
                        }
                        System.out.print("Ingrese el precio del vehículo: ");
                        int precioBici = scVehi.nextInt();
                        while (precioBici < 0) {
                            System.out.println("No se acceptan numeros negativos");
                            System.out.print("Ingrese el precio: ");
                            precioBici = scVehi.nextInt();
                        }
                        int cantLlantas = 2;
                        System.out.print("Ingrese el radio de la rueda ");
                        double radio = scVehi.nextDouble();
                        while (radio < 0) {
                            System.out.println("No se acceptan numeros negativos");
                            System.out.print("Ingrese el radio: ");
                            radio = scVehi.nextDouble();
                        }
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
                } while (tipoInt != 1 && tipoInt != 2);
            } else if (llantas == 4) {
                System.out.println("---------------");
                System.out.print("""
                               [1] Carro
                               [2] Camion
                               [3] Bus
                               """);
                System.out.println("---------------");
                System.out.print("Seleccione el vehiculo a agregar: ");
                int tipo = scVehi.nextInt();
                if (tipo == 1) {
                    System.out.print("Ingrese el color del vehiculo: ");
                    String color = scVehi.nextLine();
                    color = scVehi.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = scVehi.nextLine();
                    System.out.print("Ingrese el modelo del vehiculo: ");
                    String modelo = scVehi.nextLine();
                    System.out.print("Ingrese el año de fabricación: ");
                    int year = scVehi.nextInt();
                    while (year < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el año de fabricacion: ");
                        year = scVehi.nextInt();
                    }
                    System.out.print("Ingrese el precio del vehículo: ");
                    int precio = scVehi.nextInt();
                    while (precio < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el precio: ");
                        precio = scVehi.nextInt();
                    }
                    int cantLlantas = 4;
                    System.out.print("Ingrese la cantidad de puertas: ");
                    int puertas = scVehi.nextInt();
                    while (puertas < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese la cantidad de puertas: ");
                        puertas = scVehi.nextInt();
                    }
                    System.out.print("Ingrese la velocidad maxima: ");
                    int velocidadMax = scVehi.nextInt();
                    while (velocidadMax < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese la velocidad maxima: ");
                        velocidadMax = scVehi.nextInt();
                    }
                    System.out.print("Ingrese una descripcion del vehiculo: ");
                    String descripcion = scVehi.nextLine();
                    descripcion = scVehi.nextLine();
                    Carro carro = new Carro(puertas, velocidadMax, descripcion, color, marca, modelo, year, precio, cantLlantas);
                    return carro;
                } else if (tipo == 2) {
                    System.out.print("Ingrese el color del vehiculo: ");
                    String color = scVehi.nextLine();
                    color = scVehi.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = scVehi.nextLine();
                    System.out.print("Ingrese el modelo del vehiculo: ");
                    String modelo = scVehi.nextLine();
                    System.out.print("Ingrese el año de fabricación: ");
                    int year = scVehi.nextInt();
                    while (year < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el año de fabricacion: ");
                        year = scVehi.nextInt();
                    }
                    System.out.print("Ingrese el precio del vehículo: ");
                    int precio = scVehi.nextInt();
                    while (precio < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el precio: ");
                        precio = scVehi.nextInt();
                    }
                    int cantLlantas = 4;
                    System.out.print("Ingrese el volumen de carga: ");
                    int volumen = scVehi.nextInt();
                    while (volumen < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el volumen de carga: ");
                        volumen = scVehi.nextInt();
                    }
                    System.out.print("Ingrese la altura: ");
                    int altura = scVehi.nextInt();
                    while (altura < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese la altura: ");
                        altura = scVehi.nextInt();
                    }
                    char caracter;
                    boolean retro = false;
                    do {
                        System.out.print("¿Es el camion una retroexcavadora? [S/N]: ");
                        caracter = scVehi.next().charAt(0);
                        if (caracter == 's' || caracter == 'S' || caracter == 'n' || caracter == 'N') {
                            if (caracter == 's' || caracter == 'S') {
                                retro = true;
                            } else {
                                retro = false;
                            }
                        } else {
                            System.out.println("Opcion Invalida");
                        }
                    } while (caracter != 's' && caracter != 'S' && caracter != 'n' && caracter != 'N');
                    Camion camion = new Camion(volumen, altura, retro, color, marca, modelo, year, precio, cantLlantas);
                    return camion;
                } else if (tipo == 3) {
                    System.out.print("Ingrese el color del vehiculo: ");
                    String color = scVehi.nextLine();
                    color = scVehi.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = scVehi.nextLine();
                    System.out.print("Ingrese el modelo del vehiculo: ");
                    String modelo = scVehi.nextLine();
                    System.out.print("Ingrese el año de fabricación: ");
                    int year = scVehi.nextInt();
                    while (year < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el año de fabricacion: ");
                        year = scVehi.nextInt();
                    }
                    System.out.print("Ingrese el precio del vehículo: ");
                    int precio = scVehi.nextInt();
                    while (precio < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese el precio: ");
                        precio = scVehi.nextInt();
                    }
                    int cantLlantas = 4;
                    System.out.print("Ingrese la capacidad de pasajeros que tiene el bus: ");
                    int cantidad = scVehi.nextInt();
                    while (cantidad < 0) {
                        System.out.println("No se acceptan numeros negativos");
                        System.out.print("Ingrese la capacidad de pasajeros: ");
                        cantidad = scVehi.nextInt();
                    }
                    Bus bus = new Bus(cantidad, color, marca, modelo, year, precio, cantLlantas);
                    return bus;
                } else {
                    System.out.println("Opcion Invalida");
                }
            } else {
                System.out.println("Opcion Invalida");
            }
        } while (llantas != 2 && llantas != 4);
        return null;
    }

}
