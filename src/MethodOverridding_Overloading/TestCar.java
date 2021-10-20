package MethodOverridding_Overloading;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism ---compile time polymorphism
BMW b=new BMW();
b.start();//take data from BMW not from Car--method overriding
b.stop();
b.reful();
b.theftsafety();
b.engine();

System.out.println("*****************");
Car c= new Car();
c.start();
c.stop();
c.reful();
c.theftsafety///not acessible since parent cant access child call methods
//child class can inhert the properties of paret but not possible vise versa

System.out.println("*****************");

//This type of calling is call up casting or top casting 
Car c1=new BMW();//child class object can be reffered by parent class reference --dynamic polymorphism--Run time polymorphism
c1.start();//overridden method will be calling from BMW as it is the immediate child class method
c1.stop();
c1.reful();
c1.theft//only overridden methods and parent class methods will be called

//Down casting--Means degrading parent class into child class object then ref by child class variable
BMW b1=new Car();//This is not possible
//Parent class cant fit into child class
BMW b1=(BMW)new Car();//Will throw ClassCast Exception
	}

}
