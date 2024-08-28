package com.lavatech.www;
import java.util.*;
public class Sample1 {
	String name;
	String address;
	public void setter() {
		Scanner myscan=new Scanner(System.in);
		System.out.println("enter name:");
		name=myscan.next();
		System.out.println("enter address:");
		address=myscan.next();

	}
	public void getter(){
		System.out.println("nAME IS:"+name);
		System.out.println("address IS:"+address);

	}
	
}
	public static void main(String[]args) {
		Sample1 c1=new Sample1();
		c1.setter();
		c1.getter();
		
		}
	
	}
	}
