package org.string;

import java.util.Scanner;

public class Strings {
	public void length() {
		   String a="GreensTechnology";
		   String b="SeleniumAutomationtool";
		   String c="velmurugan";
		   String d="j a v a p r o g r a m";
		   String e="9095484678";
		   System.out.println(a.length()+" "+b.length()+" "+c.length()+" "+d.length()+" "+e.length());
	}
	public void particularCharacterIndex() {
		String a1="GreensTechnology"; 
		//Find the last index of o
		String b1="SeleniumAutomationtool"; 
		//Find the index of o
		String c1="Velmurugan"; 
		// Find the index of n
        String d1="j a v a p r o g r a m ";
        //Find the last index of  (emptyspace)
        String e1="9095484678";
        //Find the index of 8
        System.out.println(a1.lastIndexOf('o')+" "+b1.indexOf('o')+" "+c1.indexOf('n')+" "+d1.lastIndexOf(' ')+" "+e1.indexOf('8'));
	}
	public void particularCharacter() {
		String a2="GreensTechnology"; 
        //print the character h 
        String b2="SeleniumAutomationtool"; 
        //print the character o
        String c2="velmurugan"; 
        //print the character u
        String d2="j a v a p r o g r a m ";
        //print the character p
        String e2="9095484678";
        //print the character 7
        System.out.println(a2.charAt(9)+" "+b2.charAt(11)+" "+c2.charAt(4)+" "+d2.charAt(8)+" "+e2.charAt(8));
	}
	public void equal(){
		String a3="Nisha";
		String b3="nisha";
		if(a3.equals(b3))
		    System.out.println("true");
		else
		    System.out.println("false");
		if(a3.equalsIgnoreCase(b3))
			System.out.println("true");
		else
		    System.out.println("false");
	}
	public void presentOrNot() {
		//Get the email id from the user and verify '@' is present or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter email id");
		String a=scan.nextLine();
		boolean flag=a.contains("@");
		System.out.println(flag);
		
		}
	
	public static void main(String[] args) {
	   new Strings().length();
	   new Strings().particularCharacterIndex();
	   new Strings().particularCharacter();
	   new Strings().equal();
	   new Strings().presentOrNot();
	}
}
