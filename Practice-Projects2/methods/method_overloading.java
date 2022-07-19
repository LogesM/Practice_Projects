package methods;
import java.util.Scanner;

class over{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class method_overloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers (X,Y,Z) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(over.add(x,y));
		System.out.println(over.add(x,y,z));

	}

}
