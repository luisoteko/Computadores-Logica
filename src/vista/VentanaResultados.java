package vista;

import controlador.Controlador;
import modelo.Computador;
import modelo.Mundo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VentanaResultados extends JFrame implements ActionListener{
	private JPanel panelcentral;
	private JComboBox<String> presupuesto,ram1, disco1,procesador1,tarjeta1;
	private JComboBox<String>seleccion;
	private JLabel tituloJLabel;
	private JButton agregarButton;
	private JLabel imagen;
	private Mundo mundo;
	private int precioMaximo;
	private int precioMinimo;

	public VentanaResultados() {
		setTitle("Administracion");
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		mundo = new Mundo();

		panelcentral = new JPanel();
		panelcentral.setBounds(0,0, 900, 600);
		panelcentral.setLayout(null);
		panelcentral.setBackground(new Color(105,40,255));
		
		tituloJLabel = new JLabel("Seleciona su uso");
		tituloJLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		tituloJLabel.setBounds(20, 150, 127, 34);
		panelcentral.add(tituloJLabel);
		
		JLabel presupuesto1 = new JLabel("Presupuesto");
		presupuesto1.setFont(new Font("Times New Roman",Font.BOLD, 17));
		presupuesto1.setBounds(20, 200, 150, 30);
		
		
		presupuesto = new JComboBox<String>();
    presupuesto.removeAllItems();
    presupuesto.addItem("Menor a 500 dolares");
    presupuesto.addItem("Mayor a 500 dolares");

    presupuesto.setBounds(150, 200, 150, 30);
		panelcentral.add(presupuesto);
		panelcentral.add(presupuesto1);

		JLabel ram2 = new JLabel("Ram");
		ram2.setFont(new Font("Times New Roman",Font.BOLD, 17));
		ram2.setBounds(20, 240, 150, 30);
		
		ram1 = new JComboBox<String>();
    ram1.removeAllItems();
    ram1.addItem("Menor a 8 GB");
    ram1.addItem("Mayor o igual a 8 GB");
		ram1.setBounds(150, 240, 150, 30);
		panelcentral.add(ram1);
		panelcentral.add(ram2);
		
		JLabel discoduro = new JLabel("Disco Duro");
		discoduro.setFont(new Font("Times New Roman",Font.BOLD, 17));
		discoduro.setBounds(20, 280, 150, 30);
		
		disco1 = new JComboBox<String>();
    disco1.removeAllItems();
    disco1.addItem("Menos de 500 GB");
    disco1.addItem("Entre 500 GB y 2 TB");
    disco1.addItem("Mas de 2 TB");
		disco1.setBounds(150, 280,150,30);
		panelcentral.add(disco1);
		panelcentral.add(discoduro);

		JLabel procesador2 = new JLabel("Procesador");
		procesador2.setFont(new Font("Times New Roman",Font.BOLD, 17));
		procesador2.setBounds(20, 322, 150, 30);
		
		procesador1 = new JComboBox<String>();
    procesador1.removeAllItems();
    procesador1.addItem("Inferior a Core I3");
    procesador1.addItem("Entre Core I3 y Core I7");
    procesador1.addItem("Mayor a Core I7");
		procesador1.setBounds(150, 322,150,30);
		panelcentral.add(procesador1);
		panelcentral.add(procesador2);

		JLabel tarjeta3 = new JLabel("Tarjeta Grafica");
		tarjeta3.setFont(new Font("Times New Roman",Font.BOLD, 17));
		tarjeta3.setBounds(20, 362, 150, 30);
		
		tarjeta1 = new JComboBox<String>();
    tarjeta1.removeAllItems();
    tarjeta1.addItem("Integrada");
    tarjeta1.addItem("Nvidia 940 MX");
		tarjeta1.setBounds(150, 362,150,30);
		panelcentral.add(tarjeta1);
		panelcentral.add(tarjeta3);

		seleccion = new JComboBox<String>();
		seleccion.addItem("Programador");
		seleccion.addItem("Diseñador");
		//seleccion.addItem("Uso normal");
		seleccion.addItem("Gamer");
		seleccion.addActionListener(this);
		seleccion.setBounds(150, 150, 150, 30);
		
		agregarButton = new JButton("BUSCAR");
		agregarButton.setBounds(120, 500, 150, 30);
		agregarButton.setActionCommand("buscar");
		agregarButton.addActionListener(this);
		panelcentral.add(agregarButton);
		
		
		imagen = new JLabel();
		ImageIcon auxImagenIcon = new ImageIcon(VentanaResultados.class.getResource("/images/tecnologia.png"));
		imagen.setIcon(new ImageIcon(auxImagenIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		imagen.setBounds(400, 150, 400, 300);
		
		panelcentral.add(seleccion);
		panelcentral.add(imagen);
		add(panelcentral);
	}
	public static void main(String[] args) {
		VentanaResultados vemVentanaResultados = new VentanaResultados();
		vemVentanaResultados.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		if (comando.equals("buscar")) {
			ArrayList<Computador> arreglo =
				(seleccion.getSelectedItem().equals("Programador")?
					mundo.getProgramador():
					((seleccion.getSelectedItem().equals("Diseñador")?
						mundo.getDiseñador():
						((seleccion.getSelectedItem().equals("Gamer"))?
							mundo.getGamer():mundo.getUsonormal()))));

				if (presupuesto.getSelectedItem().equals("Mayor a 500 dolares")) {
					precioMinimo = 500;
					precioMaximo = 999999999;
				} else if(presupuesto.getSelectedItem().equals("Menor a 500 dolares")){
					precioMinimo = 0;
					precioMaximo = 500;
				} else if (presupuesto.getSelectedItem().equals("Mayor a 1200 dolares")) {
          precioMinimo = 1200;
          precioMaximo = 999999999;
        } else if(presupuesto.getSelectedItem().equals("Menor a 1200 dolares")) {
          precioMinimo = 0;
          precioMaximo = 1200;
        }else if (presupuesto.getSelectedItem().equals("Mayor a 1700 dolares")) {
          precioMinimo = 1700;
          precioMaximo = 999999999;
        } else if(presupuesto.getSelectedItem().equals("Menor a 1700 dolares")) {
          precioMinimo = 0;
          precioMaximo = 1700;
        }

			VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(arreglo);
      ventanaPrincipal.getListacomputadores().removeAll();
			for (Computador c: Controlador.buscarListaComputadores(precioMinimo,precioMaximo,arreglo)){
				ventanaPrincipal.getModeloListaComputadores().addElement(c.getNombre());
			}
			ventanaPrincipal.getListacomputadores().setModel(ventanaPrincipal.getModeloListaComputadores());
			ventanaPrincipal.setVisible(true);
		}

		if(evento.getSource()==seleccion) {
			if(seleccion.getSelectedItem().equals("Programador")) {
				presupuesto.removeAllItems();
				presupuesto.addItem("Menor a 500 dolares");
				presupuesto.addItem("Mayor a 500 dolares");

				ram1.removeAllItems();
				ram1.addItem("Menor a 8 GB");
				ram1.addItem("Mayor o igual a 8 GB");

				disco1.removeAllItems();
				disco1.addItem("Menos de 500 GB");
				disco1.addItem("Entre 500 GB y 2 TB");
				disco1.addItem("Mas de 2 TB");
				
				procesador1.removeAllItems();
				procesador1.addItem("Inferior a Core I3");
				procesador1.addItem("Entre Core I3 y Core I7");
				procesador1.addItem("Mayor a Core I7");
				
				tarjeta1.removeAllItems();
				tarjeta1.addItem("Integrada");
				tarjeta1.addItem("Nvidia 940 MX");
				
				
				
			} else if (seleccion.getSelectedItem().equals("Gamer")) {
				
				presupuesto.removeAllItems();

        presupuesto.removeAllItems();
        presupuesto.addItem("Menor a 1700 dolares");
        presupuesto.addItem("Mayor a 1700 dolares");

        ram1.removeAllItems();
        ram1.addItem("Menor a 8 GB");
        ram1.addItem("Mayor o igual a 8 GB");

        disco1.removeAllItems();
        disco1.addItem("Menos de 500 GB");
        disco1.addItem("Entre 500 GB y 2 TB");
        disco1.addItem("Mas de 2 TB");

        procesador1.removeAllItems();
        procesador1.addItem("Inferior a Core I5");
        procesador1.addItem("Entre Core I5 y Core I7");
        procesador1.addItem("Mayor a Core I7");

        tarjeta1.removeAllItems();
        tarjeta1.addItem("Integrada");
        tarjeta1.addItem("Nvidia 940 MX");
				
				
			
		} else if (seleccion.getSelectedItem().equals("Diseñador")) {
			presupuesto.removeAllItems();
        presupuesto.removeAllItems();
        presupuesto.addItem("Menor a 1200 dolares");
        presupuesto.addItem("Mayor a 1200 dolares");

        ram1.removeAllItems();
        ram1.addItem("Menor a 8 GB");
        ram1.addItem("Mayor o igual a 8 GB");

        disco1.removeAllItems();
        disco1.addItem("Menos de 500 GB");
        disco1.addItem("Entre 500 GB y 2 TB");
        disco1.addItem("Mas de 2 TB");

        procesador1.removeAllItems();
        procesador1.addItem("Inferior a Core I3");
        procesador1.addItem("Entre Core I3 y Core I7");
        procesador1.addItem("Mayor a Core I7");

        tarjeta1.removeAllItems();
        tarjeta1.addItem("Inferior a Gigabyte RTX 1050 Ti");
        tarjeta1.addItem("Inferior o igual a Nvidia RTX 2070 Super");
			
		}
			else if (seleccion.getSelectedItem().equals("Uso normal")) {
			presupuesto.removeAllItems();

        presupuesto.removeAllItems();
        presupuesto.addItem("Menor a 800 dolares");
        presupuesto.addItem("Mayor a 800 dolares");

        ram1.removeAllItems();
        ram1.addItem("Menor a 8 GB");
        ram1.addItem("Mayor o igual a 8 GB");

        disco1.removeAllItems();
        disco1.addItem("Menos de 500 GB");
        disco1.addItem("Entre 500 GB y 1 TB");
        disco1.addItem("Mas de 1 TB");

        procesador1.removeAllItems();
        procesador1.addItem("Inferior a Core I3");
        procesador1.addItem("Entre Core I3 y Core I7");
        procesador1.addItem("Mayor a Core I7");

        tarjeta1.removeAllItems();
        tarjeta1.addItem("Integrada");
        tarjeta1.addItem("Nvidia 940 MX");

		}
		}
	}
	
}