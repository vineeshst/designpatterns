package com.vin.test.designpatterns.proxy.stat;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
	private String name;
	private Point2D location;
		
	public BitmapImage(String name) {		
		this.name = name;
	}
	public Point2D getLocation() {
		return location;
	}
	public void setLocation(Point2D location) {
		this.location = location;
	}
	public void render() {
		//Render to screen
		System.out.println("Rendered "+this.name);
		
	}	
}
