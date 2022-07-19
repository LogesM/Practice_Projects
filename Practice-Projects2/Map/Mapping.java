import java.util.*;
public class Mapping {

	public static void main(String[] args) {	
		//Hashmap
		HashMap<Integer,String> map = new HashMap<Integer,String>();      
	    map.put(1 , "Apple");    
	    map.put(2 , "Ball");    
	    map.put(3 , "Cat");   
	       
	    System.out.println("\nThe elements of Hashmap are ");  
	    for(Map.Entry a : map.entrySet()){    
	    System.out.println(a.getKey() + " " + a.getValue());    
	    }
	      
	     //HashTable	       
	   Hashtable<Integer,String> table = new Hashtable<Integer,String>();        
	   table.put(4 , "Elephant");  
	   table.put(5 , "Fridge");  
	   table.put(6 , "Grant");  

	   System.out.println("\nThe elements of HashTable are ");  
	   for(Map.Entry b : table.entrySet()){    
	   System.out.println(b.getKey() + " " + b.getValue());    
       }
	           
	      //TreeMap	      
	   TreeMap<Integer,String> tree = new TreeMap<Integer,String>();    
	   tree.put(7 , "Hat");    
	   tree.put(8 , "Ice");    
	   tree.put(9 , "Joker");       
	      
	   System.out.println("\nThe elements of TreeMap are ");  
	   for(Map.Entry c : tree.entrySet()){    
	    System.out.println(c.getKey() + " " + c.getValue());    
	   }         
   }  
}
