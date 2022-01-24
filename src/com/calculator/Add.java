package com.calculator;

public class Add implements Calculator 
{
	@Override
		public void add(int first_num, int second_num) 
		{
			int result = first_num + second_num;
			System.out.println("addition of "+first_num+" & "+second_num+" is "+result);
		}
}

