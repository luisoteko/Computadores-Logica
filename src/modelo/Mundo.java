package modelo;

import java.util.ArrayList;

public class Mundo {
	
	ArrayList<Computador>listacomputadores;
	ArrayList<Computador>gamer;
	ArrayList<Computador>programador;
	ArrayList<Computador>diseñador;
	ArrayList<Computador>usonormal;

	
	public Mundo() {
		listacomputadores = new ArrayList<Computador>();
		gamer = new ArrayList<Computador>();
		programador = new ArrayList<Computador>();
		diseñador = new ArrayList<Computador>();
		usonormal = new ArrayList<Computador>();
		programador.add(new Computador(16, 512, "Intel Core i7 2.6GHz", "NVIDIA GTX965M", 1200, "Lenovo Miix 320"));
		programador.add(new Computador(4, 512, "Intel Core i7 3.3GHz", "Intel Iris Graphics 550", 1150, "CHUWI lapbook Air"));
		programador.add(new Computador(4, 256, "Intel Core i5 2.6GHz", "NVIDIA GeForce 940MX", 460, "HP Notebook 15-bs040ns"));
    programador.add(new Computador(8, 1024, "Intel Core i5 2.6GHz", "Integrated", 420, "Acer Extensa 2540"));
		//programador.add(new Computador(16, 512, "Intel Core i7 2.6GHz", "NVIDIA GTX965M", 10, "Microsoft Surface Book"));

		diseñador.add(new Computador(16, 256, "Intel Core i7 2.6GHz", "Gigabyte RTX 1050 Ti", 620, "Microsoft Surface Book 2"));
		diseñador.add(new Computador(32, 512, "Intel Xeon", "Nvidia RTX 2070 Super", 720, "Asus ZenBook 13 UX333"));
		diseñador.add(new Computador(16, 512, "Intel Core i7 3.3", "Gigabyte RTX 1050 Ti", 1200, "Lenovo ThinkBook 13s"));
		diseñador.add(new Computador(8, 1024, "Intel Core i5 2.6", "Nvidia RTX 2070 Super", 1400, "Acer Chromebook 514"));

		//usonormal.add(new Computador(4,256, "Intel Core i5 2.6", "Integrated", 600, "MacBook pro" ));

    gamer.add(new Computador(4, 64, "Intel Core i3", "Integrated", 900, "Acer Predator Helios 300"));
    gamer.add(new Computador(4, 64, "Intel Core i7", "Integrated", 900, "MSI GF63 Thin"));
    gamer.add(new Computador(4, 64, "Intel Core i3", "Integrated", 1800, "Acer Nitro 5 (2018)"));
    gamer.add(new Computador(4, 64, "Intel Core i9", "Integrated", 1900, "MSI GV62 8RD-200"));

  }
	
    public ArrayList<Computador> getListacomputadores() {
    	return listacomputadores;
    }
	public void setListacomputadores(ArrayList<Computador> listacomputadores) {
		this.listacomputadores = listacomputadores;
	}

	public ArrayList<Computador> getGamer() {
		return gamer;
	}

	public ArrayList<Computador> getProgramador() {
		return programador;
	}

	public ArrayList<Computador> getDiseñador() {
		return diseñador;
	}

	public ArrayList<Computador> getUsonormal() {
		return usonormal;
	}
}
