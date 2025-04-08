package co.edu.uniquindio.poo;

import java.util.List;
import java.util.Scanner;

public class MenuInteractivo {
    public MenuInteractivo() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imagen imagen = new ImagenBase();

        while(true) {
            int opcion;
            while(true) {
                System.out.println("\n=== MENÚ DE FILTROS DE IMAGEN ===");
                System.out.println("1. Mostrar imagen con filtros actuales");
                System.out.println("2. Aplicar filtro Blanco y Negro");
                System.out.println("3. Aplicar filtro Sepia");
                System.out.println("4. Aplicar ajuste de Brillo");
                System.out.println("5. Aplicar ajuste de Contraste");
                System.out.println("6. Verificar si un filtro está aplicado");
                System.out.println("7. Contar filtros aplicados");
                System.out.println("8. Listar todos los filtros aplicados");
                System.out.println("9. Reiniciar (eliminar todos los filtros)");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (Exception var7) {
                    System.out.println("Por favor ingrese un número válido.");
                    scanner.nextLine();
                }
            }

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("\nResultado actual:");
                    System.out.println(imagen.mostrar());
                    break;
                case 2:
                    imagen = new FiltroBlancoNegro(imagen);
                    System.out.println("Filtro Blanco y Negro aplicado.");
                    break;
                case 3:
                    imagen = new FiltroSepia(imagen);
                    System.out.println("Filtro Sepia aplicado.");
                    break;
                case 4:
                    imagen = new AjusteBrillo(imagen);
                    System.out.println("Ajuste de Brillo aplicado.");
                    break;
                case 5:
                    imagen = new AjusteContraste(imagen);
                    System.out.println("Ajuste de Contraste aplicado.");
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del filtro a verificar: ");
                    String filtro = scanner.nextLine();
                    if (imagen.tieneFiltro(filtro)) {
                        System.out.println("El filtro '" + filtro + "' SÍ está aplicado.");
                    } else {
                        System.out.println("El filtro '" + filtro + "' NO está aplicado.");
                    }
                    break;
                case 7:
                    System.out.println("Número de filtros aplicados: " + imagen.contarFiltros());
                    break;
                case 8:
                    List<String> filtros = imagen.listarFiltrosAplicados();
                    if (filtros.isEmpty()) {
                        System.out.println("No hay filtros aplicados.");
                    } else {
                        System.out.println("Filtros aplicados (en orden de aplicación):");

                        for(int i = 0; i < filtros.size(); ++i) {
                            System.out.println(i + 1 + ". " + (String)filtros.get(i));
                        }
                    }
                    break;
                case 9:
                    imagen = new ImagenBase();
                    System.out.println("Todos los filtros han sido eliminados. Imagen reiniciada.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente nuevamente.");
            }
        }
    }
}
