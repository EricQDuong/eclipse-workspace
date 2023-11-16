import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Number1 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("Number1Data.txt"));
	        int howManyBees = scan.nextInt();
	        for(int i=0; i<howManyBees; i++) {
	        	int[] follicles = new int[scan.nextInt()];
	        	int j=0;
	        	while(scan.hasNextInt()){
	        		follicles[j] = scan.nextInt();
	        		j++;
	        	}
	        
	        }
	       
	   
	       
	       
	}
}
