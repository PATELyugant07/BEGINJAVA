import java.util.*;
class employee_work extends Exception
{
    public employee_work(String s)
    {
        super(s);
    }
}
abstract class person
{
    Scanner sc = new Scanner(System.in);
    abstract void display();
    abstract void accept() throws employee_work;
}
class employee extends person
{
    int eno,salary;
    String ename;
    String address;
    public void accept() throws employee_work
    {
        System.out.print("enter emp no :- ");
        eno = sc.nextInt();
        System.out.print("enter emp name :- ");
        ename = sc.next();
        System.out.println("enter address :- ");
        address = sc.next();
        System.out.println("enter your salary :- ");
        salary = sc.nextInt();
        if(salary < 50000)
        {
            throw new employee_work("your salary too low");
        }
    }
    void display()
    {
        System.out.println("emp no :- " + eno);
        System.out.println("emp name :- " + ename);
        System.out.println("address :- " + address);    
    }
}
class worker extends person
{
    int wno,salary;
    String wname;
    String address;
    public void accept() throws employee_work
    {
        System.out.print("enter worker no :- ");
        wno = sc.nextInt();
        System.out.print("enter worker name :- ");
        wname = sc.next();
        System.out.println("enter address :- ");
        address = sc.next();
        System.out.println("enter your salary :- ");
        salary = sc.nextInt();
        if(salary < 30000)
        {
            throw new employee_work("your salary too low");
        }
    }
    void display()
    {
        System.out.println("emp no :- " + wno);
        System.out.println("emp name :- " + wname);
        System.out.println("address :- " + address);    
    }
} 
public class emp_work 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you are employee / worker :- ");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            employee o = new employee();
            try
            {
                o.accept();
            }
            catch(employee_work e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            o.display();
        }
        else if(ch == 2)
        {
            worker o = new worker();
            try
            {
                o.accept();
            }
            catch(employee_work e)
            {
                System.out.println(e.getMessage());
            }
            o.display();
        }
        else
        {
            System.out.println("you have enterded wrong choice....");
        }
    }
}
