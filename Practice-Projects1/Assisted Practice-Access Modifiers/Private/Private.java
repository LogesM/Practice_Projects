
class object 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Private {

	public static void main(String[] args) {
	
		System.out.println("Private Access Specifier");
		object  obj = new object(); 
       
        //obj.display();

	}
}