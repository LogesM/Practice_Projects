
package methods;
import java.util.Scanner;

public class method {
    public int add(int a,int b) {
	    int sum=a+b;
	    return sum;
}

public static void main(String[] args) {

	method b=new method();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the two numbers : ");
	int x = sc.nextInt();
	int y = sc.nextInt(); 
	
	int ans= b.add(x,y);
	System.out.println("Addition of two number is :"+ans);
	}
}

