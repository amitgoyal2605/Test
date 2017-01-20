package com.carematix.test;

import com.carematix.exception.CarematixException;
import com.carematix.exception.ConfigurationException;

public class Sub extends Super {
	
	
	@Override
	public void doSomething(Animal a) throws ConfigurationException{
		System.out.println("in sub do something1 animal");
		try {
			super.doSomething(a);
		} catch (CarematixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in sub do something2");
	}
	
	

}
