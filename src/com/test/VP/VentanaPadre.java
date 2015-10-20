package com.test.VP;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.test.Help.Ayuda;
import com.test.Image.ImagenBorder;
import com.test.Image.Resizable;

@SuppressWarnings("serial")
public class VentanaPadre extends JFrame implements ActionListener {

	private JPanel Contenedor;
	private JMenuBar barramenu;
	private JMenu test, Ayuda;
	private JMenuItem comenzar, ayuda, acerca;
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/PRINCIPAL.png");

	public static void main(String[] args) {
		new VentanaPadre().setVisible(true);
	}

	public VentanaPadre() {
		setTitle("Proyecto de Seminario de Sistemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 750, 500);
		
		Contenedor = new JPanel();
		Contenedor.setBackground(Color.WHITE);
		Contenedor.setBounds(0, 0, 750, 470);
		setContentPane(Contenedor);
		Contenedor.setLayout(null);
		
		barramenu = new JMenuBar();
		setJMenuBar(barramenu);
		
		test = new JMenu("Test");
		Ayuda = new JMenu("Ayuda");
		barramenu.add(test);
		barramenu.add(Ayuda);
		
		comenzar = new JMenuItem("Comenzar el test");
		comenzar.addActionListener(this);
		ayuda = new JMenuItem("Ayuda");
		ayuda.addActionListener(this);
		acerca = new JMenuItem("Acerca de ");
		acerca.addActionListener(this);
		test.add(comenzar);
		Ayuda.add(ayuda);
		Ayuda.add(acerca);
		
		pintarImagen();
	}

	private void pintarImagen() {
		try {
			imagen = ImageIO.read(file);
			BufferedImage redimensionado = resizable.resize(imagen, Contenedor.getWidth(), Contenedor.getHeight());
			Contenedor.setBorder(new ImagenBorder(redimensionado));
		} catch (IOException e) {
			System.err.println("Error al cargar se puede leer la imagen");
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==comenzar){
			new RegistroPersona(this).setVisible(true);
		}
		
		if(evt.getSource()==ayuda){
			new Ayuda().setVisible(true);
		}
	}
	 
}
