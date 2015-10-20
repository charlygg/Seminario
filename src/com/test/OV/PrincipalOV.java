package com.test.OV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.test.VP.Persona;
import com.test.VP.VentanaPadre;

@SuppressWarnings("serial")
public class PrincipalOV extends JDialog implements ActionListener{

	private JPanel Panel_contenedor = new JPanel();
	
	pnl1 panel1 = new pnl1();
	pnl2 panel2 = new pnl2();
	pnl3 panel3 = new pnl3();
	pnl4 panel4 = new pnl4();
	pnl5 panel5 = new pnl5();
	pnl6 panel6 = new pnl6();
	pnl7 panel7 = new pnl7();
	pnl8 panel8 = new pnl8();
	pnl9 panel9 = new pnl9();
	pnl10 panel10 = new pnl10();
	
	
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnFinalizar;
	VentanaPadre ventanaPadre;
	Persona persona;
	int panelCount=1;

	public PrincipalOV(VentanaPadre ventanaPadre, Persona persona) {
		this.ventanaPadre=ventanaPadre;
		this.persona=persona;
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
		this.ventanaPadre = ventanaPadre;
		this.ventanaPadre.setVisible(false);
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				abreDialogo();
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setTitle("Test de Orientación Vocacional");
		setResizable(false);
		setBounds(100, 100, 800, 591);
		setLocationRelativeTo(this);
		getContentPane().setLayout(new BorderLayout());
		Panel_contenedor.setBackground(Color.BLACK);
		Panel_contenedor.setBounds(0, 0, 800, 591);
		getContentPane().add(Panel_contenedor, BorderLayout.CENTER);
		Panel_contenedor.setLayout(null);
		
		panel1.setBounds(0, 0, 794, 517);
		Panel_contenedor.add(panel1);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(259, 528, 89, 23);
		btnAnterior.addActionListener(this);
		Panel_contenedor.add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(408, 528, 89, 23);
		btnSiguiente.addActionListener(this);
		Panel_contenedor.add(btnSiguiente);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(667, 528, 89, 23);
		btnFinalizar.setEnabled(false);
		btnFinalizar.addActionListener(this);
		Panel_contenedor.add(btnFinalizar);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSiguiente){
			if(panelCount==10){
				btnFinalizar.setEnabled(true);
			} else{
			panelCount++;
			pintar();
			}
		}
		
		if(e.getSource()==btnAnterior){
			if(panelCount==1){
				//do nothing :P
			} else {
			panelCount--;
			pintar();
			}
		}
		
		if(e.getSource()==btnFinalizar){
			finalizar();
		}
		
	}


	private void pintar() {
		switch(panelCount){
		case 1:
			Panel_contenedor.removeAll();
			panel1.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel1);
			System.out.println("Panel 1 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
		
		case 2:
			Panel_contenedor.removeAll();
			panel2.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel2);
			System.out.println("Panel 2 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 3:
			Panel_contenedor.removeAll();
			panel3.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel3);
			System.out.println("Panel 3 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 4:
			Panel_contenedor.removeAll();
			panel4.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel4);
			System.out.println("Panel 4 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 5:
			Panel_contenedor.removeAll();
			panel5.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel5);
			System.out.println("Panel 5 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 6:
			Panel_contenedor.removeAll();
			panel6.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel6);
			System.out.println("Panel 6 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 7:
			Panel_contenedor.removeAll();
			panel7.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel7);
			System.out.println("Panel 7 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 8:
			Panel_contenedor.removeAll();
			panel8.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel8);
			System.out.println("Panel 8 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 9:
			Panel_contenedor.removeAll();
			panel9.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel9);
			System.out.println("Panel 9 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
			
		case 10:
			Panel_contenedor.removeAll();
			panel10.setBounds(0, 0, 794, 517);
			Panel_contenedor.add(panel10);
			System.out.println("Panel 10 pintado");
			Panel_contenedor.updateUI();
			Panel_contenedor.repaint();
			repaint();
			Panel_contenedor.add(btnAnterior);
			Panel_contenedor.add(btnSiguiente);
			Panel_contenedor.add(btnFinalizar);
			break;
		}
		
	}
	
	private void finalizar(){
		CalculadorTestChaside calc = new CalculadorTestChaside();
		calc.addPanel1(panel1);
		calc.addPanel2(panel2);
		calc.addPanel3(panel3);
		calc.addPanel4(panel4);
		calc.addPanel5(panel5);
		calc.addPanel6(panel6);
		calc.addPanel7(panel7);
		calc.addPanel8(panel8);
		calc.addPanel9(panel9);
		calc.addPanel10(panel10);
	
		
		  //Grafico de interes vocacionales            
                DefaultPieDataset data = new DefaultPieDataset();
                data.setValue("Administrativas-Contables",calc.aC);
                data.setValue("Humanidades-Sociales",calc.aH);
                data.setValue("Artistica",calc.aA);
                data.setValue("Salud",calc.aS);
                data.setValue("Ingenieria-Computacion",calc.aI);
                data.setValue("Defensa-Seguridad",calc.aD);
                data.setValue("Exactas",calc.aE);

                JFreeChart chart = ChartFactory.createPieChart(
                           "Reltados TEST-VOCACIONAL", //Títrulo del gráfico
                           data,true,true,true);
       
                                   
                ChartFrame frame=new ChartFrame("Areas vocacionales",chart);
                frame.pack();
                frame.setVisible(true);
                dispose();
                
                
                              //--------------------------
                DefaultPieDataset data2 = new DefaultPieDataset();
                data2.setValue("Organizativo-Analisis-Persuasivo-Responsable",calc.iC);
                data2.setValue("Justicia-Sagaz-Imaginativo",calc.iH);
                data2.setValue("Estetico-Visual-Creativo-Intuititvo",calc.iA);
                data2.setValue("Investigativo-Senso-Comprensivo-Solidario",calc.iS);
                data2.setValue("Exacto-Planificador-Critico-Preciso",calc.iI);
                data2.setValue("Liderazgo-Espiritu-Valiente-Agresivo",calc.iD);
                data2.setValue("Investigacion-Clasificacion-Metodico-Paciente",calc.iE);

                JFreeChart chart2 = ChartFactory.createPieChart(
                           "Reltados TEST-APTITUDES", //UTítrulo del gTráfico
                           data2,true,true,true);
        
                ChartFrame frame2=new ChartFrame("Areas aptitudes",chart2);
                frame2.pack();
                frame2.setVisible(true);
                ventanaPadre.setVisible(true);
                
                guardarArchivoTexto(calc);
	}
	
	private void guardarArchivoTexto(CalculadorTestChaside calc) {
		
		File file = new File("data.txt");
		if(!file.exists()){
			try {
				if(file.createNewFile()){
					System.out.println("El fichero se creó");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero ya existe");
		}
		
		try {
			BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
			//Escribiendo los datos personales ingresados en el formulario
			buffer.write("================================================");
			buffer.newLine();
			buffer.write("Nombre: " + persona.getNombre());
			buffer.newLine();
			buffer.write("Edad: " + Integer.toString(persona.getEdad()));
			buffer.newLine();
			buffer.write("Email: " + persona.getEmail());
			buffer.newLine();
			buffer.write("Pais: " + persona.getPais());
			buffer.newLine();
			//Escribiendo los resultados de areas de Interes
			buffer.write("_________________________________________________");
			buffer.newLine();
			buffer.write("Resultados en las áreas de Interes de la persona");
			buffer.newLine();
			buffer.write("Puntaje en base a 10 como máximo en las siguientes ciencias");
			buffer.newLine();
			buffer.write("Administrativas y Contables: " + calc.iC);
			buffer.newLine();
			buffer.write("Humanisticas y Sociales: " + calc.iH);
			buffer.newLine();
			buffer.write("Artisticas: " + calc.iA);
			buffer.newLine();
			buffer.write("Medicinas y Ciencias de la Salud: " + calc.iS);
			buffer.newLine();
			buffer.write("Ingeniería y Computación: " + calc.iI);
			buffer.newLine();
			buffer.write("Defensa y Seguridad: " + calc.iD);
			buffer.newLine();
			buffer.write("Ciencias Exactas y Agrarias: " + calc.iC);
			buffer.newLine();
			//Escribiendo los resultados de area de Vocación a la que le gusta
			buffer.write("_________________________________________________");
			buffer.newLine();
			buffer.write("Resultados en las áreas de Vocación");
			buffer.newLine();
			buffer.write("Puntaje en base a 5 como máximo en las siguientes ciencias");
			buffer.newLine();
			buffer.write("Administrativas y Contables: " + calc.aC);
			buffer.newLine();
			buffer.write("Humanisticas y Sociales: " + calc.aH);
			buffer.newLine();
			buffer.write("Artisticas: " + calc.aA);
			buffer.newLine();
			buffer.write("Medicinas y Ciencias de la Salud: " + calc.aS);
			buffer.newLine();
			buffer.write("Ingeniería y Computación: " + calc.aI);
			buffer.newLine();
			buffer.write("Defensa y Seguridad: " + calc.aD);
			buffer.newLine();
			buffer.write("Ciencias Exactas y Agrarias: " + calc.aC);
			buffer.newLine();
			buffer.close();
			System.out.println("Escritura correcta del archivo, se guardaron datos");
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo de texto");
			e.printStackTrace();
		}
		
		
	}



	public void abreDialogo () {
		int opcion = JOptionPane.showOptionDialog(rootPane, "Seguro que desea cerra la ventana", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		if(opcion==0){
			this.dispose();
			ventanaPadre.setVisible(true);
		}
	} 
}
