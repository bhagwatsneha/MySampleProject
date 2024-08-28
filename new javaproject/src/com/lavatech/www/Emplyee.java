package com.lavatech.www;



public class Emplyee   {

	 String name="ram";
     long phno=12536622l;
     static float  discount=10f;
     public static void main (String[]args) {
    	 Emplyee e1 =new 	 Emplyee();
    	
    	 System.out.println(e1.name);
    	 System.out.println(e1.phno);
    	 Emplyee e2 =new 	 Emplyee();
    	 e2.name="ram";
    	 System.out.println(e2.name);
    	 System.out.println(e1.discount);
    	 Emplyee.discount=20f;
    	 System.out.println(e1.name);
    	 System.out.println(e1.discount);
     }

}
