package com.facebook;
import java.util.*;

public class Mainclass {

String name;
String address;
int balance;
void setter() {
	Scanner Myscan= new Scanner(System.in);
	System.out.println("enter name:");
	name= Myscan.next();
	System.out.println("enter address:");
	address= Myscan.next();
	System.out.println("enter balance:");
	balance= Myscan.nextInt();

}
void getter() {
	System.out.println("name is:"+name);
	System.out.println("address is:"+address);
	System.out.println("balance is:"+balance);

	System.out.println("=================");

}
void credit_blance(int money,int fees) {
	/*balance+= money;
	System.out.println("balance is:"+balance);
	balance-=fees;
	System.out.println("renaming balance is:"+balance);
*/
}
public static void main(String []args) {
	Mainclass c1=new Mainclass();
    c1.setter();
    int amt=5000;
    int charges=20;
    c1.credit_blance(amt, charges);
    c1.getter();
    
	
	
/*System.out.println("c1 object name is:"+c1.name);
System.out.println("c1 object address is:"+c1.address);
System.out.println("c2 object name is:"+c2.name);
System.out.println("c2s object address is:"+c2.address);*/

}
}