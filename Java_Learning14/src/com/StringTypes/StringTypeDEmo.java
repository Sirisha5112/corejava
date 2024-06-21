package com.StringTypes;

public class StringTypeDEmo {
public static void main(String[] args) {
	
	//Literal string
	String st1="JAVA";
	String st2="JAVA";
	if(st1==st2)
	{
		System.out.println("st1 is equal to st2");
	}
	else
	{
		System.out.println("Not Equal");
	}
	System.out.println("st1:"+System.identityHashCode(st1));
	System.out.println("st2:"+System.identityHashCode(st2));
	
	//non literal string
	String s1=new String("HELLO");
	String s2 =new String("HELLO");
	if(s1==s2)
	{
		System.out.println("s1 is equal to s2");
	}
	else
	{
		System.out.println("Not Equal");
	}
	System.out.println("s1:"+System.identityHashCode(s1));
	System.out.println("s2:"+System.identityHashCode(s2));
	
	//MUTABLE string
	 String str1="welcome";
	 String str2="Ciri";
	 System.out.println("str1:"+System.identityHashCode(str1));
	 System.out.println("str2:"+System.identityHashCode(str2));
	 
	 String concat=str1.concat(str2);
	 System.out.println("concat:"+concat);
	 System.out.println("concat hashcode:"+System.identityHashCode(concat));
	 
	 //IMMUTABLE String
	 StringBuffer s3= new StringBuffer("HTML");
	 StringBuffer s4=new StringBuffer("css");
	 System.out.println("s3:"+System.identityHashCode(s3));
     System.out.println("s4:"+System.identityHashCode(s4));
     
     StringBuffer Append= s3.append(s4);
     System.out.println(Append);
     System.out.println("appent:"+System.identityHashCode(Append));
     
	 
}
}
