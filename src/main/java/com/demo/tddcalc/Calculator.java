package com.demo.tddcalc;

import java.util.ArrayList;

public class Calculator {
    
	
	public static int add (String numbers) {
		 
			String nos[]=customDelimiter(numbers);
         checkNegative(nos);
           System.out.println("length is"+nos.length);
           for(int l=0;l<nos.length;l++) {
        	   System.out.println(nos[l]);
           }
		if(nos.length==0) {
			return 0;
		}
		if(nos.length==1) {
 		     String input=nos[0];
		   
	    	  return Integer.parseInt(input);
	      
		}
		else {
			return findsum(nos);
		}
	}
	
	public static int findsum(String no[]) {
		int sum=0;
		for(int i=0;i<no.length;i++) {
			if(no[i]!="" && Integer.parseInt(no[i])>=0 && Integer.parseInt(no[i])<=1000) {
				sum=sum+Integer.parseInt(no[i]);
			}
		}
		return sum;
	}
	 public static String[] customDelimiter(String numbers) {
		 if(numbers.length()==0) {
			 return new String[0];
		 }
		 String nos[]=numbers.trim().split("[;,\n//]*");
		 return nos;
	 }
	 private static void checkNegative(String num[]) {
			ArrayList<String> negative = new ArrayList<String>();
			for(int i=0; i<num.length; i++) {
				if(num[i]!=""&& Integer.parseInt(num[i])<0) {
					negative.add(num[i]);
				}
			}
			
		}
}
