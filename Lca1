import java.util.Scanner;
class userexception extends Exception
{
	userexception(String str)
	{
		super(str);
	}
}
class member 
	{
		Scanner sc = new Scanner(System.in);
		int mid,days,month;
		String m_name;
		double payment = 5000;
		member()
		{
			System.out.print("enter member id :- ");
			mid = sc.nextInt();
			System.out.print("enter member name :- ");
			m_name = sc.next();
			System.out.print("enter month :- ");
			month = sc.nextInt();
		}
		void book()
		{
			if(month < 12)
			{
				System.out.print("enter days :- ");
				days = sc.nextInt();
				System.out.println("membership type :- ");
				System.out.println("1 -> silver");
				System.out.println("2 -> gold");
				System.out.println("3 -> platinium");

				System.out.print("enter your membership type :- ");
				int ch = sc.nextInt();
				switch (ch) {
					case 1:
						System.out.println("you have silver membership");
						payment = days * (payment * 0.98);
						System.out.println("payment :- " + payment);
						break;
					case 2:
						System.out.println("you have gold memberhsip");
						payment = days * (payment * 0.95);
						System.out.println("payment :- " + payment);
						break;
					case 3:
						System.out.println("you have platinium memberhsip");
						payment = days * (payment * 0.90);//payment = days * (payment - (payment * 0.1));
						System.out.println("payment :- " + payment);
						break;
					default:
						break;
				}
			}
			else
			{
				System.out.println("your membership expired");
			}
		}
	}
class guest 
	{
		Scanner sc = new Scanner(System.in);
		int days;
		String m_name;
		double payment = 5000;
		guest()
		{
			System.out.print("enter member name :- ");
			m_name = sc.next();
		}
		void book()
		{
				System.out.print("enter days :- ");
				days = sc.nextInt();
				payment = days * payment;
				System.out.println("payment :- " + payment);
		}
	}
class guset_member 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -> membership");
		System.out.println("2 -> non membership");
		System.out.print("enter your choice :- ");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			member m = new member();
			m.book();
		}
		else if(choice == 2)
		{
			guest g = new guest();
			g.book();
		}
		else
		{
			System.out.println("invalid choice");
		}
	}
}
