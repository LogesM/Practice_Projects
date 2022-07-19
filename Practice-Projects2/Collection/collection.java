import java.util.*;

public class collection {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();   
	    name.add("Logeswaran M");//
	    name.add("Arul K");
	    name.add("Ram S");
	       
	    Vector<Integer> vec = new Vector();
	    vec.addElement(1); 
	    vec.addElement(2); 
	    vec.addElement(3);
	
	    LinkedList<String> food = new LinkedList<String>();  
	    food.add("Coffee");  
	    food.add("Cake"); 
	    food.add("Juice");
	      
	    Iterator<String> item = food.iterator();  
	    while(item.hasNext()){  
	       	       
	    HashSet<Integer> hash = new HashSet<Integer>();  
	    hash.add(10);  
	    hash.add(20);  
	    hash.add(30);
	    hash.add(40);       
	             
	    LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();  
	    link.add(11);  
	    link.add(13);  
	    link.add(12);
	    link.add(14);	
	          
	    System.out.println("ArrayList");
	         System.out.println(name); 
	         
        System.out.println("\n Vector");
	         System.out.println(vec);
	         
	    System.out.println("\n LinkedList");
	         System.out.println(item.next());
	         
        System.out.println("\n HashSet");
	         System.out.println(hash);
	         
        System.out.println("\n LinkedHashSet");
	         System.out.println(link);
	         
        System.out.println("\n This are the collections....");
	   } 
   }  
}