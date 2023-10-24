import java.util.*;

public class Lesson46Intersection {

	public static void main(String[] args) {

		Set s1 = new HashSet( ); //Create s1
	    s1.add("Bill");s1.add("Larry");s1.add("Adolf");
	    s1.add("Regina");s1.add("Susie");
	    
	    Set s2 = new HashSet( ); //Create s2
	    s2.add("Larry");s2.add("Jack");s2.add("Alice");
	    s2.add("June");s2.add("Benny");s2.add("Susie");

	    /*s1.retainAll(s2);
	    while(iter2.hasNext()){
	        System.out.println(iter2.next());
	      }*/
	    
	    //Build the intersection set, s3
	    Set s3 = new HashSet();
	    Iterator iter1 = s1.iterator();
	    
	    while(iter1.hasNext()){
	      Object donut = iter1.next();
	      if(s2.contains(donut)){
	        s3.add(donut);
	      }
	      //Use iter1 to cycle through all objects in s1.
	      //Use s2.contains(obj) to see if a particular object from s1 is in s2
	      //If it is, then add this object to s3
	    }
	      //Print the intersection set
	      //Create iter3, an Iterator for s3
	    Iterator iter2 = s3.iterator();
	    
	      while(iter2.hasNext()){
	        System.out.println(iter2.next());
	        //Use iter3 to cycle through all objects in s3 and then print them.
	      }
	}

}
