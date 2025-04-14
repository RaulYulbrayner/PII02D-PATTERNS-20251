package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Flor;
import co.edu.uniquindio.poo.model.MiniMapa;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Se crea en nuevo MiniMapa de 8x8 con indices de 0-7
        MiniMapa mapa = new MiniMapa(8,8);

        //Se plantan flores por defecto en posiciones especificas
        mapa.plantarFlor(7, 7, "Cerezo");
        mapa.plantarFlor(7, 2, "Cerezo");
        mapa.plantarFlor(4, 5, "Tulipan");
        mapa.plantarFlor(6, 3, "Rosa");
        mapa.plantarFlor(2,3, "Margarita");

        //Bienvenida
        System.out.println("===================================");
        System.out.println("Bienvenido al MiniMapa con Flores");
        System.out.println("===================================");

        boolean ejecutando = true;

        //Mostrar el mmapa inicial con las flores predeterminadas
        mapa.mostrarMapa();

        //Bucle del menu principal
        while(ejecutando) {
        System.out.println("\n------- MENU PRINCIPAL -------");
        System.out.print("\n1.Plantar flor. ");
        System.out.print("\n2.Mostrar mapa. ");
        System.out.print("\n3.Imprimir flores plantadas. ");
        System.out.print("\n4.Salir. ");
        System.out.print("\nEscribe tu opcion: ");

        String opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    //Opcion para plantar una nueva flor
                    try {
                        System.out.print("En que posicion en x quiere plantar flor: ");
                        int x = sc.nextInt();
                        System.out.print("En que posicion en y quiere plantar flor: ");
                        int y = sc.nextInt();
                        sc.nextLine();

                        //Seleccion del tipo de flor
                        System.out.print("Que tipo de flor desea plantar (Margarita, Tulipan, Rosa, Cerezo): ");
                        System.out.print("\n1.Margarita: 🌼");
                        System.out.print("\n2.Tulipan 🌷 ");
                        System.out.print("\n3.Rosa 🌹");
                        System.out.println("\n4.Cerezo 🌸");
                        String tipo = "";
                        String opcionTipo = sc.nextLine();
                        tipo = switch (opcionTipo) {
                            case "1" -> "Margarita";
                            case "2" -> "Tulipan";
                            case "3" -> "Rosa";
                            case "4" -> "Cerezo";
                            default -> tipo;
                        };

                        //Se planta la flor
                        mapa.plantarFlor(x-1, y-1, tipo);
                        System.out.println("Flor plantada con exito.");
                    }
                    catch(Exception e){
                        System.out.println("Entrada inválida. Intenta de nuevo.");
                    }
                    break;

                case "2":
                    //Mostrar el estado actual del mapa
                     mapa.mostrarMapa();
                    break;

                case "3":
                    //Mostrar lista de flores plantadas y el codigo en la memoria del tipo (Flyweight)
                    for(Flor flor : mapa.getFlores()){
                        System.out.println(flor.toString() + " Código en memoria: " + System.identityHashCode(flor.getTipo()));//!!!!!!!!!
                        //Esto permite comprobar que las flores del mismo tipo comparten el mismo tipo de objeto TipoFlot
                    }
                    break;

                case "4":
                    //Salir del programa
                    ejecutando = false;
                    break;

            }
        }

    }
}