import java.util.Scanner;
public class praPassorFail{
	public static void main(String[] args){
		byte m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your mark in DCN");
		m1 = sc.nextByte();
		System.out.println("enter your mark in PYTHON");
		m2 = sc.nextByte();
		System.out.println("enter your mark in JAVA");
		m3 = sc.nextByte();
		float avg = (m1+m2+m3)/3.0f;
		if (avg>40 && m1>=33 && m2>=33 && m3>=33)
		{
			System.out.println("Congratulation, You are promoted");
		}
		else {
			System.out.println("Sorry, You are not promoted");
		}
	}
} 