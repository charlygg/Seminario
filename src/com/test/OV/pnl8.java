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
public class pnl8 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");

	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi71;
	public JRadioButton rdno71;
	public JRadioButton rdno72;
	public JRadioButton rdsi72;
	public JRadioButton rdno73;
	public JRadioButton rdsi73;
	public JRadioButton rdno74;
	public JRadioButton rdsi74;
	public JRadioButton rdno75;
	public JRadioButton rdsi75;
	public JRadioButton rdno76;
	public JRadioButton rdsi76;
	public JRadioButton rdno77;
	public JRadioButton rdsi77;
	public JRadioButton rdno78;
	public JRadioButton rdsi78;
	public JRadioButton rdno79;
	public JRadioButton rdsi79;
	public JRadioButton rdno80;
	public JRadioButton rdsi80;

	public ButtonGroup grupo;
	
	
	public pnl8() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("71 ¿En un equipo de trabajo, preferís el rol de coordinador?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("72 ¿En una discusión entre amigos, te ofrecés como mediador?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("73 ¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("74 ¿Lucharías por una causa justa hasta las últimas consecuencias?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("75 ¿Te gustaría investigar científicamente sobre cultivos agrícolas?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("76 ¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión imprevista?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("77 ¿Visitarías un observatorio astronómico para conocer en acción el funcionamiento de los aparatos?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("78 ¿Dirigirías el área de importación y exportación de una empresa?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("79 ¿Te inhibís al entrar a un lugar nuevo con gente desconocida?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("80 ¿Te gratificaría el trabajar con niños?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi71 = new JRadioButton("Si");
		rdsi71.setBackground(Color.WHITE);
		rdsi71.setBounds(10, 30, 44, 23);
		add(rdsi71);
		
		rdno71 = new JRadioButton("No");
		rdno71.setBackground(Color.WHITE);
		rdno71.setBounds(56, 30, 44, 23);
		add(rdno71);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi71);
		grupo.add(rdno71);
		
		rdno72 = new JRadioButton("No");
		rdno72.setBackground(Color.WHITE);
		rdno72.setBounds(56, 81, 44, 23);
		add(rdno72);
		
		rdsi72 = new JRadioButton("Si");
		rdsi72.setBackground(Color.WHITE);
		rdsi72.setBounds(10, 81, 44, 23);
		add(rdsi72);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi72);
		grupo.add(rdno72);
		
		rdno73 = new JRadioButton("No");
		rdno73.setBackground(Color.WHITE);
		rdno73.setBounds(56, 130, 44, 23);
		add(rdno73);
		
		rdsi73 = new JRadioButton("Si");
		rdsi73.setBackground(Color.WHITE);
		rdsi73.setBounds(10, 130, 44, 23);
		add(rdsi73);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi73);
		grupo.add(rdno73);
		
		rdno74 = new JRadioButton("No");
		rdno74.setBackground(Color.WHITE);
		rdno74.setBounds(56, 180, 44, 23);
		add(rdno74);
		
		rdsi74 = new JRadioButton("Si");
		rdsi74.setBackground(Color.WHITE);
		rdsi74.setBounds(10, 180, 44, 23);
		add(rdsi74);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi74);
		grupo.add(rdno74);
		
		rdno75 = new JRadioButton("No");
		rdno75.setBackground(Color.WHITE);
		rdno75.setBounds(56, 230, 44, 23);
		add(rdno75);
		
		rdsi75 = new JRadioButton("Si");
		rdsi75.setBackground(Color.WHITE);
		rdsi75.setBounds(10, 230, 44, 23);
		add(rdsi75);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi75);
		grupo.add(rdno75);
		
		rdno76 = new JRadioButton("No");
		rdno76.setBackground(Color.WHITE);
		rdno76.setBounds(56, 280, 44, 23);
		add(rdno76);
		
		rdsi76 = new JRadioButton("Si");
		rdsi76.setBackground(Color.WHITE);
		rdsi76.setBounds(10, 280, 44, 23);
		add(rdsi76);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi76);
		grupo.add(rdno76);
		
		rdno77 = new JRadioButton("No");
		rdno77.setBackground(Color.WHITE);
		rdno77.setBounds(56, 331, 44, 23);
		add(rdno77);
		
		rdsi77 = new JRadioButton("Si");
		rdsi77.setBackground(Color.WHITE);
		rdsi77.setBounds(10, 331, 44, 23);
		add(rdsi77);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi77);
		grupo.add(rdno77);
		
		rdno78 = new JRadioButton("No");
		rdno78.setBackground(Color.WHITE);
		rdno78.setBounds(56, 380, 44, 23);
		add(rdno78);
		
		rdsi78 = new JRadioButton("Si");
		rdsi78.setBackground(Color.WHITE);
		rdsi78.setBounds(10, 380, 44, 23);
		add(rdsi78);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi78);
		grupo.add(rdno78);
		
		rdno79 = new JRadioButton("No");
		rdno79.setBackground(Color.WHITE);
		rdno79.setBounds(56, 431, 44, 23);
		add(rdno79);
		
		rdsi79 = new JRadioButton("Si");
		rdsi79.setBackground(Color.WHITE);
		rdsi79.setBounds(10, 431, 44, 23);
		add(rdsi79);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi79);
		grupo.add(rdno79);
		
		rdno80 = new JRadioButton("No");
		rdno80.setBackground(Color.WHITE);
		rdno80.setBounds(56, 481, 44, 23);
		add(rdno80);
		
		rdsi80 = new JRadioButton("Si");
		rdsi80.setBackground(Color.WHITE);
		rdsi80.setBounds(10, 481, 44, 23);
		add(rdsi80);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi80);
		grupo.add(rdno80);
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
