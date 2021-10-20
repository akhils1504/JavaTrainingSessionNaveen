package OOPConcept_Part1;

public class localVsGlobalVaraibles {
	//--Global varibales..or class variable..immediately after class 
	String name="Tom";
	int age=12;
	
	public static void main(String[] args) {

 int i=10;//local variable
 System.out.println(i);
 localVsGlobalVaraibles var=new localVsGlobalVaraibles();
 System.out.println(var.age);
 System.out.println(var.name);
}
	public void sum(){
		int j=20;
	}
}