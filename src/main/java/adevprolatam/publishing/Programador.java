/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.publishing;
import java.util.List;
/**
 *
 * @author dell
 */

public class Programador extends Empleado {
    private List<String> habilidades;

    // Constructor
    public Programador(String nombre, String idEmpleado, int edad, String email, String telefono, List<String> habilidades) {
        super(nombre, "Programador", idEmpleado, edad, email, telefono);
        this.habilidades = habilidades;
    }
     @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cargo: " + getCargo());
        // Mostrar otros atributos comunes y específicos
        System.out.println("Habilidades: " + habilidades);
    }  
}
