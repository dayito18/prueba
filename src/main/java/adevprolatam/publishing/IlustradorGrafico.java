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
public class IlustradorGrafico extends Empleado {
    private List<String> habilidades;

    // Constructor
    public IlustradorGrafico(String nombre, String idEmpleado, int edad, String email, String telefono, List<String> habilidades) {
        super(nombre, "Ilustrador Gráfico", idEmpleado, edad, email, telefono);
        this.habilidades = habilidades;
    }

    // Métodos getters y setters
    @Override
    // Método para mostrar información del ilustrador gráfico
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cargo: " + getCargo());
        // Mostrar otros atributos comunes y específicos
        System.out.println("Habilidades: " + habilidades);
    }
}
