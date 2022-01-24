package com.calculator;

public class CalculatorImpl implements Calculator
{
	@Override
	public void add(int first_num, int second_num) 
	{
		int result = first_num + second_num;
		System.out.println("addition of "+first_num+" & "+second_num+" is "+result);
	}

	@Override
	public void substract(int first_num, int second_num) 
	{
		int result = first_num - second_num;
		System.out.println("Substraction of "+first_num+" & "+second_num+" is "+result);
	}

	@Override
	public void Multiply(int first_num, int second_num) 
	{
		int result = first_num * second_num;
		System.out.println("Multiplication of "+first_num+" & "+second_num+" is "+result);
	}

	@Override
	public void Divide(int first_num, int second_num) 
	{
		float result = first_num * second_num;
		System.out.println("Division of "+first_num+" & "+second_num+" is "+result);
		
	}
}
