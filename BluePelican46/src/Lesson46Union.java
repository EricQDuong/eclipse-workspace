import java.util.*;

public class Lesson46Union {

	public static void main(String[] args) {
		Set <String>s1 = new HashSet<String>( ); //Create s1
	    s1.add("Bill");s1.add("Larry");s1.add("Adolf");
	    s1.add("Regina");s1.add("Susie");
	    
	    Set <String>s2 = new HashSet<String>( ); //Create s2
	    s2.add("Larry");s2.add("Jack");s2.add("Alice");
	    s2.add("June");s2.add("Benny");s2.add("Susie");

	    Set s3 = new HashSet();
	    
	    s3.addAll(s2);
	    s3.addAll(s1);
	   
	    Iterator iter3 = s3.iterator();  
	    while(iter3.hasNext()){
	        System.out.print(iter3.next()+" ");
	      }

	}

}
