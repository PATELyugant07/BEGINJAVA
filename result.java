import java.util.Scanner;

class subject
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String sub[] = new String[num];
    int marks[] = new int[num];
    
    void show()
    {
        for(int i=0;i<num;i++)
        {
            System.out.print("Subject " + (i+1) + " :- ");
            sub[i] = sc.next();
            System.out.print("marks " + sub[i] + " :- ");
            marks[i] = sc.nextInt();
        }
    }
}
public class result extends subject 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter student name :- ");
        String name = sc.nextLine();
        System.out.print("course :- ");
        String course = sc.nextLine();
        System.out.print("PNR no :- :- ");
        int pnr = sc.nextInt();

        subject s = new subject();
        s.show();
        int sum = 0;
        for(int i=0;i<s.num;i++)
        {
            sum += s.marks[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("--------Result-----------");
        System.out.println("Name of student :- " + name);
        System.out.println("Course :- " + course);
        System.out.println("PNR :- " + pnr);
        for(int i=0;i<s.num;i++)
        {
            System.out.print(s.sub[i] + "  :-  ");
            System.out.println(s.marks[i]);
        }

        System.out.println("result :- " + (sum/s.num));
    }
}
