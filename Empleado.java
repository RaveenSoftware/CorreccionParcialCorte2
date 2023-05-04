/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcial_p2;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Empleado {
    
String nombre;
String apellido;
int DNI;
String direccion;
String anos_de_antiguedad;
int telefono;
String supervisor;
int salario;
int salarioConAumento;


    public Empleado() {
  
    }

    public Empleado(String nombre, String apellido, int DNI, String direccion, String anos_de_antiguedad, int telefono, String supervisor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.anos_de_antiguedad = anos_de_antiguedad;
        this.telefono = telefono;
        this.supervisor = supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnos_de_antiguedad() {
        return anos_de_antiguedad;
    }

    public void setAnos_de_antiguedad(String anos_de_antiguedad) {
        this.anos_de_antiguedad = anos_de_antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", direccion=" + direccion + ", anos_de_antiguedad=" + anos_de_antiguedad + ", telefono=" + telefono + ", supervisor=" + supervisor + '}';
    }




//Metodos
    
    public void incrementarSalario(){
        
        double aumento = salario * 0.1; // Cálculo del aumento (10% del salario)
        salarioConAumento += aumento; // Incremento del salario
        
    }



    
}
