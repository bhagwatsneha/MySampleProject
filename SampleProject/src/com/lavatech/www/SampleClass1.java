package com.lavatech.www;

import java.util.Scanner;

public class SampleClass1 {

	public static void main(String[] args) {
		//int age;
		String[]name;
		name=new String[5];
		Scanner Myscan =new Scanner(System.in);
		int count=0;
		while(count<5) {
			System.out.println("enter name:");
			name[count]=Myscan.next();
			System.out.println("enter name is:"+name[count]);
			count++;
					
		}
		
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	System.out.println(name[4]);
		
		
		
	}

}
