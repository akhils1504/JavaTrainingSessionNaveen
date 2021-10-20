package This_Super_Constructoe;

//Always a parent class constrcuctor will be invoked first
//By default a const will be created if havent written it manually
//Super keyword is used to invoke parent class constructor and after that default const wont be executing
//if not super written default const will be executed
//super keyword alsways written inside child class constructor
//only 1 super possible inside a constructor
public class B extends A {
	public B() {
		super(10);
		System.out.println("Child class constructor");
	}
public static void main(String arg[]){
	B obj=new B();
}
}
