package com.test.OV;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.test.Image.ImagenBorder;
import com.test.Image.Resizable;

@SuppressWarnings("serial")
public class pnl7 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");

	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi61;
	public JRadioButton rdno61;
	public JRadioButton rdno62;
	public JRadioButton rdsi62;
	public JRadioButton rdno63;
	public JRadioButton rdsi63;
	public JRadioButton rdno64;
	public JRadioButton rdsi64;
	public JRadioButton rdno65;
	public JRadioButton rdsi65;
	public JRadioButton rdno66;
	public JRadioButton rdsi66;
	public JRadioButton rdno67;
	public JRadioButton rdsi67;
	public JRadioButton rdno68;
	public JRadioButton rdsi68;
	public JRadioButton rdno69;
	public JRadioButton rdsi69;
	public JRadioButton rdno70;
	public JRadioButton rdsi70;

	public ButtonGroup grupo;
	
	
	public pnl7() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("61 ¿Formarías parte de un equipo de trabajo orientado a la preservación de la flora y la fauna en extinción?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("62 ¿Acostumbrás a leer revistas relacionadas con los últimos avances científicos y tecnológicos en el área de la salud?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("63 ¿Preservar las raíces culturales de nuestro país, te parece importante y necesario?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("64 ¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("65 ¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y arriado de velas, pintura y conservación del casco, etc?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("66 ¿Crees que un país debe poseer la más alta tecnología armamentista, a cualquier precio?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("67 ¿La libertad y la justicia son valores fundamentales en tu vida?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("68 ¿Aceptarías hacer una práctica rentada en una industria de productos alimenticios en el sector de control de calidad?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("69 ¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para todos?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("70 ¿Te interesaría investigar sobre alguna nueva vacuna?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi61 = new JRadioButton("Si");
		rdsi61.setBackground(Color.WHITE);
		rdsi61.setBounds(10, 30, 44, 23);
		add(rdsi61);
		
		rdno61 = new JRadioButton("No");
		rdno61.setBackground(Color.WHITE);
		rdno61.setBounds(56, 30, 44, 23);
		add(rdno61);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi61);
		grupo.add(rdno61);
		
		rdno62 = new JRadioButton("No");
		rdno62.setBackground(Color.WHITE);
		rdno62.setBounds(56, 81, 44, 23);
		add(rdno62);
		
		rdsi62 = new JRadioButton("Si");
		rdsi62.setBackground(Color.WHITE);
		rdsi62.setBounds(10, 81, 44, 23);
		add(rdsi62);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi62);
		grupo.add(rdno62);
		
		rdno63 = new JRadioButton("No");
		rdno63.setBackground(Color.WHITE);
		rdno63.setBounds(56, 130, 44, 23);
		add(rdno63);
		
		rdsi63 = new JRadioButton("Si");
		rdsi63.setBackground(Color.WHITE);
		rdsi63.setBounds(10, 130, 44, 23);
		add(rdsi63);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi63);
		grupo.add(rdno63);
		
		rdno64 = new JRadioButton("No");
		rdno64.setBackground(Color.WHITE);
		rdno64.setBounds(56, 180, 44, 23);
		add(rdno64);
		
		rdsi64 = new JRadioButton("Si");
		rdsi64.setBackground(Color.WHITE);
		rdsi64.setBounds(10, 180, 44, 23);
		add(rdsi64);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi64);
		grupo.add(rdno64);
		
		rdno65 = new JRadioButton("No");
		rdno65.setBackground(Color.WHITE);
		rdno65.setBounds(56, 230, 44, 23);
		add(rdno65);
		
		rdsi65 = new JRadioButton("Si");
		rdsi65.setBackground(Color.WHITE);
		rdsi65.setBounds(10, 230, 44, 23);
		add(rdsi65);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi65);
		grupo.add(rdno65);
		
		rdno66 = new JRadioButton("No");
		rdno66.setBackground(Color.WHITE);
		rdno66.setBounds(56, 280, 44, 23);
		add(rdno66);
		
		rdsi66 = new JRadioButton("Si");
		rdsi66.setBackground(Color.WHITE);
		rdsi66.setBounds(10, 280, 44, 23);
		add(rdsi66);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi66);
		grupo.add(rdno66);
		
		rdno67 = new JRadioButton("No");
		rdno67.setBackground(Color.WHITE);
		rdno67.setBounds(56, 331, 44, 23);
		add(rdno67);
		
		rdsi67 = new JRadioButton("Si");
		rdsi67.setBackground(Color.WHITE);
		rdsi67.setBounds(10, 331, 44, 23);
		add(rdsi67);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi67);
		grupo.add(rdno67);
		
		rdno68 = new JRadioButton("No");
		rdno68.setBackground(Color.WHITE);
		rdno68.setBounds(56, 380, 44, 23);
		add(rdno68);
		
		rdsi68 = new JRadioButton("Si");
		rdsi68.setBackground(Color.WHITE);
		rdsi68.setBounds(10, 380, 44, 23);
		add(rdsi68);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi68);
		grupo.add(rdno68);
		
		rdno69 = new JRadioButton("No");
		rdno69.setBackground(Color.WHITE);
		rdno69.setBounds(56, 431, 44, 23);
		add(rdno69);
		
		rdsi69 = new JRadioButton("Si");
		rdsi69.setBackground(Color.WHITE);
		rdsi69.setBounds(10, 431, 44, 23);
		add(rdsi69);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi69);
		grupo.add(rdno69);
		
		rdno70 = new JRadioButton("No");
		rdno70.setBackground(Color.WHITE);
		rdno70.setBounds(56, 481, 44, 23);
		add(rdno70);
		
		rdsi70 = new JRadioButton("Si");
		rdsi70.setBackground(Color.WHITE);
		rdsi70.setBounds(10, 481, 44, 23);
		add(rdsi70);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi70);
		grupo.add(rdno70);
		ponerImagen();
	}
	
	private void ponerImagen() {
		try {
			imagen = ImageIO.read(file);	
			BufferedImage imagenredimensionada = resizable.resize(imagen, getWidth(), getHeight());
			this.setBorder(new ImagenBorder(imagenredimensionada));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
