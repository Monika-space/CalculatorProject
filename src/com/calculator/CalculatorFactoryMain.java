package com.calculator;

import java.util.Scanner;

public class CalculatorFactoryMain {

	public static void main(String[] args) 
	{
     System.out.println("Enter two number");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
 /*    System.out.println("Enter arithematic operation that you wanna perform on 2 numbers");
     String Operation = sc.next();
     */
     CalculatorFactoryBuilder cfb = new CalculatorFactoryBuilder();
     Calculator cal = cfb.getInstance();
     cal.Multiply(a, b);
	}

}
