package ej5a;

import java.util.Scanner;
import entidades.*;
public class Principal5a {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Cuántos empleados deseas cargar? (máximo 20): ");
        int cantidadEmpleados = scanner.nextInt();
		Empleado[] empleados = new Empleado [cantidadEmpleados];
		for(int i = 0; i  < cantidadEmpleados; i++) {
			System.out.println("1. Administrativo \n 2.Vendedor  ");
			int flag = scanner.nextInt();
			if (flag==1) {
				System.out.println("\nEmpleado #" + (i + 1));
	            System.out.print("DNI: ");
	            int dni = scanner.nextInt();
	            System.out.print("Nombre: ");
	            String nombre = scanner.next();
	            System.out.print("Apellido: ");
	            String apellido = scanner.next();
	            System.out.print("Sueldo base: ");
	            float sueldoBase = scanner.nextFloat();
	            System.out.print("Mail: ");
	            String mail = scanner.next();
	            System.out.print("Horas extra: ");
	            int hsextra = scanner.nextInt();
	            System.out.print("Horas mes: ");
	            int hsmes = scanner.nextInt();
	            empleados[i] = new Administrativo(hsextra,  hsmes,  dni, apellido,  nombre, mail, sueldoBase);	
			}
			else {
				System.out.println("\nEmpleado #" + (i + 1));
	            System.out.print("DNI: ");
	            int dni = scanner.nextInt();
	            System.out.print("Nombre: ");
	            String nombre = scanner.next();
	            System.out.print("Apellido: ");
	            String apellido = scanner.next();
	            System.out.print("Sueldo base: ");
	            float sueldoBase = scanner.nextFloat();
	            System.out.print("Mail: ");
	            String mail = scanner.next();
	            System.out.print("Porcentaje Comision: ");
	            int porcenComision = scanner.nextInt();
	            System.out.print("Total Ventas: ");
	            int totalVentas = scanner.nextInt();
	            empleados[i] = new Vendedor(porcenComision,  totalVentas,  dni, apellido,  nombre, mail, sueldoBase);	
			}
		
		
		
	}
		System.out.println("\nLista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("DNI: " + empleado.dni +
                    ", Nombre: " + empleado.nombre +
                    ", Apellido: " + empleado.apellido +
                    ", Sueldo: " + empleado.getSueldo());
        }
	
		scanner.close();
	}
}
