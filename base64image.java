package test;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
	String out;
	BufferedImage bi = new BufferedImage(200, 150, BufferedImage.TYPE_INT_RGB);
	Graphics g = bi.getGraphics();
	g.setColor(new Color(0, 0, 0));
	g.fillRect(1, 1, 198, 148);
	BASE64Encoder encoder = new BASE64Encoder();
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	try{
		ImageIO.write(bi, "png", baos);
		out = "<img src=\"data:image/png;base64," + encoder.encodeBuffer(baos.toByteArray()) + "\" alt=\"У вас не поддерживаются base64 изображения!!!\" />");
	}catch(Exception e){
		e.printStackTrace();
	}
    }
}
