package com.vin.test.designpatterns.adapter.cls;

public class EmployeeObjectAdapter implements Customer{
	private Employee adaptee;
	
	public EmployeeObjectAdapter(Employee adaptee) {		
		this.adaptee = adaptee;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return adaptee.getOfficeLocation();
	}

}
