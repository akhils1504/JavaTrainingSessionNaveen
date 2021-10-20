package OOPConcept_Part1;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading obj=new methodOverloading();
		obj.sum();
		obj.sum(22);
		obj.sum(10, 20);
	}
	
	//Method overloading --same function name 
	//When the method name is same with diffret input parametres within same class
	//you cant create a method inside another method
	//duplicate method with same method name and arguments is not allowed
	//we can overload main method also
	public void main(){
		
	}
	public void main(int i){
		
	}
	
public void sum(){
	System.out.println("Blankkkkk");
}
public void sum(int i){
	System.out.println(i);
}
public void sum(int i,int h){
	System.out.println(i+h);
}
}
