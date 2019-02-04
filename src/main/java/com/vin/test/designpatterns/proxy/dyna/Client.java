package com.vin.test.designpatterns.proxy.dyna;

import java.awt.geom.Point2D;

import com.vin.test.designpatterns.proxy.stat.Image;

public class Client {
	public static void main(String[] args) {
		Image image = ImageFactory.getIamge("A.bmp");
		image.setLocation(new Point2D.Double(-10,0));
		System.out.println(image.getLocation());
		System.out.println("*****************************");
		image.render();
		
		
	}

}
