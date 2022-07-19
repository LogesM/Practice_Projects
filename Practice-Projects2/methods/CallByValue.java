package methods;

public class CallByValue {

  
	int data=300;  
		  
    void change(CallByValue inc){  
			 
	   data=data+1000;
		 
	}  
		     
	public static void main(String args[]){ 
			 
		 CallByValue inc=new CallByValue();  
		  
	     System.out.println("Before change in value : "+inc.data);  
	     inc.change(inc);  
	     System.out.println("After change in value : "+inc.data);  
		  
	 }  
}  
