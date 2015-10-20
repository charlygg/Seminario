package com.test.Help;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class Ayuda extends JDialog {

	private JTextPane editext;
	private JScrollPane scroll;
	private JButton cerrar;

	public Ayuda() {
		setResizable(false);
		
		setTitle("Ayuda");
		setModal(true);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		this.setLocationRelativeTo(this);

		editext = new JTextPane();
		scroll = new JScrollPane(editext);
		scroll.setLocation(0, 0);
		scroll.setSize(493, 221);
		editext.setEditable(false);
		editext.setFont(new Font("Arial", Font.PLAIN, 18));
		editext.setText("Test de Orientacion Vocacional Chaside" +
				"\n¿Cómo contestar el test correctamente?" + 
				"\n\n1) Ingresa tus datos al momento de contestar el test" +
				"\n2) Empieza a responder las preguntas marcando la opción si o no según sea el caso" +
				"\n\n¿Se guardan mis resultados?" +
				"\nSí, los resultados y la información personal se guardar en un archivo de texto que" +
				" se adjunta en la raíz de la carpeta del proyecto, y se irá almacenando más datos" +
				" a medida que se realizen mayor cantidad de Test");
		getContentPane().add(scroll);
		
		cerrar = new JButton("Cerrar");
		cerrar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		cerrar.setSize(500, 50);
		cerrar.setLocation(0, 221);
		cerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		getContentPane().add(cerrar);
	}

}
