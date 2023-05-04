/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.parcial_p2;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Coche
        Coche coche1 = new Coche("1234ABC", "Ford", "Focus");

        // Creamos un objeto de tipo Secretario
        Secretario secretario1 = new Secretario("Cali", "0021515", "Ramiro", "Contreras", 1200000, "Manzana 1 Casa 2", "3 años", 0, null);

        // Creamos un objeto de tipo Cliente
        Cliente cliente1 = new Cliente("12345678A", "María", "García", "Calle Real 2", "123456789");

        // Creamos un objeto de tipo Vendedor
        Vendedor vendedor1 = new Vendedor("Rafael", "Gutierrez", "1007456953", "Puerto Santander", "3254569875", 0, coche1,"Norte de Santander", 0);

        // Añadimos el cliente al vendedor
        vendedor1.darAltaCliente(cliente1);

        // Creamos un objeto de tipo JefeZona
        JefeZona jefe1 = new JefeZona(null, "Pedro", "Jaramillo", 0, "Bosque 2", " 2 años ", 0, null);

        // Añadimos el vendedor a la lista de vendedores del jefe de zona
        //jefe1.darDeAltaVendedor(vendedor1);

        // Imprimimos los datos del secretario, el vendedor y el jefe de zona
        System.out.println(secretario1);
        System.out.println(vendedor1);
        System.out.println(jefe1);

        // Incrementamos el salario de cada empleado
        secretario1.incrementarSalario();
        vendedor1.incrementarSalario();
        jefe1.incrementarSalario();

        // Imprimimos los datos actualizados de cada empleado
        System.out.println(secretario1);
        System.out.println(vendedor1);
        System.out.println(jefe1);
    }
}

