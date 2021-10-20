package OOPConcept_Part1;

public class staticAndNonStatic {
	String name = "Tom";
	static int age = 10;

	public static void main(String[] args) {
		// how to call static methods and variables
		// 1.direct calling
		sum();
		// 2.calling by class name
		staticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(staticAndNonStatic.age);
		
		// how to call non static methods and vars
		staticAndNonStatic ob = new staticAndNonStatic();
		// non static varaibales and non static methods will be assigned to
		// object refrece
		// all that is declare as static is not part of the object refrence
		ob.sendMail();
		System.out.println(ob.name);
		// can i access static methods using object reference --yes
		ob.sum();

	}

	public void sendMail() {// non static method

	}

	public static void sum() {// static meathod
		System.out.println("Sum Method'");
	}

}
