//pg.330

import java.util.*;
import java.io.*;

public class Lesson47Histogram {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sf = new Scanner(new File("Data2.txt"));
	       int maxIndx = -1;
	       String text[] = new String[1000]; // To be safe, declare more than we need
	       while (sf.hasNext()) {
	           maxIndx++;
	           text[maxIndx] = sf.nextLine();
	           
	       }
	       sf.close();
	       //System.out.print(text[0]);
	       String words[] = text[0].split(", ");
	       System.out.println(words[1]);
	       
	       
	       Map<String, Integer> myMap = new TreeMap<String, Integer>();
	     for(int r=0; r<words.length;r++){
	       
	       }

	
	
	
	}

}
