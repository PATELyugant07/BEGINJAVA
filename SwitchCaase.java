import java.util.Scanner;
public class SwitchCaase{
	public static void main(String[] args){
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		switch(age){
			case 18:
				System.out.println("You Are Became adult!!");
				break;
			case 23:
				System.out.println("You Are Going To Get Job!!");
				break;
			case 60:
				System.out.println("You Are Retired!!");
				break;
			default:
				System.out.println("Enjoy Your Life!!");
				
		}
	}
}