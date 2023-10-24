import java.util.*;
import java.io.*;

public class Lesson49CodeTalker {

	public static void main(String[] args) throws IOException{
		//Input Data File
		Scanner sf = new Scanner(new File("Data.txt"));
	       int maxIndx = -1;
	       String text[] = new String[1000]; // To be safe, declare more than we need
	       while (sf.hasNext()) {
	           maxIndx++;
	           text[maxIndx] = sf.nextLine();
	           
	       }
	       
	       sf.close();
	    //End Data File
	    
	       //Build Map
	       Map<String, String> dict = new HashMap<String, String>();
	       int numPairs = Integer.parseInt(text[0]);
	       for(int j=1; j <= numPairs; j++) {
	    	   Scanner sc = new Scanner(text[j]);
	    	   sc.useDelimiter("=");
	    	   dict.put(sc.next(), sc.next());
	       }
	       //End build map
	       // meter always spank ketchup staple meter yellow beaver
	       String sentc = text[maxIndx];
	       String word[] = sentc.split(" ");
	       for(int i=0; i< word.length; i++) {
	    	   if(dict.containsKey(word[i])) {
	    		   System.out.print(dict.get(word[i]) + " ");
	    	   } else {
	    		   System.out.print(word[i] + " ");
	    	   }
	       }
	       System.out.println("");
	       
	       /*String sentence = new String();
	       Map pairs = new HashMap();
	       
	       for(int i=0; i<text.length; i++){
	    	   pairs.put(text[i].substring(0, )
	       }
	       
	       for(int i=0; i<15; i++) {
	    	   System.out.println(text[i]);
	    	   sentence = text[i];
	       }*/
	       
	       
	       
	}

}
