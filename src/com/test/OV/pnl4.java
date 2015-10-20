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
public class pnl4 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");
	
	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi31;
	public JRadioButton rdno31;
	public JRadioButton rdno32;
	public JRadioButton rdsi32;
	public JRadioButton rdno33;
	public JRadioButton rdsi33;
	public JRadioButton rdno34;
	public JRadioButton rdsi34;
	public JRadioButton rdno35;
	public JRadioButton rdsi35;
	public JRadioButton rdno36;
	public JRadioButton rdsi36;
	public JRadioButton rdno37;
	public JRadioButton rdsi37;
	public JRadioButton rdno38;
	public JRadioButton rdsi38;
	public JRadioButton rdno39;
	public JRadioButton rdsi39;
	public JRadioButton rdno40;
	public JRadioButton rdsi40;

	public ButtonGroup grupo;
	
	
	public pnl4() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("31 ¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("32 ¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas enfermedades a través del microscopio?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("33 ¿Participarías en una campaña de prevención contra la enfermedad de Chagas?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("34 ¿Te interesan los temas relacionados al pasado y a la evolución del hombre?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("35 ¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y sus consecuencias?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("36 ¿Fuera de los horarios escolares, dedicás algún día de la semana a la realización de actividades corporales?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("37 ¿Te interesan las actividades de mucha acción y de reacción rápida en situaciones imprevistas y de peligro?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("38 ¿Te ofrecerías para colaborar como voluntario en los gabinetes espaciales de la NASA?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("39 ¿Te gusta más el trabajo manual que el trabajo intelectual?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("40 ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi31 = new JRadioButton("Si");
		rdsi31.setBackground(Color.WHITE);
		rdsi31.setBounds(10, 30, 44, 23);
		add(rdsi31);
		
		rdno31 = new JRadioButton("No");
		rdno31.setBackground(Color.WHITE);
		rdno31.setBounds(56, 30, 44, 23);
		add(rdno31);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi31);
		grupo.add(rdno31);
		
		rdno32 = new JRadioButton("No");
		rdno32.setBackground(Color.WHITE);
		rdno32.setBounds(56, 81, 44, 23);
		add(rdno32);
		
		rdsi32 = new JRadioButton("Si");
		rdsi32.setBackground(Color.WHITE);
		rdsi32.setBounds(10, 81, 44, 23);
		add(rdsi32);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi32);
		grupo.add(rdno32);
		
		rdno33 = new JRadioButton("No");
		rdno33.setBackground(Color.WHITE);
		rdno33.setBounds(56, 130, 44, 23);
		add(rdno33);
		
		rdsi33 = new JRadioButton("Si");
		rdsi33.setBackground(Color.WHITE);
		rdsi33.setBounds(10, 130, 44, 23);
		add(rdsi33);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi33);
		grupo.add(rdno33);
		
		rdno34 = new JRadioButton("No");
		rdno34.setBackground(Color.WHITE);
		rdno34.setBounds(56, 180, 44, 23);
		add(rdno34);
		
		rdsi34 = new JRadioButton("Si");
		rdsi34.setBackground(Color.WHITE);
		rdsi34.setBounds(10, 180, 44, 23);
		add(rdsi34);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi34);
		grupo.add(rdno34);
		
		rdno35 = new JRadioButton("No");
		rdno35.setBackground(Color.WHITE);
		rdno35.setBounds(56, 230, 44, 23);
		add(rdno35);
		
		rdsi35 = new JRadioButton("Si");
		rdsi35.setBackground(Color.WHITE);
		rdsi35.setBounds(10, 230, 44, 23);
		add(rdsi35);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi35);
		grupo.add(rdno35);
		
		rdno36 = new JRadioButton("No");
		rdno36.setBackground(Color.WHITE);
		rdno36.setBounds(56, 280, 44, 23);
		add(rdno36);
		
		rdsi36 = new JRadioButton("Si");
		rdsi36.setBackground(Color.WHITE);
		rdsi36.setBounds(10, 280, 44, 23);
		add(rdsi36);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi36);
		grupo.add(rdno36);
		
		rdno37 = new JRadioButton("No");
		rdno37.setBackground(Color.WHITE);
		rdno37.setBounds(56, 331, 44, 23);
		add(rdno37);
		
		rdsi37 = new JRadioButton("Si");
		rdsi37.setBackground(Color.WHITE);
		rdsi37.setBounds(10, 331, 44, 23);
		add(rdsi37);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi37);
		grupo.add(rdno37);
		
		rdno38 = new JRadioButton("No");
		rdno38.setBackground(Color.WHITE);
		rdno38.setBounds(56, 380, 44, 23);
		add(rdno38);
		
		rdsi38 = new JRadioButton("Si");
		rdsi38.setBackground(Color.WHITE);
		rdsi38.setBounds(10, 380, 44, 23);
		add(rdsi38);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi38);
		grupo.add(rdno38);
		
		rdno39 = new JRadioButton("No");
		rdno39.setBackground(Color.WHITE);
		rdno39.setBounds(56, 431, 44, 23);
		add(rdno39);
		
		rdsi39 = new JRadioButton("Si");
		rdsi39.setBackground(Color.WHITE);
		rdsi39.setBounds(10, 431, 44, 23);
		add(rdsi39);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi39);
		grupo.add(rdno39);
		
		rdno40 = new JRadioButton("No");
		rdno40.setBackground(Color.WHITE);
		rdno40.setBounds(56, 481, 44, 23);
		add(rdno40);
		
		rdsi40 = new JRadioButton("Si");
		rdsi40.setBackground(Color.WHITE);
		rdsi40.setBounds(10, 481, 44, 23);
		add(rdsi40);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi40);
		grupo.add(rdno40);
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
