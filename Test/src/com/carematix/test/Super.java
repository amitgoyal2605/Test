package com.carematix.test;

import com.carematix.exception.CarematixException;
import com.carematix.exception.ConfigurationException;

public class Super extends SuperSuper {
	
	
	
	protected void doSomething(Mammal a) throws CarematixException {
		System.out.println("in Super do something1");
		
		System.out.println();
				//super.doSomething(a);
		//throw new RuntimeException();
		
	}

}
