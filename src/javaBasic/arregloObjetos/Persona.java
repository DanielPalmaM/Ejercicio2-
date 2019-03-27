package javaBasic.arregloObjetos;

public class Persona {
	String Nombre;
	String Apellido;
	int Edad;
	int Salario;
	
	public Persona (String Nombre, String Apellido, int Edad, int Salario) {
		setNombre(Nombre);
		setApellido(Apellido);
		setEdad(Edad);
		setSalario(Salario);
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
}
