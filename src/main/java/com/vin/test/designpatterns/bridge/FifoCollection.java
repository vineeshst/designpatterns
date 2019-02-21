package com.vin.test.designpatterns.bridge;

public interface FifoCollection<T> {
	//Adds element to collection
	void offer(T element);
	
	//Removes & returns first element from collection
	T poll();

}
