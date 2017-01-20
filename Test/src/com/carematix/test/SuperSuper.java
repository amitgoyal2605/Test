package com.carematix.test;

import com.carematix.exception.CarematixException;

public class SuperSuper {
	
	protected void doSomething(Animal a) throws CarematixException {
		System.out.println("in Super super do something1");
				
		throw new RuntimeException();
		
	}

}
