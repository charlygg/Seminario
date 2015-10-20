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
public class pnl3 extends JPanel {

	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");
	
	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi21;
	public JRadioButton rdno21;
	public JRadioButton rdno22;
	public JRadioButton rdsi22;
	public JRadioButton rdno23;
	public JRadioButton rdsi23;
	public JRadioButton rdno24;
	public JRadioButton rdsi24;
	public JRadioButton rdno25;
	public JRadioButton rdsi25;
	public JRadioButton rdno26;
	public JRadioButton rdsi26;
	public JRadioButton rdno27;
	public JRadioButton rdsi27;
	public JRadioButton rdno28;
	public JRadioButton rdsi28;
	public JRadioButton rdno29;
	public JRadioButton rdsi29;
	public JRadioButton rdno30;
	public JRadioButton rdsi30;

	public ButtonGroup grupo;
	
	
	public pnl3() {
		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("21 ¿Sos el que pone un toque de alegría en las fiestas?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("22 ¿Crees que los detalles son tan importantes como el todo?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("23 ¿Te sentirías a gusto trabajando en un ámbito hospitalario?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("24 ¿Te gustaría participar para mantener el orden ante grandes desórdenes y cataclismos?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("25 ¿Pasarías varias horas leyendo algún libro de tu interés?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("26 ¿Planificás detalladamente tus trabajos antes de empezar?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("27 ¿Entablás una relación casi personal con tu computadora?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("28 ¿Disfrutás modelando con arcilla?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("29 ¿Ayudás habitualmente a los no videntes a cruzar la calle?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("30 ¿Considerás importante que desde la escuela primaria se fomente la actitud crítica y la participación activa?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi21 = new JRadioButton("Si");
		rdsi21.setBackground(Color.WHITE);
		rdsi21.setBounds(10, 30, 44, 23);
		add(rdsi21);
		
		rdno21 = new JRadioButton("No");
		rdno21.setBackground(Color.WHITE);
		rdno21.setBounds(56, 30, 44, 23);
		add(rdno21);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi21);
		grupo.add(rdno21);
		
		rdno22 = new JRadioButton("No");
		rdno22.setBackground(Color.WHITE);
		rdno22.setBounds(56, 81, 44, 23);
		add(rdno22);
		
		rdsi22 = new JRadioButton("Si");
		rdsi22.setBackground(Color.WHITE);
		rdsi22.setBounds(10, 81, 44, 23);
		add(rdsi22);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi22);
		grupo.add(rdno22);
		
		rdno23 = new JRadioButton("No");
		rdno23.setBackground(Color.WHITE);
		rdno23.setBounds(56, 130, 44, 23);
		add(rdno23);
		
		rdsi23 = new JRadioButton("Si");
		rdsi23.setBackground(Color.WHITE);
		rdsi23.setBounds(10, 130, 44, 23);
		add(rdsi23);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi23);
		grupo.add(rdno23);
		
		rdno24 = new JRadioButton("No");
		rdno24.setBackground(Color.WHITE);
		rdno24.setBounds(56, 180, 44, 23);
		add(rdno24);
		
		rdsi24 = new JRadioButton("Si");
		rdsi24.setBackground(Color.WHITE);
		rdsi24.setBounds(10, 180, 44, 23);
		add(rdsi24);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi24);
		grupo.add(rdno24);
		
		rdno25 = new JRadioButton("No");
		rdno25.setBackground(Color.WHITE);
		rdno25.setBounds(56, 230, 44, 23);
		add(rdno25);
		
		rdsi25 = new JRadioButton("Si");
		rdsi25.setBackground(Color.WHITE);
		rdsi25.setBounds(10, 230, 44, 23);
		add(rdsi25);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi25);
		grupo.add(rdno25);
		
		rdno26 = new JRadioButton("No");
		rdno26.setBackground(Color.WHITE);
		rdno26.setBounds(56, 280, 44, 23);
		add(rdno26);
		
		rdsi26 = new JRadioButton("Si");
		rdsi26.setBackground(Color.WHITE);
		rdsi26.setBounds(10, 280, 44, 23);
		add(rdsi26);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi26);
		grupo.add(rdno26);
		
		rdno27 = new JRadioButton("No");
		rdno27.setBackground(Color.WHITE);
		rdno27.setBounds(56, 331, 44, 23);
		add(rdno27);
		
		rdsi27 = new JRadioButton("Si");
		rdsi27.setBackground(Color.WHITE);
		rdsi27.setBounds(10, 331, 44, 23);
		add(rdsi27);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi27);
		grupo.add(rdno27);
		
		rdno28 = new JRadioButton("No");
		rdno28.setBackground(Color.WHITE);
		rdno28.setBounds(56, 380, 44, 23);
		add(rdno28);
		
		rdsi28 = new JRadioButton("Si");
		rdsi28.setBackground(Color.WHITE);
		rdsi28.setBounds(10, 380, 44, 23);
		add(rdsi28);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi28);
		grupo.add(rdno28);
		
		rdno29 = new JRadioButton("No");
		rdno29.setBackground(Color.WHITE);
		rdno29.setBounds(56, 431, 44, 23);
		add(rdno29);
		
		rdsi29 = new JRadioButton("Si");
		rdsi29.setBackground(Color.WHITE);
		rdsi29.setBounds(10, 431, 44, 23);
		add(rdsi29);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi29);
		grupo.add(rdno29);
		
		rdno30 = new JRadioButton("No");
		rdno30.setBackground(Color.WHITE);
		rdno30.setBounds(56, 481, 44, 23);
		add(rdno30);
		
		rdsi30 = new JRadioButton("Si");
		rdsi30.setBackground(Color.WHITE);
		rdsi30.setBounds(10, 481, 44, 23);
		add(rdsi30);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi30);
		grupo.add(rdno30);
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
