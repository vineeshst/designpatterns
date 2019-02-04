package com.vin.test.designpatterns.proxy.stat;

public class ImageFactory {
	public static Image getImge(String name) {
		return new ImageProxy(name);
	}

}
