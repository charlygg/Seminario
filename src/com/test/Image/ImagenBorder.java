package com.test.Image;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.border.Border;


public class ImagenBorder implements Border{
	
	private BufferedImage imagen;

	public ImagenBorder(BufferedImage imagen) {
		this.imagen = imagen;
	}

	@Override
	public Insets getBorderInsets(Component arg0) {
		return new Insets(0,0,0,0);
	}

	@Override
	public boolean isBorderOpaque() {
		return true;
	}

	@Override
	public void paintBorder(Component comp, Graphics G, int x, int y,
			int width, int height) {
		int x0 = x+ (width-imagen.getWidth())/2;
		int y0 = y+ (height-imagen.getHeight())/2;
		G.drawImage(imagen, x0, y0, null);
		
	}

}
