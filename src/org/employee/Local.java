package org.employee;

public class Local {
	 public static int a;//instace or global variable;
 public void empId() {
	  a=10;//declare inside the method;(local variables)
	 System.out.println("print the value of a="+a);
 }
 public static void main(String[] args) {
	Local e=new Local();
	System.out.println(e.a);
	e.empId();
	System.out.println(e.a);
	Local e1=new Local();
	System.out.println(e1.a);
	e1.empId();
	System.out.println(e1.a);
}
 
 
 
}
