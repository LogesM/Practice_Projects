package constructor;
class operation{
	int a,b,sum;
	
	operation(){
	a=10;
	b=20;
	}
	operation(int x,int y){
		a=x;
		b=y;
	}
	void add() {
		sum = a+b;
	}
	void display() {
		System.out.println("Sum is "+sum);
	}
}
public class Parameterised_constructor {
	public static void main(String args[]) {
		operation op = new operation(11,12);
		op.add();
		op.display();
	}

}
