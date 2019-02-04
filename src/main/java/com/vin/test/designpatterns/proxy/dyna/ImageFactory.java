package com.vin.test.designpatterns.proxy.dyna;

import java.lang.reflect.Proxy;

import com.vin.test.designpatterns.proxy.stat.Image;

public class ImageFactory {
	public static Image getIamge(String name) {
		return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(),new Class[] {Image.class}, new ImageInvocationHandler(name));
	}

}
