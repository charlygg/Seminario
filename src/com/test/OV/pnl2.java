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
public class pnl2 extends JPanel {

	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");
	
	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi11;
	public JRadioButton rdno11;
	public JRadioButton rdno12;
	public JRadioButton rdsi12;
	public JRadioButton rdno13;
	public JRadioButton rdsi13;
	public JRadioButton rdno14;
	public JRadioButton rdsi14;
	public JRadioButton rdno15;
	public JRadioButton rdsi15;
	public JRadioButton rdno16;
	public JRadioButton rdsi16;
	public JRadioButton rdno17;
	public JRadioButton rdsi17;
	public JRadioButton rdno18;
	public JRadioButton rdsi18;
	public JRadioButton rdno19;
	public JRadioButton rdsi19;
	public JRadioButton rdno20;
	public JRadioButton rdsi20;

	public ButtonGroup grupo;
	public pnl2() {
		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("12 ¿Podés establecer la diferencia conceptual entre macroeconomía y microeconomía?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("13 ¿Usar uniforme te hace sentir distinto, importante?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("14 ¿Participarías como profesional en un espectáculo de acrobacia aérea?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("15 ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("16 ¿Convencés fácilmente a otras personas sobre la validez de tus argumentos?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("17 ¿Estás informado sobre los nuevos descubrimientos que se están realizando sobre la Teoría del Big-Bang?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("18 ¿Ante una situación de emergencia actuás rápidamente?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("19 ¿Cuando tenés que resolver un problema matemático, perseverás hasta encontrar la solución?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("20 ¿Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptarías?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi11 = new JRadioButton("Si");
		rdsi11.setBackground(Color.WHITE);
		rdsi11.setBounds(10, 30, 44, 23);
		add(rdsi11);
		
		rdno11 = new JRadioButton("No");
		rdno11.setBackground(Color.WHITE);
		rdno11.setBounds(56, 30, 44, 23);
		add(rdno11);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi11);
		grupo.add(rdno11);
		
		rdno12 = new JRadioButton("No");
		rdno12.setBackground(Color.WHITE);
		rdno12.setBounds(56, 81, 44, 23);
		add(rdno12);
		
		rdsi12 = new JRadioButton("Si");
		rdsi12.setBackground(Color.WHITE);
		rdsi12.setBounds(10, 81, 44, 23);
		add(rdsi12);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi12);
		grupo.add(rdno12);
		
		rdno13 = new JRadioButton("No");
		rdno13.setBackground(Color.WHITE);
		rdno13.setBounds(56, 130, 44, 23);
		add(rdno13);
		
		rdsi13 = new JRadioButton("Si");
		rdsi13.setBackground(Color.WHITE);
		rdsi13.setBounds(10, 130, 44, 23);
		add(rdsi13);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi13);
		grupo.add(rdno13);
		
		rdno14 = new JRadioButton("No");
		rdno14.setBackground(Color.WHITE);
		rdno14.setBounds(56, 180, 44, 23);
		add(rdno14);
		
		rdsi14 = new JRadioButton("Si");
		rdsi14.setBackground(Color.WHITE);
		rdsi14.setBounds(10, 180, 44, 23);
		add(rdsi14);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi14);
		grupo.add(rdno14);
		
		rdno15 = new JRadioButton("No");
		rdno15.setBackground(Color.WHITE);
		rdno15.setBounds(56, 230, 44, 23);
		add(rdno15);
		
		rdsi15 = new JRadioButton("Si");
		rdsi15.setBackground(Color.WHITE);
		rdsi15.setBounds(10, 230, 44, 23);
		add(rdsi15);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi15);
		grupo.add(rdno15);
		
		rdno16 = new JRadioButton("No");
		rdno16.setBackground(Color.WHITE);
		rdno16.setBounds(56, 280, 44, 23);
		add(rdno16);
		
		rdsi16 = new JRadioButton("Si");
		rdsi16.setBackground(Color.WHITE);
		rdsi16.setBounds(10, 280, 44, 23);
		add(rdsi16);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi16);
		grupo.add(rdno16);
		
		rdno17 = new JRadioButton("No");
		rdno17.setBackground(Color.WHITE);
		rdno17.setBounds(56, 331, 44, 23);
		add(rdno17);
		
		rdsi17 = new JRadioButton("Si");
		rdsi17.setBackground(Color.WHITE);
		rdsi17.setBounds(10, 331, 44, 23);
		add(rdsi17);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi17);
		grupo.add(rdno17);
		
		rdno18 = new JRadioButton("No");
		rdno18.setBackground(Color.WHITE);
		rdno18.setBounds(56, 380, 44, 23);
		add(rdno18);
		
		rdsi18 = new JRadioButton("Si");
		rdsi18.setBackground(Color.WHITE);
		rdsi18.setBounds(10, 380, 44, 23);
		add(rdsi18);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi18);
		grupo.add(rdno18);
		
		rdno19 = new JRadioButton("No");
		rdno19.setBackground(Color.WHITE);
		rdno19.setBounds(56, 431, 44, 23);
		add(rdno19);
		
		rdsi19 = new JRadioButton("Si");
		rdsi19.setBackground(Color.WHITE);
		rdsi19.setBounds(10, 431, 44, 23);
		add(rdsi19);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi19);
		grupo.add(rdno19);
		
		rdno20 = new JRadioButton("No");
		rdno20.setBackground(Color.WHITE);
		rdno20.setBounds(56, 481, 44, 23);
		add(rdno20);
		
		rdsi20 = new JRadioButton("Si");
		rdsi20.setBackground(Color.WHITE);
		rdsi20.setBounds(10, 481, 44, 23);
		add(rdsi20);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi20);
		grupo.add(rdno20);
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
