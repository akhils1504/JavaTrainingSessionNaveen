package OOPConcept_Part1;

import java.util.Hashtable;

public class hashTableConcept {

	public static void main(String[] args) {
Hashtable<Object,Object> h=new Hashtable<>();//Object object is not mandate,it is a default by object
h.put("A", "Test");
h.put("B","Hello");
h.put("C", "World");
System.out.println(h.size());


h.put(1, 100);
h.put(2, 200);
System.out.println(h.size());
System.out.println(h.get(2));
System.out.println(h.get("C"));
h.put(3, "Tom");

Hashtable<Integer, Integer> h1=new Hashtable<Integer,Integer>();
h1.put("tom", 1);
h1.put(2, 3);
Hashtable<Integer, String> h2=new Hashtable<Integer,String>();
h2.put(1, "tom");

	}

}
