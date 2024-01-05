/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.publishing;

/**
 *
 * @author dell
 */
public class Editor extends Empleado {
  private boolean edicionElectronica;

    // Constructor
    public Editor(String nombre, String idEmpleado, int edad, String email, String telefono, boolean edicionElectronica) {
        super(nombre, "Editor", idEmpleado, edad, email, telefono);
        this.edicionElectronica = edicionElectronica;
    }

    @Override
    public void mostrarInformacion() {
        // Implementa la lógica para mostrar la información específica del editor
        System.out.println("Información del Editor: " + getNombre() + ", " + getEdad() + " años, Edición Electrónica: " + edicionElectronica);
    } 
}
