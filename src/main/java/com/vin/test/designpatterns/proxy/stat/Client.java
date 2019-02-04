package com.vin.test.designpatterns.proxy.stat;

import java.awt.geom.Point2D;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImge("A1.bmp");
		image.setLocation(new Point2D.Double(10, 10));
		System.out.println("Image location : "+image.getLocation());
		System.out.println("Rendering image now... ");
		image.render();

	}

}
