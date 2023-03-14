package vectors;

import java.util.Vector;

import banana.BananaCenter;

public class Example {

	public static void main(String[] args) {
		Vector v = new Vector(); 
		
		BananaCenter.print();
		
        v.add(0, 1); 
        v.add(1, 2); 
        v.add(2, "geeks"); 
        v.add(3, "forGeeks"); 
        v.add(4, 3); 
  
       v.remove("geeks");
  
        // checking vector 
        System.out.println("Clone of v: " + (Vector)v.clone());
	}
}
