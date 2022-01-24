package com.calculator;

import sun.security.jca.GetInstance;

public class CalculatorFactoryBuilder 
{
   public Calculator getInstance(String operation)
   {
	    if((operation.toLowerCase()).equals("add"))
	    {
	 		   	return new Add();
	    }
	    else
	    return new Add();
   }
}
