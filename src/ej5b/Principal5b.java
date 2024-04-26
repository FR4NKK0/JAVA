package ej5b;

public class Principal5b {
public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
    ArrayList <Empleado> empleados = new ArrayList<>();
		for(int i = 0; i  <  20; i++) {
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
	            empleados.add(new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes));
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
	            empleados.add(new Vendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas));
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
