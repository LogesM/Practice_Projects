class travel {
	   
	 void find() {
		 
		   places inner = new places();
		   
		   inner.display();
		   
		   }
	 
	 private class places {
		 
	      public void display() {
	    	  
	       System.out.println("\n        (location finded) \n**** Inner class is created ****");
	         
      }
   }
}
	   
public class Nested {

	 public static void main(String args[]) {
		 
	      travel obj = new travel();
	      
	      obj.find();
    }
}