package com.smarcotte_scanner_demo;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) 
	{
		// create variables
		String name = "";
		short age =0;
		float cash = 0.0f;
		
		// get input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = in.nextLine();
		System.out.print("Enter age: ");
		age = in.nextShort();
		System.out.print("Enter cash: ");
		cash = in.nextFloat();
		
		in.close(); // close the input scanner to clear the memory
		
		// display output
		System.out.println(); // blank line println = print line
		System.out.println( name + ", " + age + ", " + cash );
		
		// exit gracefully
		System.exit(0);

	}

}
