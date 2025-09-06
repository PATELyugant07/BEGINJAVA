import java.util.Scanner;
public class Percentage {
	public static void main (String[] args){
			System.out.println("Enter your Subject mark");
			Scanner sc = new Scanner(System.in);
			System.out.println("sub 1:");
			int a = sc.nextInt();
			System.out.println("sub 2:");
			int b = sc.nextInt();
			System.out.println("sub 3:");
			int c = sc.nextInt();
			System.out.println("sub 4:");
			int d = sc.nextInt();
			System.out.println("sub 5:");
			int e = sc.nextInt();
			int sum = a + b + c + d + e;
			System.out.println("Sum off total subject");
			System.out.println(sum);
			  int Average = sum*100/500;

        System.out.println("Total %");
        System.out.println(Average);
	}
}