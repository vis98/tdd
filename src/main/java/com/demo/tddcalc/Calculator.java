package com.demo.tddcalc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    
	
	public static int add (String numbers) {
		 String regex = "[+-]?[0-9]+";
		if(numbers.length()==0) {
			return 0;
		}
		if(numbers.length()==1) {
			//added pattern matching because thought is to check whether single string is integer or not
		 String input=Character.toString(numbers.charAt(0));
		 Pattern p = Pattern.compile(regex);
          
	      Matcher m = p.matcher(input);
	      if(m.find() && m.group().equals(input));
	      {
	    	  return Integer.parseInt(input);
	      }
		}
		else {
			String nos[]=numbers.split(",");
			return Integer.parseInt(nos[0])+Integer.parseInt(nos[1]);
		}
	}
}
