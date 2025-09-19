import java.util.Scanner;
class cal
{
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    void sum()
    {
        System.out.println("sum of A + B :- " + (a+b));
    }
    void sub()
    {
        System.out.println("sum of A - B :- " + (a-b));
    }
    void div()
    {
        System.out.println("sum of A / B :- " + (a/b));
    }
    void mul()
    {
        System.out.println("sum of A * B :- " + (a*b));
    }
}
public class sanple_calc extends cal
{
    public static void main(String[] args)
    {
        System.out.print("---choice---");
        System.out.print("---1.sum---");
        System.out.print("---2.subtract---");
        System.out.print("---3.multiplication---");
        System.out.print("---4.division---");
        
         Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.print("enter choice :- ");
        int ch = sc.nextInt();

        cal l = new cal();
        if(ch == 1)
        {
            l.sum();
        }
        else if(ch == 2)
        {
            l.sub();
        }
        else if(ch == 3)
        {
            l.mul();
        }
        else if(ch == 4)
        {
            l.div();
        }
        else 
        {
            System.out.println("enter valid number .....");
        }
    }
    
}
