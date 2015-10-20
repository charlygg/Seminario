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
public class pnl9 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");

	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi81;
	public JRadioButton rdno81;
	public JRadioButton rdno82;
	public JRadioButton rdsi82;
	public JRadioButton rdno83;
	public JRadioButton rdsi83;
	public JRadioButton rdno84;
	public JRadioButton rdsi84;
	public JRadioButton rdno85;
	public JRadioButton rdsi85;
	public JRadioButton rdno86;
	public JRadioButton rdsi86;
	public JRadioButton rdno87;
	public JRadioButton rdsi87;
	public JRadioButton rdno88;
	public JRadioButton rdsi88;
	public JRadioButton rdno89;
	public JRadioButton rdsi89;
	public JRadioButton rdno90;
	public JRadioButton rdsi90;

	public ButtonGroup grupo;
	
	
	public pnl9() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("81 ¿Harías el diseño de un afiche para una campaña contra el sida?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("82 ¿Dirigirías un grupo de teatro independiente?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("83 ¿Enviarías tu curriculum a una empresa automotriz que solicita gerente para su área de producción?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("84 ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza armada?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("85 ¿Te costearías tus estudios trabajando en una auditoría?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("86 ¿Sos de los que defendés causas perdidas?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("87 ¿Ante una emergencia epidémica participarías en una campaña brindando tu ayuda?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("88 ¿Sabrías responder que significa ADN y ARN?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("89 ¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un idioma extranjero?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("90 ¿Trabajar con objetos te resulta más gratificante que trabajar con personas?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi81 = new JRadioButton("Si");
		rdsi81.setBackground(Color.WHITE);
		rdsi81.setBounds(10, 30, 44, 23);
		add(rdsi81);
		
		rdno81 = new JRadioButton("No");
		rdno81.setBackground(Color.WHITE);
		rdno81.setBounds(56, 30, 44, 23);
		add(rdno81);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi81);
		grupo.add(rdno81);
		
		rdno82 = new JRadioButton("No");
		rdno82.setBackground(Color.WHITE);
		rdno82.setBounds(56, 81, 44, 23);
		add(rdno82);
		
		rdsi82 = new JRadioButton("Si");
		rdsi82.setBackground(Color.WHITE);
		rdsi82.setBounds(10, 81, 44, 23);
		add(rdsi82);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi82);
		grupo.add(rdno82);
		
		rdno83 = new JRadioButton("No");
		rdno83.setBackground(Color.WHITE);
		rdno83.setBounds(56, 130, 44, 23);
		add(rdno83);
		
		rdsi83 = new JRadioButton("Si");
		rdsi83.setBackground(Color.WHITE);
		rdsi83.setBounds(10, 130, 44, 23);
		add(rdsi83);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi83);
		grupo.add(rdno83);
		
		rdno84 = new JRadioButton("No");
		rdno84.setBackground(Color.WHITE);
		rdno84.setBounds(56, 180, 44, 23);
		add(rdno84);
		
		rdsi84 = new JRadioButton("Si");
		rdsi84.setBackground(Color.WHITE);
		rdsi84.setBounds(10, 180, 44, 23);
		add(rdsi84);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi84);
		grupo.add(rdno84);
		
		rdno85 = new JRadioButton("No");
		rdno85.setBackground(Color.WHITE);
		rdno85.setBounds(56, 230, 44, 23);
		add(rdno85);
		
		rdsi85 = new JRadioButton("Si");
		rdsi85.setBackground(Color.WHITE);
		rdsi85.setBounds(10, 230, 44, 23);
		add(rdsi85);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi85);
		grupo.add(rdno85);
		
		rdno86 = new JRadioButton("No");
		rdno86.setBackground(Color.WHITE);
		rdno86.setBounds(56, 280, 44, 23);
		add(rdno86);
		
		rdsi86 = new JRadioButton("Si");
		rdsi86.setBackground(Color.WHITE);
		rdsi86.setBounds(10, 280, 44, 23);
		add(rdsi86);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi86);
		grupo.add(rdno86);
		
		rdno87 = new JRadioButton("No");
		rdno87.setBackground(Color.WHITE);
		rdno87.setBounds(56, 331, 44, 23);
		add(rdno87);
		
		rdsi87 = new JRadioButton("Si");
		rdsi87.setBackground(Color.WHITE);
		rdsi87.setBounds(10, 331, 44, 23);
		add(rdsi87);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi87);
		grupo.add(rdno87);
		
		rdno88 = new JRadioButton("No");
		rdno88.setBackground(Color.WHITE);
		rdno88.setBounds(56, 380, 44, 23);
		add(rdno88);
		
		rdsi88 = new JRadioButton("Si");
		rdsi88.setBackground(Color.WHITE);
		rdsi88.setBounds(10, 380, 44, 23);
		add(rdsi88);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi88);
		grupo.add(rdno88);
		
		rdno89 = new JRadioButton("No");
		rdno89.setBackground(Color.WHITE);
		rdno89.setBounds(56, 431, 44, 23);
		add(rdno89);
		
		rdsi89 = new JRadioButton("Si");
		rdsi89.setBackground(Color.WHITE);
		rdsi89.setBounds(10, 431, 44, 23);
		add(rdsi89);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi89);
		grupo.add(rdno89);
		
		rdno90 = new JRadioButton("No");
		rdno90.setBackground(Color.WHITE);
		rdno90.setBounds(56, 481, 44, 23);
		add(rdno90);
		
		rdsi90 = new JRadioButton("Si");
		rdsi90.setBackground(Color.WHITE);
		rdsi90.setBounds(10, 481, 44, 23);
		add(rdsi90);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi90);
		grupo.add(rdno90);
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
