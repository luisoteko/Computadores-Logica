package controlador;

import java.util.ArrayList;

import modelo.Computador;

public class Controlador {
	
	public static ArrayList<Computador> buscarListaComputadores(int precioMinimo, int precioMaximo, ArrayList<Computador> listaComputadors){
		ArrayList<Computador>menores = new ArrayList<Computador>();
		
		for (int i = 0; i < listaComputadors.size(); i++) {
			if (listaComputadors.get(i).getPrecio()>=precioMinimo && listaComputadors.get(i).getPrecio()<=precioMaximo) {
				menores.add(listaComputadors.get(i));
			}
		}
		return menores;
	}
	public static Computador buscarComputador(String nombre, ArrayList<Computador> lista){
		for (Computador computadorx:lista){
			if (computadorx.getNombre().equals(nombre)){
				return computadorx;
			}
		}
		return null;
	}

}
