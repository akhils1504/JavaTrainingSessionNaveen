package finallyConcepts;

public class FinallyConcept {

	public static void main(String[] args) {
	}
  public void test1(){
	  try{
		  System.out.println("inside test1 method");
		  throw new RuntimeException("test");
		  
	  }catch(Exception e){
		  System.out.println("inside catch block");
	  }
	  //finally is a block
	  finally{//Usually used with try catch block.It will execute just after try catch and then to next control
		  System.out.println("inside finally block");
	  }
	  
  }
}
