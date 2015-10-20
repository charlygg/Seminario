package com.test.OV;

import javax.swing.JOptionPane;

public class CalculadorTestChaside {

	
	public int aC=0, aH=0, aA=0, aS=0, aI=0, aD=0, aE=0; //Corresponden a Aptitudes
	public int iC=0, iH=0, iA=0, iS=0, iI=0, iD=0, iE=0; //Corresponden a Intereses

	public void addPanel1(pnl1 panel1) {

		if (panel1.rdsi1.isSelected()) {
			iC++;
		}

		if (panel1.rdsi2.isSelected()) {
			aC++;
		}

		if (panel1.rdsi3.isSelected()) {
			iA++;
		}

		if (panel1.rdsi4.isSelected()) {
			aS++;
		}

		if (panel1.rdsi5.isSelected()) {
			iD++;
		}

		if (panel1.rdsi6.isSelected()) {
			iI++;
		}

		if (panel1.rdsi7.isSelected()) {
			aE++;
		}

		if (panel1.rdsi8.isSelected()) {
			iS++;
		}

		if (panel1.rdsi9.isSelected()) {
			iH++;
		}

		if (panel1.rdsi10.isSelected()) {
			aI++;
		}
	}

	public void addPanel2(pnl2 panel2) {

		if (panel2.rdsi11.isSelected()) {
			iA++;
		}

		if (panel2.rdsi12.isSelected()) {
			iC++;
		}

		if (panel2.rdsi13.isSelected()) {
			aD++;
		}

		if (panel2.rdsi14.isSelected()) {
			iD++;
		}

		if (panel2.rdsi15.isSelected()) {
			aC++;
		}

		if (panel2.rdsi16.isSelected()) {
			iS++;
		}

		if (panel2.rdsi17.isSelected()) {
			iE++;
		}

		if (panel2.rdsi18.isSelected()) {
			aD++;
		}

		if (panel2.rdsi19.isSelected()) {
			iI++;
		}

		if (panel2.rdsi20.isSelected()) {
			iC++;
		}

	}

	public void addPanel3(pnl3 panel3) {

		if (panel3.rdsi21.isSelected()) {
			iA++;
		}

		if (panel3.rdsi22.isSelected()) {
			aA++;
		}

		if (panel3.rdsi23.isSelected()) {
			iS++;
		}

		if (panel3.rdsi24.isSelected()) {
			iD++;
		}

		if (panel3.rdsi25.isSelected()) {
			iH++;
		}

		if (panel3.rdsi26.isSelected()) {
			aI++;
		}

		if (panel3.rdsi27.isSelected()) {
			iI++;
		}

		if (panel3.rdsi28.isSelected()) {
			iA++;
		}

		if (panel3.rdsi29.isSelected()) {
			aS++;
		}

		if (panel3.rdsi30.isSelected()) {
			aH++;
		}

	}
	
	public void addPanel4(pnl4 panel4) {

		if (panel4.rdsi31.isSelected()) {
			iD++;
		}

		if (panel4.rdsi32.isSelected()) {
			iE++;
		}

		if (panel4.rdsi33.isSelected()) {
			iS++;
		}

		if (panel4.rdsi34.isSelected()) {
			iH++;
		}

		if (panel4.rdsi35.isSelected()) {
			iE++;
		}

		if (panel4.rdsi36.isSelected()) {
			iA++;
		}

		if (panel4.rdsi37.isSelected()) {
			iD++;
		}

		if (panel4.rdsi38.isSelected()) {
			iI++;
		}

		if (panel4.rdsi39.isSelected()) {
			aA++;
		}

		if (panel4.rdsi40.isSelected()) {
			aS++;
		}	
	}
	
	public void addPanel5(pnl5 panel5) {

		if (panel5.rdsi41.isSelected()) {
			iH++;
		}

		if (panel5.rdsi42.isSelected()) {
			iE++;
		}

		if (panel5.rdsi43.isSelected()) {
			aD++;
		}

		if (panel5.rdsi44.isSelected()) {
			iS++;
		}

		if (panel5.rdsi45.isSelected()) {
			iA++;
		}

		if (panel5.rdsi46.isSelected()) {
			aC++;
		}

		if (panel5.rdsi47.isSelected()) {
			iI++;
		}

		if (panel5.rdsi48.isSelected()) {
			iD++;
		}

		if (panel5.rdsi49.isSelected()) {
			iE++;
		}

		if (panel5.rdsi50.isSelected()) {
			//?? no esta definido
		}	
		
	}

	public  void addPanel6(pnl6 panel6) {
		
		if (panel6.rdsi51.isSelected()) {
			aC++;
		}

		if (panel6.rdsi52.isSelected()) {
			iS++;
		}

		if (panel6.rdsi53.isSelected()) {
			iC++;
		}

		if (panel6.rdsi54.isSelected()) {
			iI++;
		}

		if (panel6.rdsi55.isSelected()) {
			aE++;
		}

		if (panel6.rdsi56.isSelected()) {
			iH++;
		}

		if (panel6.rdsi57.isSelected()) {
			iA++;
		}

		if (panel6.rdsi58.isSelected()) {
			iD++;
		}

		if (panel6.rdsi59.isSelected()) {
			aI++;
		}

		if (panel6.rdsi60.isSelected()) {
			iI++;
		}	
	}

	public void addPanel7(pnl7 panel7) {
		
		if (panel7.rdsi61.isSelected()) {
			iE++;
		}

		if (panel7.rdsi62.isSelected()) {
			iS++;
		}

		if (panel7.rdsi63.isSelected()) {
			aH++;
		}

		if (panel7.rdsi64.isSelected()) {
			iC++;
		}

		if (panel7.rdsi65.isSelected()) {
			iD++;
		}

		if (panel7.rdsi66.isSelected()) {
			aD++;
		}

		if (panel7.rdsi67.isSelected()) {
			iH++;
		}

		if (panel7.rdsi68.isSelected()) {
			iE++;
		}

		if (panel7.rdsi69.isSelected()) {
			aS++;
		}

		if (panel7.rdsi70.isSelected()) {
			iS++;
		}	
		
	}

	public void impresion() {
		JOptionPane.showMessageDialog(null, "RESULTADOS DEL TEST DE ORIENTACION VOCACIONAL" +
				"" +
				"\n\nAreas de Intereses " +
				"C = " + iC + "\nH = " + iH + "\nA = " + iA);
		
	
	}

	public void addPanel8(pnl8 panel8) {
		
		if (panel8.rdsi71.isSelected()) {
			iC++;
		}

		if (panel8.rdsi72.isSelected()) {
			aH++;
		}

		if (panel8.rdsi73.isSelected()) {
			iD++;
		}

		if (panel8.rdsi74.isSelected()) {
			iH++;
		}

		if (panel8.rdsi75.isSelected()) {
			iI++;
		}

		if (panel8.rdsi76.isSelected()) {
			aA++;
		}

		if (panel8.rdsi77.isSelected()) {
			iE++;
		}

		if (panel8.rdsi78.isSelected()) {
			iC++;
		}
		
		if (panel8.rdsi79.isSelected()) {
			aE++;
		}

		if (panel8.rdsi80.isSelected()) {
			iH++;
		}		
	}

	public void addPanel9(pnl9 panel9) {
		
		if (panel9.rdsi81.isSelected()) {
			iA++;
		}

		if (panel9.rdsi82.isSelected()) {
			aA++;
		}

		if (panel9.rdsi83.isSelected()) {
			iI++;
		}

		if (panel9.rdsi84.isSelected()) {
			iD++;
		}

		if (panel9.rdsi85.isSelected()) {
			iC++;
		}

		if (panel9.rdsi86.isSelected()) {
			aH++;
		}

		if (panel9.rdsi87.isSelected()) {
			iS++;
		}

		if (panel9.rdsi88.isSelected()) {
			iE++;
		}
		
		if (panel9.rdsi89.isSelected()) {
			iH++;
		}

		if (panel9.rdsi90.isSelected()) {
			aI++;
		}	
		
	}

	public void addPanel10(pnl10 panel10) {
		
		if (panel10.rdsi91.isSelected()) {
			iC++;
		}

		if (panel10.rdsi92.isSelected()) {
			iS++;
		}

		if (panel10.rdsi93.isSelected()) {
			iE++;
		}

		if (panel10.rdsi94.isSelected()) {
			aE++;
		}

		if (panel10.rdsi95.isSelected()) {
			iH++;
		}

		if (panel10.rdsi96.isSelected()) {
			iA++;
		}

		if (panel10.rdsi97.isSelected()) {
			iI++;
		}

		if (panel10.rdsi98.isSelected()) {
			iC++;
		}

		
	}

	
}
