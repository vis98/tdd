package com.demo.tddcalc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    
	
	public static int add (String numbers) {
		 String regex = "[+-]?[0-9]+";
		if(numbers.length()==0) {
			return 0;
		}
		 String input=Character.toString(numbers.charAt(0));
		 Pattern p = Pattern.compile(regex);
          
	      Matcher m = p.matcher(input);
	      if(m.find() && m.group().equals(input));
	      {
	    	  return Integer.parseInt(input);
	      }
	}
}
