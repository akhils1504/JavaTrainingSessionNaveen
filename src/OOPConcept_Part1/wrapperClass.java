package OOPConcept_Part1;

public class wrapperClass {

	public static void main(String[] args) {
String x="100";
System.out.println(x+20);

//data converion : String to int
int i=Integer.parseInt(x);
System.out.println(i+20);


//String to double
String y="12.333";
double d= Double.parseDouble(y);
System.out.println(d+10);

//String to boolean
String k="true";
boolean b=Boolean.parseBoolean(k);
System.out.println(k);


//int to string conversio
int j=200;
System.out.println(j);
String s=String.valueOf(j);
System.out.println(s+20);
	}

}
