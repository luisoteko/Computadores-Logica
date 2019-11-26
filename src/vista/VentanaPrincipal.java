package vista;

import controlador.Controlador;
import modelo.Computador;
import modelo.Mundo;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.zip.ZipEntry;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaPrincipal extends JFrame implements ListSelectionListener{
	private JPanel panelcentral;
	private JLabel imagen;
	private JList<String> listacomputadores;
	private DefaultListModel<String> modeloListaComputadores;
	private TextArea datos;
	private ArrayList<Computador> lista;
	
	public VentanaPrincipal(ArrayList<Computador> lista) {
		this.lista = lista;
		setTitle("Administracion");
		setSize(600, 500);
		setLocationRelativeTo(null);
		imagen = new JLabel();
		imagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/tecno7.jpg")));
		
		imagen.setBounds(0,0,600,500);
		

		panelcentral = new JPanel();
		panelcentral.setBackground(new Color(63,83,255,100));
		panelcentral.setLayout(null);
		panelcentral.setBounds(5, 200,350,350);

		
		add(panelcentral);

		modeloListaComputadores = new DefaultListModel<>();
		listacomputadores = new JList<>();
		listacomputadores.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		listacomputadores.setBounds(15, 40, 260,330);
		listacomputadores.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		listacomputadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listacomputadores.addListSelectionListener(this);
		panelcentral.add(listacomputadores);
		
		datos = new TextArea();
		datos.setBounds(295, 40, 250, 330);
		panelcentral.add(datos);
		
		panelcentral.add(imagen);
		
		setVisible(true);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

		Computador elegido = Controlador.buscarComputador(listacomputadores.getSelectedValue(), lista);
		datos.setText(elegido.toString());
	}

	public JPanel getPanelcentral() {
		return panelcentral;
	}

	public void setPanelcentral(JPanel panelcentral) {
		this.panelcentral = panelcentral;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JList<String> getListacomputadores() {
		return listacomputadores;
	}

	public void setListacomputadores(JList<String> listacomputadores) {
		this.listacomputadores = listacomputadores;
	}

	public DefaultListModel<String> getModeloListaComputadores() {
		return modeloListaComputadores;
	}

	public void setModeloListaComputadores(DefaultListModel<String> modeloListaComputadores) {
		this.modeloListaComputadores = modeloListaComputadores;
	}

	public TextArea getDatos() {
		return datos;
	}

	public void setDatos(TextArea datos) {
		this.datos = datos;
	}


}
