package entidades;

public class Vendedor extends Empleado {
private int porcenComision;
private int totalVentas;
public double sueldo;
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public int getPorcenComision() {
	return porcenComision;
}
public void setPorcenComision(int porcenComision) {
	this.porcenComision = porcenComision;
}
public int getTotalVentas() {
	return totalVentas;
}
public void setTotalVentas(int totalVentas) {
	this.totalVentas = totalVentas;
}
public double getSueldo() {
	this.sueldo = this.sueldoBase + (this.porcenComision*this.totalVentas/100);
	return sueldo;
}

public Vendedor() {
	this.setPorcenComision(0);
	this.setTotalVentas(0);
}

public Vendedor(int porcenComision, int totalVentas, int dni, String apellido, String nombre, String email, float sueldoBase) {
	super(dni,apellido,nombre,email,sueldoBase);
	this.setPorcenComision(porcenComision);
	this.setTotalVentas(totalVentas);
}
}
