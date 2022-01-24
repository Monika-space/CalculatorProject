package com.calculator;

import sun.security.jca.GetInstance;

public class CalculatorFactoryBuilder 
{
   public Calculator getInstance()
   {
	   return new CalculatorImpl();
   }
}
