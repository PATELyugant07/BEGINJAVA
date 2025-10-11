import java.util.Scanner;
interface  sal 
{
   abstract void calcsal();    
}
class temporary implements sal
{
    int emp_id,p_hour,t_hour;
    String name;
    float p_salary,t_salary;
    Scanner sc = new Scanner(System.in);
    temporary()
    {
        System.out.print("enter emp id :- ");
        emp_id = sc.nextInt();
        System.out.print("enter emp name :- ");
        name = sc.next();
        System.out.print("enter regular hour :- ");
        p_hour = sc.nextInt();
        System.out.print("enter overtime hour :- ");
        t_hour = sc.nextInt();
    }
    public void calcsal()
    {
        System.out.println("emp id :- " + emp_id);
        System.out.println("emp name :- " + name);
        p_salary = p_hour * 100;
        t_salary = t_hour * 150;
        System.out.println("your regular salary :- " + p_salary);
        System.out.println("your overtime salary :- " + t_salary);
        float total = p_salary + t_salary;
        System.out.println("Total salary :- " + total);
    }
}
class permanent implements sal
{
    int emp_id,day;
    String name;
    float p_salary;
    Scanner sc = new Scanner(System.in);
    permanent()
    {
        System.out.print("enter emp id :- ");
        emp_id = sc.nextInt();
        System.out.print("enter emp name :- ");
        name = sc.next();
        System.out.print("enter working day :- ");
        day = sc.nextInt();
    }
    public void calcsal()
    {
        System.out.println("emp id :- " + emp_id);
        System.out.println("emp name :- " + name);
        p_salary = day * 180 * 11;
        System.out.println("your salary :- " + p_salary);
    }
}
public class employee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("you have permenent employee / temporary employee :- ");
        int no = sc.nextInt();
        if(no == 2)
        {
            temporary t = new temporary();
            t.calcsal();
        }
        else if(no == 1)
        {
            permanent t = new permanent();
            t.calcsal();
        }
        else
        {
            System.out.println("error");
        }
    }    
}
