package OOPConcept_Part1;

public class FunctionInJava {
   //main is starting poit of execution
	public static void main(String[] args) {
		FunctionInJava obj = new FunctionInJava();
        //after creating the object copy of all non static methods will be given to this object
		//obejt can only hold non static methods 
		//if u want to non static method of any class use object reference
		//main method is void,never return a value
		obj.test();
		}

	public void test() {
		System.out.println("haiiiiiii");

	}
	  public String secondFunction(){
		  System.out.println("2nd function");
		  String c="Hellloooooo";
		  return c;

}}
