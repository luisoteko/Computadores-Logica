package controlador;

import modelo.Computador;
import vista.VentanaPrincipal;

import java.util.ArrayList;

public class Lanzador {

	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(new ArrayList<Computador>());
	}

}

 