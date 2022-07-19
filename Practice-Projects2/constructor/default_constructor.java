package constructor;
class car{
car()
{
	System.out.println("Constructor is created");
}
void displayinfo() {
	System.out.println("car details.");
}
}
public class default_constructor {
	public static void main(String args[])
	{
		car innova = new car();
		innova.displayinfo();
	}

}
