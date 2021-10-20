package finallyConcepts;

public class Finalize {

	public static void main(String[] args) {
		Finalize ob1=new Finalize();
		Finalize ob2 =new Finalize();
		ob1=null;
		ob2=null;
		System.gc();
	}
	//finalize is method
public void finalize(){
	System.out.println("finalize method");
	
}
}
//Finalize is used just before garabgae collector to clean up process of the unused objects