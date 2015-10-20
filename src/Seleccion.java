import java.awt.Container;

import javax.swing.*;

public class Seleccion extends JFrame{
	
	JButton sel,sel2;
	
	public Seleccion(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Selecciond e Tipo de Test Psicométrico");
		this.setLocationRelativeTo(this);
		this.setLayout(null);
		
		Container con = getContentPane();
	}
	
	public static void main(String[] args){
		new Seleccion();
	}

}
