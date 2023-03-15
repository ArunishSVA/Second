package org.jhh;

public class Sample {
	public static void main(String[] args) {
		//String Types
		//Literal String
		String s = "hello";
		String s1 ="hello";
		
		System.out.println("LIteral String");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		 
		//Non literal String
		String s2 = new String("java");
		String s3 = new String("java");
		
		System.out.println("Non Literal String ");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//immutable String
		
		String s4 =  "welcome";
		String s5 =  "welcome";
		
		System.out.println("immutable String" );
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		s=s4.concat(s5);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
	//mutable String 
		StringBuffer s6 = new StringBuffer("Java");
		StringBuilder s7 = new StringBuilder("Java");
		
		System.out.println("Mutable String");
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));
		s6 = s6.append(s7);
		System.out.println(s6);
	System.out.println(System.identityHashCode(s7));
	
	
	
	
	
	System.out.println("Arunish code change 1");
		
	System.out.println("Arunish code change 22");
	}
}
