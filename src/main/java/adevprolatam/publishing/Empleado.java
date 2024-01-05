/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.publishing;

/**
 *
 * @author dell
 */
public abstract class Empleado {
   private String nombre;
    private String cargo;
    private String id;
    private int edad;
    private String email;
    private String telefono;

    // Constructor
    public Empleado(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = idEmpleado;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
    public abstract void mostrarInformacion();
}
