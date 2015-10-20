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
public class pnl5 extends JPanel {

	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");
	
	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi41;
	public JRadioButton rdno41;
	public JRadioButton rdno42;
	public JRadioButton rdsi42;
	public JRadioButton rdno43;
	public JRadioButton rdsi43;
	public JRadioButton rdno44;
	public JRadioButton rdsi44;
	public JRadioButton rdno45;
	public JRadioButton rdsi45;
	public JRadioButton rdno46;
	public JRadioButton rdsi46;
	public JRadioButton rdno47;
	public JRadioButton rdsi47;
	public JRadioButton rdno48;
	public JRadioButton rdsi48;
	public JRadioButton rdno49;
	public JRadioButton rdsi49;
	public JRadioButton rdno50;
	public JRadioButton rdsi50;

	public ButtonGroup grupo;
	
	
	public pnl5() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("41 ¿Participarías de una investigación sobre la violencia en el fútbol?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("42 ¿Te gustaría trabajar en un laboratorio mientras estudiás?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("43 ¿Arriesgarías tu vida para salvar la vida de otro que no conoces?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("44 ¿Te agradaría hacer un curso de primeros auxilios?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("45 ¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro deseado?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("46 ¿Distribuís tu horarios del día adecuadamente para poder hacer todo lo planeado?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("47 ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las máquinas o aparatos con que trabajas?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("48 ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("49 ¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades como profesional?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("50 ¿Cuando estás en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi41 = new JRadioButton("Si");
		rdsi41.setBackground(Color.WHITE);
		rdsi41.setBounds(10, 30, 44, 23);
		add(rdsi41);
		
		rdno41 = new JRadioButton("No");
		rdno41.setBackground(Color.WHITE);
		rdno41.setBounds(56, 30, 44, 23);
		add(rdno41);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi41);
		grupo.add(rdno41);
		
		rdno42 = new JRadioButton("No");
		rdno42.setBackground(Color.WHITE);
		rdno42.setBounds(56, 81, 44, 23);
		add(rdno42);
		
		rdsi42 = new JRadioButton("Si");
		rdsi42.setBackground(Color.WHITE);
		rdsi42.setBounds(10, 81, 44, 23);
		add(rdsi42);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi42);
		grupo.add(rdno42);
		
		rdno43 = new JRadioButton("No");
		rdno43.setBackground(Color.WHITE);
		rdno43.setBounds(56, 130, 44, 23);
		add(rdno43);
		
		rdsi43 = new JRadioButton("Si");
		rdsi43.setBackground(Color.WHITE);
		rdsi43.setBounds(10, 130, 44, 23);
		add(rdsi43);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi43);
		grupo.add(rdno43);
		
		rdno44 = new JRadioButton("No");
		rdno44.setBackground(Color.WHITE);
		rdno44.setBounds(56, 180, 44, 23);
		add(rdno44);
		
		rdsi44 = new JRadioButton("Si");
		rdsi44.setBackground(Color.WHITE);
		rdsi44.setBounds(10, 180, 44, 23);
		add(rdsi44);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi44);
		grupo.add(rdno44);
		
		rdno45 = new JRadioButton("No");
		rdno45.setBackground(Color.WHITE);
		rdno45.setBounds(56, 230, 44, 23);
		add(rdno45);
		
		rdsi45 = new JRadioButton("Si");
		rdsi45.setBackground(Color.WHITE);
		rdsi45.setBounds(10, 230, 44, 23);
		add(rdsi45);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi45);
		grupo.add(rdno45);
		
		rdno46 = new JRadioButton("No");
		rdno46.setBackground(Color.WHITE);
		rdno46.setBounds(56, 280, 44, 23);
		add(rdno46);
		
		rdsi46 = new JRadioButton("Si");
		rdsi46.setBackground(Color.WHITE);
		rdsi46.setBounds(10, 280, 44, 23);
		add(rdsi46);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi46);
		grupo.add(rdno46);
		
		rdno47 = new JRadioButton("No");
		rdno47.setBackground(Color.WHITE);
		rdno47.setBounds(56, 331, 44, 23);
		add(rdno47);
		
		rdsi47 = new JRadioButton("Si");
		rdsi47.setBackground(Color.WHITE);
		rdsi47.setBounds(10, 331, 44, 23);
		add(rdsi47);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi47);
		grupo.add(rdno47);
		
		rdno48 = new JRadioButton("No");
		rdno48.setBackground(Color.WHITE);
		rdno48.setBounds(56, 380, 44, 23);
		add(rdno48);
		
		rdsi48 = new JRadioButton("Si");
		rdsi48.setBackground(Color.WHITE);
		rdsi48.setBounds(10, 380, 44, 23);
		add(rdsi48);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi48);
		grupo.add(rdno48);
		
		rdno49 = new JRadioButton("No");
		rdno49.setBackground(Color.WHITE);
		rdno49.setBounds(56, 431, 44, 23);
		add(rdno49);
		
		rdsi49 = new JRadioButton("Si");
		rdsi49.setBackground(Color.WHITE);
		rdsi49.setBounds(10, 431, 44, 23);
		add(rdsi49);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi49);
		grupo.add(rdno49);
		
		rdno50 = new JRadioButton("No");
		rdno50.setBackground(Color.WHITE);
		rdno50.setBounds(56, 481, 44, 23);
		add(rdno50);
		
		rdsi50 = new JRadioButton("Si");
		rdsi50.setBackground(Color.WHITE);
		rdsi50.setBounds(10, 481, 44, 23);
		add(rdsi50);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi50);
		grupo.add(rdno50);
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
