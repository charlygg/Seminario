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
public class pnl10 extends JPanel {
	
	Resizable resizable = new Resizable();
	BufferedImage imagen;
	File file = new File("images/FONDO-PREGUNTAS.png");

	public JLabel lb1;
	public JLabel lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	public JRadioButton rdsi91;
	public JRadioButton rdno91;
	public JRadioButton rdno92;
	public JRadioButton rdno93;
	public JRadioButton rdsi93;
	public JRadioButton rdno94;
	public JRadioButton rdsi94;
	public JRadioButton rdno95;
	public JRadioButton rdsi95;
	public JRadioButton rdno96;
	public JRadioButton rdsi96;
	public JRadioButton rdno97;
	public JRadioButton rdsi97;
	public JRadioButton rdno98;
	public JRadioButton rdsi98;

	public ButtonGroup grupo;
	public JRadioButton rdsi92;
	
	
	public pnl10() {

		setBounds(0, 0, 794, 517);
		setLayout(null);
		
		lb1 = new JLabel("91 ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?");
		lb1.setBounds(10, 10, 700, 14);
		add(lb1);
		
		lb2 = new JLabel("92 ¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?");
		lb2.setBounds(10, 60, 700, 14);
		add(lb2);
		
		lb3 = new JLabel("93 ¿Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?");
		lb3.setBounds(10, 110, 700, 14);
		add(lb3);
		
		lb4 = new JLabel("94 ¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?");
		lb4.setBounds(10, 160, 700, 14);
		add(lb4);
		
		lb5 = new JLabel("95 ¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?");
		lb5.setBounds(10, 210, 700, 14);
		add(lb5);
		
		lb6 = new JLabel("96 ¿Cuando elegís tu ropa o decorás un ambiente, tenés en cuenta la combinación de los colores, las telas o el estilo de los muebles?");
		lb6.setBounds(10, 260, 700, 14);
		add(lb6);
		
		lb7 = new JLabel("97 ¿Te gustaría trabajar como profesional dirigiendo la construcción de una empresa hidroeléctrica?");
		lb7.setBounds(10, 310, 700, 14);
		add(lb7);
		
		lb8 = new JLabel("98 ¿Sabés qué es el PBI?");
		lb8.setBounds(10, 360, 700, 14);
		add(lb8);
		
		rdsi91 = new JRadioButton("Si");
		rdsi91.setBackground(Color.WHITE);
		rdsi91.setBounds(10, 30, 44, 23);
		add(rdsi91);
		
		rdno91 = new JRadioButton("No");
		rdno91.setBackground(Color.WHITE);
		rdno91.setBounds(56, 30, 44, 23);
		add(rdno91);
	
		grupo = new ButtonGroup();
		grupo.add(rdsi91);
		grupo.add(rdno91);
		
		rdno92 = new JRadioButton("No");
		rdno92.setBackground(Color.WHITE);
		rdno92.setBounds(56, 81, 44, 23);
		add(rdno92);
		
		rdsi92 = new JRadioButton("Si");
		rdsi92.setBackground(Color.WHITE);
		rdsi92.setBounds(10, 81, 44, 23);
		add(rdsi92);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi92);
		grupo.add(rdno92);
		
		rdno93 = new JRadioButton("No");
		rdno93.setBackground(Color.WHITE);
		rdno93.setBounds(56, 130, 44, 23);
		add(rdno93);
		
		rdsi93 = new JRadioButton("Si");
		rdsi93.setBackground(Color.WHITE);
		rdsi93.setBounds(10, 130, 44, 23);
		add(rdsi93);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi93);
		grupo.add(rdno93);
		
		rdno94 = new JRadioButton("No");
		rdno94.setBackground(Color.WHITE);
		rdno94.setBounds(56, 180, 44, 23);
		add(rdno94);
		
		rdsi94 = new JRadioButton("Si");
		rdsi94.setBackground(Color.WHITE);
		rdsi94.setBounds(10, 180, 44, 23);
		add(rdsi94);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi94);
		grupo.add(rdno94);
		
		rdno95 = new JRadioButton("No");
		rdno95.setBackground(Color.WHITE);
		rdno95.setBounds(56, 230, 44, 23);
		add(rdno95);
		
		rdsi95 = new JRadioButton("Si");
		rdsi95.setBackground(Color.WHITE);
		rdsi95.setBounds(10, 230, 44, 23);
		add(rdsi95);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi95);
		grupo.add(rdno95);
		
		rdno96 = new JRadioButton("No");
		rdno96.setBackground(Color.WHITE);
		rdno96.setBounds(56, 280, 44, 23);
		add(rdno96);
		
		rdsi96 = new JRadioButton("Si");
		rdsi96.setBackground(Color.WHITE);
		rdsi96.setBounds(10, 280, 44, 23);
		add(rdsi96);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi96);
		grupo.add(rdno96);
		
		rdno97 = new JRadioButton("No");
		rdno97.setBackground(Color.WHITE);
		rdno97.setBounds(56, 331, 44, 23);
		add(rdno97);
		
		rdsi97 = new JRadioButton("Si");
		rdsi97.setBackground(Color.WHITE);
		rdsi97.setBounds(10, 331, 44, 23);
		add(rdsi97);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi97);
		grupo.add(rdno97);
		
		rdno98 = new JRadioButton("No");
		rdno98.setBackground(Color.WHITE);
		rdno98.setBounds(56, 380, 44, 23);
		add(rdno98);
		
		rdsi98 = new JRadioButton("Si");
		rdsi98.setBackground(Color.WHITE);
		rdsi98.setBounds(10, 380, 44, 23);
		add(rdsi98);
		
		grupo = new ButtonGroup();
		grupo.add(rdsi98);
		grupo.add(rdno98);
		
		grupo = new ButtonGroup();
		
		grupo = new ButtonGroup();
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
