package javaBasic.arregloObjetos;

public class CasaRefinada {
	private String nombre;
	private int alto;
	private int ancho;
	public CasaRefinada(String nombre, int alto, int ancho) {
		setNombre(nombre);
		setAlto(alto);
		setAncho(ancho);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public String altoPorAncho()
	{
		String altoXancho;
		altoXancho = alto+" x "+ancho;
		return altoXancho;
	}
	public boolean seconsideraGrande()
	{
		if(alto*ancho>500) {
			return true;
		}else
		{
			return false;
		}
	}
}
