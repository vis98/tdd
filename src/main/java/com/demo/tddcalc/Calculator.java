package com.demo.tddcalc;


public class Calculator {
    
	
	public static int add (String numbers) {
		 String regex = "[+-]?[0-9]+";
		if(numbers.length()==0) {
			return 0;
		}
		if(numbers.length()==1) {
			//added pattern matching because thought is to check whether single string is integer or not
		 String input=Character.toString(numbers.charAt(0));
		
	    	  return Integer.parseInt(input);
	      
		}
		else {
			String nos[]=customDelimiter(numbers);
			return findsum(nos);
		}
	}
	
	public static int findsum(String no[]) {
		int sum=0;
		for(int i=0;i<no.length;i++) {
			if(no[i]!=""&& Integer.parseInt(no[i])>=0 && Integer.parseInt(no[i])<=1000) {
				sum=sum+Integer.parseInt(no[i]);
			}
		}
		return sum;
	}
	 public static String[] customDelimiter(String numbers) {
		 String nos[]=numbers.trim().split("[;,\n//]*");
		 return nos;
	 }
}
