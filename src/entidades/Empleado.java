package entidades;

public abstract class Empleado {
	public int dni;
	
	public String apellido;
	
	public String nombre;
	
	public String email;
	
	public double sueldo;
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	protected float sueldoBase;
	
	public int getDni() {

		return dni;
	}
	public void setDni(int dni) {

		this.dni = dni;
	}
	public String getApellido() {

		return apellido;
	}
	public void setApellido(String apellido) {

		this.apellido = apellido;
	}
	public String getNombre() {

		return nombre;
	}
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
	public String getEmail() {

		return email;
	}
	public void setEmail(String email) {

		this.email = email;
	}
	public float getSueldoBase() {

		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {

		this.sueldoBase = sueldoBase;
	}
	
	public Empleado() {
		this(0,"Sabe","Nadie","nada@gmail,com",0);
	}
	
	public Empleado(int dni, String apellido, String nombre, String email, float sueldoBase) {
		this.setDni(dni);
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setEmail(email);
		this.setSueldoBase(sueldoBase);
	}
	}
