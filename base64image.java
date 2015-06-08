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
		//TODO: полученное изображение представить в виде jpeg, закодировать через base64 и поместить строку out
		//JPEGImageEncoder jie = JPEGCodec.createJPEGEncoder(System.out);
		//jie.encode(bi);
    }
}
