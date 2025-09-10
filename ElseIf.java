import java.util.Scanner;
public class ElseIf{
	public static void main(String[] args){
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age>56){
			System.out.println("you Are Experienced!!");
		}
		else if(age>46){
			System.out.println("you Are Semi-Experienced!!");
		}
		else if(age>36){
			System.out.println("you Are Semi-Semi-Experienced!!");
		}
		else{
			System.out.println("you Are Not-Experienced!!");
		}
	}
}