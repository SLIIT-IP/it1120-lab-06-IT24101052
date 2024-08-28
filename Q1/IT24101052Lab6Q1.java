import java.util.Scanner;
public class IT24101052Lab6Q1
{
	public static void main(String[] args)
	{
		double number,square,squareroot;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		square= Math.pow(number, 2);
		squareroot = Math.sqrt(number);
		System.out.println("The square of "+number+" is: "+ square);
		System.out.println("The square root of "+number+" is: "+ squareroot);
	}
}
