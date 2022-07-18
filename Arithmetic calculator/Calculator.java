import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" + Addition \n - Subtraction \n * Multiplication \n / Division \n");
		System.out.println("Enter the arithmetic operator : ");
		
		char op = sc.next().charAt(0);
		switch(op) {
		case'+':
			System.out.println("Enter the two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Addition of Two number is "+(a+b));
			break;
			
		case'-':
			System.out.println("Enter the two numbers : ");
			int c = sc.nextInt();
			int d = sc.nextInt();
			System.out.println("Subtraction of Two number is "+(c-d));
			break;
		
		case'*':
			System.out.println("Enter the two numbers : ");
			int e = sc.nextInt();
			int f = sc.nextInt();
			System.out.println("Multiplication of Two number is "+(e*f));
			break;
			
		case'/':
			System.out.println("Enter the numbers A and B : ");
			int g = sc.nextInt();
			int h = sc.nextInt();
			System.out.println("Division of Two number is "+(g/h));
			break;
			
		default:
			System.out.println("You entered wrong number..... \n Please enter correct number.....");
			break;
			
			
		}
		
	}

}
