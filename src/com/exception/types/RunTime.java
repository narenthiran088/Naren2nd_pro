package com.exception.types;

public class RunTime {
public static void main(String[] args) {
	
	// Exception Handling
	
	int  a=10;
	
	
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Remaining codes....");
}

}
