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
public class pnl1 extends JPanel {

	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");

	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	
	public JRadioButton rdsi1;
	public JRadioButton rdno1;
	public JRadioButton rdsi2;
	public JRadioButton rdno2;
	public JRadioButton rdsi3;
	public JRadioButton rdno3;
	public JRadioButton rdsi4;
	public JRadioButton rdno4;
	public JRadioButton rdsi5;
	public JRadioButton rdno5;
	public JRadioButton rdsi6;
	public JRadioButton rdno6;
	public JRadioButton rdsi7;
	public JRadioButton rdno7;
	public JRadioButton rdsi8;
	public JRadioButton rdno8;
	public JRadioButton rdsi9;
	public JRadioButton rdno9;
	public JRadioButton rdsi10;
	public JRadioButton rdno10;
	
	public ButtonGroup grupo;

	public pnl1() {
		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("6 \u00BFCuando eras chico, te interesaba saber c\u00F3mo estaban construidos tus juguetes?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("7 \u00BFTe interesan m\u00E1s los misterios de la naturaleza que los secretos de la tecnolog\u00EDa?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("8 \u00BFEscuch\u00E1s atentamente los problemas que te plantean tus amigos?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("9 \u00BFTe ofrecer\u00EDas para explicar a tus compa\u00F1eros un determinado tema que ellos no entendieron?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("10 \u00BFSos exigente y cr\u00EDtico con tu equipo de trabajo?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi1 = new JRadioButton("Si");
		rdsi1.setBackground(null);
		rdsi1.setBounds(10, 30, 44, 23);
		add(rdsi1);
		
		rdno1 = new JRadioButton("No");
		rdno1.setBorder(null);
		rdno1.setBackground(Color.WHITE);
		rdno1.setBounds(56, 30, 44, 23);
		add(rdno1);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi1);
		grupo.add(rdno1);
		
		rdno2 = new JRadioButton("No");
		rdno2.setBackground(Color.WHITE);
		rdno2.setBounds(56, 81, 44, 23);
		add(rdno2);
		
		rdsi2 = new JRadioButton("Si");
		rdsi2.setBackground(Color.WHITE);
		rdsi2.setBounds(10, 81, 44, 23);
		add(rdsi2);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi2);
		grupo.add(rdno2);
		
		rdno3 = new JRadioButton("No");
		rdno3.setBackground(Color.WHITE);
		rdno3.setBounds(56, 130, 44, 23);
		add(rdno3);
		
		rdsi3 = new JRadioButton("Si");
		rdsi3.setBackground(Color.WHITE);
		rdsi3.setBounds(10, 130, 44, 23);
		add(rdsi3);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi3);
		grupo.add(rdno3);
		
		rdno4 = new JRadioButton("No");
		rdno4.setBackground(Color.WHITE);
		rdno4.setBounds(56, 180, 44, 23);
		add(rdno4);
		
		rdsi4 = new JRadioButton("Si");
		rdsi4.setBackground(Color.WHITE);
		rdsi4.setBounds(10, 180, 44, 23);
		add(rdsi4);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi4);
		grupo.add(rdno4);
		
		rdno5 = new JRadioButton("No");
		rdno5.setBackground(Color.WHITE);
		rdno5.setBounds(56, 230, 44, 23);
		add(rdno5);
		
		rdsi5 = new JRadioButton("Si");
		rdsi5.setBackground(Color.WHITE);
		rdsi5.setBounds(10, 230, 44, 23);
		add(rdsi5);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi5);
		grupo.add(rdno5);
		
		rdno6 = new JRadioButton("No");
		rdno6.setBackground(Color.WHITE);
		rdno6.setBounds(56, 280, 44, 23);
		add(rdno6);
		
		rdsi6 = new JRadioButton("Si");
		rdsi6.setBackground(Color.WHITE);
		rdsi6.setBounds(10, 280, 44, 23);
		add(rdsi6);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi6);
		grupo.add(rdno6);
		
		rdno7 = new JRadioButton("No");
		rdno7.setBackground(Color.WHITE);
		rdno7.setBounds(56, 331, 44, 23);
		add(rdno7);
		
		rdsi7 = new JRadioButton("Si");
		rdsi7.setBackground(Color.WHITE);
		rdsi7.setBounds(10, 331, 44, 23);
		add(rdsi7);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi7);
		grupo.add(rdno7);
		
		rdno8 = new JRadioButton("No");
		rdno8.setBackground(Color.WHITE);
		rdno8.setBounds(56, 380, 44, 23);
		add(rdno8);
		
		rdsi8 = new JRadioButton("Si");
		rdsi8.setBackground(Color.WHITE);
		rdsi8.setBounds(10, 380, 44, 23);
		add(rdsi8);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi8);
		grupo.add(rdno8);
		
		rdno9 = new JRadioButton("No");
		rdno9.setBackground(Color.WHITE);
		rdno9.setBounds(56, 431, 44, 23);
		add(rdno9);
		
		rdsi9 = new JRadioButton("Si");
		rdsi9.setBackground(Color.WHITE);
		rdsi9.setBounds(10, 431, 44, 23);
		add(rdsi9);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi9);
		grupo.add(rdno9);
		
		rdno10 = new JRadioButton("No");
		rdno10.setBackground(Color.WHITE);
		rdno10.setBounds(56, 481, 44, 23);
		add(rdno10);
		
		rdsi10 = new JRadioButton("Si");
		rdsi10.setBackground(Color.WHITE);
		rdsi10.setBounds(10, 481, 44, 23);
		add(rdsi10);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi10);
		grupo.add(rdno10);
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
