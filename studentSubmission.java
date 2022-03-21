package com.nitin;

public class studentSubmission {
	  boolean checkNumber(int number) {
		  boolean b = false;
		 for(int i=0;i<=number;i++) {
			 
		   if(i%2!=0 || i%3!=0) {
			   System.out.println(i);
			  b=true; 
		   }
		      }
		return b;
		  }
}
