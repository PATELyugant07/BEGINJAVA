import java.util.Scanner;
public class Killotomiles {
	public static void main(String[] args){
		double kilomiters;
		System.out.println("Please enter kilomiters");
		Scanner sc = new Scanner(System.in);
		kilomiters = sc.nextDouble();
		double miles = kilomiters / 1.6;
		System.out.println(miles + " Miles");
	}
}