package com.carematix.test;

import static com.carematix.util.HashTest.str;

import java.text.DecimalFormat;
import java.util.Calendar;

import com.carematix.exception.CarematixException;
import com.carematix.exception.ConfigurationException;

public class Test {

	public static void main(String[] args)
	{
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		
		Sub sub = new Sub();
		
		Animal ax = new Animal();
		
		Animal ax1 = new Dog();
		
		Dog ax2 = new Dog();
		
		try {
			sub.doSomething(ax2);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CarematixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after sub");
		
		long a1 = 1L;
		
		float x =  (float)25/9;
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.format(x);
		
		System.out.println(",,,"+x);
		System.out.println(",,,"+df.format(x));
		
		float i1 = ((float)a1/29)*100;
		
		System.out.println(i1);
		
		int i2 = (int)i1;
		
		System.out.println(i2);
		
		
		
		String str1 = "Dear <b>Dr. Carla Robinson</b>,<br><br> Dummie2 Account2(111222333) has had the following alerts: <br><br>The Weight Reading ( 225.0  Pound measured on 07 Mar 2016 12:15 CST ) is  (Level 3) Above for the last 1 Readings.<br><br><br>Primary Nurse: <b>Canary Telehealth3</b><br><br>Regards, <br>Canary Telehealth Team.<br>";

		//str1 = "Dear Dr. Carla Robinson,\n\n Dummie2 Account2(111222333) has had the following alerts: \n\nThe Weight Reading ( 225.0  Pound measured on 07 Mar 2016 12:15 CST ) is  (Level 3) Above for the last 1 Readings.\n\n\nPrimary Nurse: Canary Telehealth3\n\nRegards, \nCanary Telehealth Team.\n";
		System.out.println(isHTML(str1));
		
		String a = str;
		
		String s =	  "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,00.0,00.0,00,00,00,00,00\n"
					+ "C01228,25.0,00.0,01,29,16,15,36\n"
					+ "C01228,28.8,00.0,01,29,16,23,30\n";
		
		String lines[] = s.split("\\r?\\n");
		
		int i= 0;
		for(String str:lines)
		{
			System.out.println(lines[i++]);
		}
		
		
		
	}
	
	private static boolean isHTML(String str)
	{
		boolean isHTML = false;
		
		if(str != null && str.contains("<") && str.contains(">"))
		{
			isHTML = true;
		}
		
		return isHTML;
	}
}