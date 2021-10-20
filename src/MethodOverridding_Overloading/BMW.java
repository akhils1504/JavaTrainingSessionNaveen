package MethodOverridding_Overloading;

public class BMW extends Car {//has a relationship means class to class relationship
	
	//When same method is present in parent class as well as in child class with same name and same set of arguments 
	//it is called method overriding

	public  void start() {//overridden method
		System.out.println("BMW----start");
	}

	public void theftsafety() {
		System.out.println("BMW----Theft Safety");
	}
}
