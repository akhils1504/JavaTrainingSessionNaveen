package OOPConcept_Part1;

import java.util.concurrent.SynchronousQueue;

public class ConstructorConcepts {
String st;
int age= 100;
	public static void main(String[] args) {
		ConstructorConcepts ob= new ConstructorConcepts();//Constructor will only be invoked when we create an object-->Very very imp
		ConstructorConcepts ob1= new ConstructorConcepts(10);
		ConstructorConcepts ob2 = new ConstructorConcepts(10,20);
		ConstructorConcepts ob3= new ConstructorConcepts("Tom",23);
		System.out.println(ob3.age);
		System.out.println(ob3.st);

	}
public  ConstructorConcepts(){
	System.out.println("Default Constructor");
}
public ConstructorConcepts(int a){
	System.out.println("1paramter cons");
}
public ConstructorConcepts(int a ,int b){
	System.out.println("2 params constr");
}
public ConstructorConcepts(String st,int age){
	this.st=st;   // this.class variable=local  
	this.age=age;
	//st=st1;
	//age=age1;  //if the local and global variable are different no use of this keyword
}
}
