package OOPConcept_Part1;

import java.util.ArrayList;

public class arrayListConcept {

	public static void main(String[] args) {
		ArrayList  ar= new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
    ar.add(400);//3
    ar.add(500);//4
    //to print all values of ArrayList using loop
    for(int i=0;i<ar.size();i++)
    	System.out.println(ar.get(i));
    
    ar.remove(3);
    
    ArrayList<Integer> ar1= new ArrayList<>();
    ar1.add(100);
    ar1.add(22222);//add function is used to add element in array list
    ArrayList<String> ar2= new ArrayList<>();
    
    ArrayList<E> ar3=new ArrayList<E>();//geniric array
    
	}
	

}
