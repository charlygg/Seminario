package com.test.Image;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Resizable {
	
	  public  BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {  
	        int w = bufferedImage.getWidth();  
	        int h = bufferedImage.getHeight();  
	        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());  
	        Graphics2D g = bufim.createGraphics();  
	        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
	        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);  
	        g.dispose();  
	        return bufim;  
	  }

}
