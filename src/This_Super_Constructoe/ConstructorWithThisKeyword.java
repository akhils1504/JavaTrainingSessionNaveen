package This_Super_Constructoe;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	public ConstructorWithThisKeyword(String name,int age){
		this.name=name;//this.globalm varibale=local variable
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
	ConstructorWithThisKeyword ob =new ConstructorWithThisKeyword("Tom", 30);

	}

}
