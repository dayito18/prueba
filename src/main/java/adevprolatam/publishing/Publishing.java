/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.publishing;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Publishing {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     List<Empleado> empleados = new ArrayList<>();
     Gerente gerente = null;

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Registro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                if (gerente == null) {
                    gerente = ingresarGerente(scanner);
                    empleados.add(gerente);
                }

                do {
                    System.out.println("\nSubmenú de Empleados:");
                    System.out.println("1. Ingresar Programador");
                    System.out.println("2. Ingresar Ilustrador Gráfico");
                    System.out.println("3. Ingresar Editor");
                    System.out.println("0. Volver al Menú Principal");
                    System.out.print("Seleccione una opción: ");
                    int subOpcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (subOpcion) {
                        case 1:
                            empleados.add(ingresarProgramador(scanner));
                            break;
                        case 2:
                            empleados.add(ingresarIlustrador(scanner));
                            break;
                        case 3:
                            empleados.add(ingresarEditor(scanner));
                            break;
                        case 0:
                            break; // Salir del submenú
                        default:
                            System.out.println("Opción no válida. Inténtelo de nuevo.");
                            break;
                    }

                    System.out.print("¿Desea ingresar otro empleado? (S/N): ");
                } while (scanner.next().equalsIgnoreCase("S"));

                break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 0);

        // Mostrar información de todos los empleados ingresados
        System.out.println("\nInformación de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }

        scanner.close();
    }
    
    
    
    //PROGRAMADOR
     private static Programador ingresarProgramador(Scanner scanner) {
        System.out.println("Ingrese información del Programador:");
        System.out.print("Nombre: ");
        String nombreProgramador = scanner.nextLine();
        System.out.print("ID de Empleado: ");
        String idProgramador = scanner.nextLine();
        System.out.print("Edad: ");
        int edadProgramador = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Email: ");
        String emailProgramador = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoProgramador = scanner.nextLine();
        System.out.print("Habilidades (separadas por comas): ");
        String habilidadesInput = scanner.nextLine();
        List<String> habilidadesProgramador = new ArrayList<>();
        for (String habilidad : habilidadesInput.split(",")) {
            habilidadesProgramador.add(habilidad.trim());
        }
        Programador programador = new Programador(nombreProgramador, idProgramador, edadProgramador, emailProgramador, telefonoProgramador, habilidadesProgramador);      
        return programador;
    }
     
    //ILUSTRADOR
    private static IlustradorGrafico ingresarIlustrador(Scanner scanner) {
        System.out.println("\nIngrese información del Ilustrador Gráfico:");
        System.out.print("Nombre: ");
        String nombreIlustrador = scanner.nextLine();
        System.out.print("ID de Empleado: ");
        String idIlustrador = scanner.nextLine();
        System.out.print("Edad: ");
        int edadIlustrador = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Email: ");
        String emailIlustrador = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoIlustrador = scanner.nextLine();
        System.out.print("Habilidades (separadas por comas): ");
        String habilidadesIlustradorInput = scanner.nextLine();
        List<String> habilidadesIlustradorList = new ArrayList<>();
        for (String habilidad : habilidadesIlustradorInput.split(",")) {
            habilidadesIlustradorList.add(habilidad.trim());
        }
        IlustradorGrafico ilustrador = new IlustradorGrafico(nombreIlustrador, idIlustrador, edadIlustrador, emailIlustrador, telefonoIlustrador, habilidadesIlustradorList);
        return ilustrador;
    }
    
//GERENTE   
private static Gerente ingresarGerente(Scanner scanner) {
    System.out.println("\nIngrese información del Gerente:");
    System.out.print("Nombre: ");
    String nombreGerente = scanner.nextLine();
    System.out.print("ID de Empleado: ");
    String idGerente = scanner.nextLine();
    System.out.print("Edad: ");
    int edadGerente = scanner.nextInt();
    scanner.nextLine();  // Consumir el salto de línea
    System.out.print("Email: ");
    String emailGerente = scanner.nextLine();
    System.out.print("Teléfono: ");
    String telefonoGerente = scanner.nextLine();

    return new Gerente(nombreGerente, idGerente, edadGerente, emailGerente, telefonoGerente, new ArrayList<>());
}


    //EDITOR
    private static Editor ingresarEditor(Scanner scanner) {
        System.out.println("\nIngrese información del Editor:");
        System.out.print("Nombre: ");
        String nombreEditor = scanner.nextLine();
        System.out.print("ID de Empleado: ");
        String idEditor = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEditor = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Email: ");
        String emailEditor = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEditor = scanner.nextLine();
        System.out.print("Preferencia de edición (true para electrónica, false para papel): ");
        boolean edicionElectronica = scanner.nextBoolean();
        Editor editor = new Editor(nombreEditor, idEditor, edadEditor, emailEditor, telefonoEditor, edicionElectronica);
        return editor;
    }
          
}
