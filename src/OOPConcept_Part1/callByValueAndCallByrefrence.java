package OOPConcept_Part1;

public class callByValueAndCallByrefrence {
int a=10;
int b=20;

	public static void main(String[] args) {
		callByValueAndCallByrefrence obj=new callByValueAndCallByrefrence();
		int x=10;
		int y=20;
		obj.sum(x, y);//call by value or pass  by value
		
		obj.a=100;//object ref is used because its a non static variable
		obj.b=200;
		
		obj.swap(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

	public int sum(int a,int b){
		a=30;
		b=20;
		return a+b;
	}
	//cal  by ref is possible in java using the object references
	public void swap(callByValueAndCallByrefrence t){
		int temp;
		temp=t.a;//temp=100
		t.a=t.b;//t.a=200
		t.b=temp;//t.b=100
	}
}
