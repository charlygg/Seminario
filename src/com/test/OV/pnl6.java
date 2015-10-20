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
public class pnl6 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");
	
	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi51;
	public JRadioButton rdno51;
	public JRadioButton rdno52;
	public JRadioButton rdsi52;
	public JRadioButton rdno53;
	public JRadioButton rdsi53;
	public JRadioButton rdno54;
	public JRadioButton rdsi54;
	public JRadioButton rdno55;
	public JRadioButton rdsi55;
	public JRadioButton rdno56;
	public JRadioButton rdsi56;
	public JRadioButton rdno57;
	public JRadioButton rdsi57;
	public JRadioButton rdno58;
	public JRadioButton rdsi58;
	public JRadioButton rdno59;
	public JRadioButton rdsi59;
	public JRadioButton rdno60;
	public JRadioButton rdsi60;

	public ButtonGroup grupo;
	
	
	public pnl6() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("51 ¿Te resulta fácil coordinar un grupo de trabajo?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("52 ¿Te resultó interesante el estudio de las ciencias biológicas?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("53 ¿Si una gran empresa solicita un profesional como gerente de comercialización, te sentirías a gusto desempeñando ese rol?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("54 ¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("55 ¿Tenés interés por saber cuales son las causas que determinan ciertos fenómenos, aunque saberlo no altere tu vida?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("56 ¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas con antelación?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("57 ¿Desearías que te regalen algún instrumento musical para tu cumpleaños?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("58 ¿Aceptarías colaborar con el cumplimiento de las normas en lugares públicos?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		lb9 = new JLabel("59 ¿Crees que tus ideas son importantes,y haces todo lo posible para ponerlas en práctica?");
		lb9.setBounds(10, 410, 700, 14);
		add(lb9);
		
		lb10 = new JLabel("60 ¿Cuando se descompone un artefacto en tu casa, te disponés prontamente a repararlo?");
		lb10.setBounds(10, 460, 700, 14);
		add(lb10);
		
		rdsi51 = new JRadioButton("Si");
		rdsi51.setBackground(Color.WHITE);
		rdsi51.setBounds(10, 30, 44, 23);
		add(rdsi51);
		
		rdno51 = new JRadioButton("No");
		rdno51.setBackground(Color.WHITE);
		rdno51.setBounds(56, 30, 44, 23);
		add(rdno51);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi51);
		grupo.add(rdno51);
		
		rdno52 = new JRadioButton("No");
		rdno52.setBackground(Color.WHITE);
		rdno52.setBounds(56, 81, 44, 23);
		add(rdno52);
		
		rdsi52 = new JRadioButton("Si");
		rdsi52.setBackground(Color.WHITE);
		rdsi52.setBounds(10, 81, 44, 23);
		add(rdsi52);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi52);
		grupo.add(rdno52);
		
		rdno53 = new JRadioButton("No");
		rdno53.setBackground(Color.WHITE);
		rdno53.setBounds(56, 130, 44, 23);
		add(rdno53);
		
		rdsi53 = new JRadioButton("Si");
		rdsi53.setBackground(Color.WHITE);
		rdsi53.setBounds(10, 130, 44, 23);
		add(rdsi53);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi53);
		grupo.add(rdno53);
		
		rdno54 = new JRadioButton("No");
		rdno54.setBackground(Color.WHITE);
		rdno54.setBounds(56, 180, 44, 23);
		add(rdno54);
		
		rdsi54 = new JRadioButton("Si");
		rdsi54.setBackground(Color.WHITE);
		rdsi54.setBounds(10, 180, 44, 23);
		add(rdsi54);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi54);
		grupo.add(rdno54);
		
		rdno55 = new JRadioButton("No");
		rdno55.setBackground(Color.WHITE);
		rdno55.setBounds(56, 230, 44, 23);
		add(rdno55);
		
		rdsi55 = new JRadioButton("Si");
		rdsi55.setBackground(Color.WHITE);
		rdsi55.setBounds(10, 230, 44, 23);
		add(rdsi55);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi55);
		grupo.add(rdno55);
		
		rdno56 = new JRadioButton("No");
		rdno56.setBackground(Color.WHITE);
		rdno56.setBounds(56, 280, 44, 23);
		add(rdno56);
		
		rdsi56 = new JRadioButton("Si");
		rdsi56.setBackground(Color.WHITE);
		rdsi56.setBounds(10, 280, 44, 23);
		add(rdsi56);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi56);
		grupo.add(rdno56);
		
		rdno57 = new JRadioButton("No");
		rdno57.setBackground(Color.WHITE);
		rdno57.setBounds(56, 331, 44, 23);
		add(rdno57);
		
		rdsi57 = new JRadioButton("Si");
		rdsi57.setBackground(Color.WHITE);
		rdsi57.setBounds(10, 331, 44, 23);
		add(rdsi57);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi57);
		grupo.add(rdno57);
		
		rdno58 = new JRadioButton("No");
		rdno58.setBackground(Color.WHITE);
		rdno58.setBounds(56, 380, 44, 23);
		add(rdno58);
		
		rdsi58 = new JRadioButton("Si");
		rdsi58.setBackground(Color.WHITE);
		rdsi58.setBounds(10, 380, 44, 23);
		add(rdsi58);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi58);
		grupo.add(rdno58);
		
		rdno59 = new JRadioButton("No");
		rdno59.setBackground(Color.WHITE);
		rdno59.setBounds(56, 431, 44, 23);
		add(rdno59);
		
		rdsi59 = new JRadioButton("Si");
		rdsi59.setBackground(Color.WHITE);
		rdsi59.setBounds(10, 431, 44, 23);
		add(rdsi59);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi59);
		grupo.add(rdno59);
		
		rdno60 = new JRadioButton("No");
		rdno60.setBackground(Color.WHITE);
		rdno60.setBounds(56, 481, 44, 23);
		add(rdno60);
		
		rdsi60 = new JRadioButton("Si");
		rdsi60.setBackground(Color.WHITE);
		rdsi60.setBounds(10, 481, 44, 23);
		add(rdsi60);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi60);
		grupo.add(rdno60);
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
