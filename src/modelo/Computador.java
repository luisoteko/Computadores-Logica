package modelo;

public class Computador {
	private int ram;
	private int discoduro;
	private String procesador;
	private String tarjetagrafica;
	private int precio;
	private String nombre;
	public Computador(int ram, int discoduro, String procesador, String tarjetagrafica, int precio, String nombre) {
		this.ram = ram;
		this.discoduro = discoduro;
		this.procesador = procesador;
		this.tarjetagrafica = tarjetagrafica;
		this.precio = precio;
		this.nombre = nombre;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		ram = ram;
	}
	public int getDiscoduro() {
		return discoduro;
	}
	public void setDiscoduro(int discoduro) {
		this.discoduro = discoduro;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getTarjetagrafica() {
		return tarjetagrafica;
	}
	public void setTarjetagrafica(String tarjetagrafica) {
		this.tarjetagrafica = tarjetagrafica;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	public String toString(){
		return "Nombre: " + nombre +
			"\nRam: " + ram + "GB" +
			"\nDisco Duro: " + discoduro + "GB" +
			"\nProcesador: " + procesador +
			"\nTarjeta Grafica: " + tarjetagrafica +
			"\nPrecio:" + precio;
	}
}
