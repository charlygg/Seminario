package com.test.VP;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.test.OV.PrincipalOV;

@SuppressWarnings("serial")
public class RegistroPersona extends JDialog implements ActionListener{
	
	private JTextField txt_nombre;
	private JTextField txt_email;
	private JTextField txt_pais;
	private JSpinner sp_edad;
	private JButton btnRegistrar;
	private JButton btnCerrar;
	VentanaPadre ventanaPadre;

	public RegistroPersona(VentanaPadre ventanaPadre) {
		this.ventanaPadre=ventanaPadre;
		setTitle("Formulario de registro");
		setBounds(100, 100, 311, 391);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 295, 390);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(47, 47, 62, 14);
		panel.add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(47, 107, 62, 14);
		panel.add(lblEmail);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEdad.setBounds(47, 167, 62, 14);
		panel.add(lblEdad);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPas.setBounds(47, 227, 62, 14);
		panel.add(lblPas);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(111, 40, 122, 28);
		panel.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_email = new JTextField();
		txt_email.setBounds(111, 100, 122, 28);
		panel.add(txt_email);
		txt_email.setColumns(10);
		
		txt_pais = new JTextField();
		txt_pais.setBounds(111, 220, 122, 28);
		panel.add(txt_pais);
		txt_pais.setColumns(10);
		
		sp_edad = new JSpinner();
		sp_edad.setModel(new SpinnerNumberModel(1, 1, 150, 1));
		sp_edad.setBounds(136, 160, 77, 28);
		panel.add(sp_edad);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(26, 279, 103, 34);
		btnRegistrar.addActionListener(this);
		panel.add(btnRegistrar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(158, 279, 103, 34);
		btnCerrar.addActionListener(this);
		panel.add(btnCerrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("images/FONDO-PREGUNTAS.png"));
		label.setBounds(0, 0, 295, 357);
		panel.add(label);

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==btnRegistrar){
			if(txt_nombre.getText().equals("") || txt_email.getText().equals("") || 
					txt_pais.getText().equals("") || (Integer.parseInt(sp_edad.getValue().toString()) < 0)){
				JOptionPane.showMessageDialog(rootPane, "Faltan campos por rellenar");
			} else {
				Persona persona = new Persona();
				persona.setNombre(txt_nombre.getText().toString());
				persona.setEmail(txt_email.getText().toString());
				persona.setEdad(Integer.parseInt(sp_edad.getValue().toString()));
				persona.setPais(txt_pais.getText().toString());
				new PrincipalOV(ventanaPadre,persona).setVisible(true);
				this.dispose();
			}
		}
		
		if(evt.getSource()==btnCerrar){
			this.dispose();
		}
	}
}
