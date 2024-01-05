/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.publishing;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class Gerente extends Empleado {
    private List<Empleado> empleadosDirigidos;

    // Constructor
    public Gerente(String nombre, String idEmpleado, int edad, String email, String telefono, List<Empleado> empleadosDirigidos) {
        super(nombre, "Gerente", idEmpleado, edad, email, telefono);
        this.empleadosDirigidos = empleadosDirigidos;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cargo: " + getCargo());
        // Mostrar otros atributos comunes y específicos
        System.out.println("Empleados dirigidos: ");
        for (Empleado empleado : empleadosDirigidos) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("------");
        }
    }

    // Método para agregar empleado dirigido
    public void agregarEmpleadoDirigido(Empleado empleado) {
        empleadosDirigidos.add(empleado);
    }
}
