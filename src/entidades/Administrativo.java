package entidades;

public class Administrativo extends Empleado {
	private int hsextra;
	private int hsmes;
	public double sueldo;
	public int getHsextra() {
		return hsextra;
	}
	public void setHsextra(int hsextra) {
		this.hsextra = hsextra;
	}
	public int getHsmes() {
		return hsmes;
	}
	public void setHsmes(int hsmes) {
		this.hsmes = hsmes;
	}
	
	public double getSueldo() {
		this.sueldo = this.sueldoBase * ((this.hsextra*1.5)+this.hsmes)/this.hsmes;
		return sueldo;
	}
	
	public Administrativo() {
		this.setHsextra(0);
		this.setHsmes(0);
	}
	
	public Administrativo(int hsextra, int hsmes, int dni, String apellido, String nombre, String email, float sueldoBase) {
		super(dni,apellido,nombre,email,sueldoBase);
		this.setHsextra(hsextra);
		this.setHsmes(hsmes);		
	}
	
	
}
