package com.vin.test.designpatterns.proxy.stat;

import java.awt.geom.Point2D;

public interface Image {
	void setLocation(Point2D point2d);
	Point2D getLocation();
	void render();
}
