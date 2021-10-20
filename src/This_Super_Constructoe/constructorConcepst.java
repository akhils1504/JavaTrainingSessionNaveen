package This_Super_Constructoe;

public class constructorConcepst {
	// class entity which is used to define some class features while creating
	// the object.While creating obecjt in the form of global varaibale
	// cant return any value
	// looks like a function but not a function
	// name should be same as class name
	// default and parameterized constructor
	// constructor can be overloaded by different parameters
	// Constructor will be called immeadtyle when u create a object
	//
	public constructorConcepst() {
		System.out.println("Default constructor");
	}
	public constructorConcepst(int a) {
		System.out.println("Single para constructor");
	}
	public constructorConcepst(int a,int b) {
		System.out.println("Two para constructor");
	}

	public static void main(String[] args) {
		constructorConcepst obj = new constructorConcepst();
		constructorConcepst obj1 = new constructorConcepst(10);
		constructorConcepst obj2 = new constructorConcepst(10,20);

	}

}
