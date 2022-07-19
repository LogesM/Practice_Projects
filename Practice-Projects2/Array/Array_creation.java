import java.util.Scanner;
public class Array_creation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("Single dimentional array..."); 	
		System.out.print("Enter the number of elements : ");  
		int n= sc .nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		} 
	}
}
