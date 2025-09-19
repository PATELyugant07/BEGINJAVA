import java.util.Scanner;
import java.lang.*;

abstract class basic_details
{
    static String ifsc = "SBIN0011020" ;
    static String branch_name = "punagam";
    int acc_no;
    String holder_name;
    float balance = 100000;
    Scanner sc = new Scanner(System.in);
    void get()
    {
        System.out.print("account number :- ");
        acc_no = sc.nextInt();
        System.out.print("enter account holder name :- ");
        holder_name = sc.next();
        System.out.println();
    }
    void show()
    {
        System.out.println("-----account summery-----");
        System.out.println();
        System.out.println("accounr number :- " + acc_no);
        System.out.println("account holder name  :- " + holder_name);
        System.out.println("branch name :-  " + branch_name);
        System.out.println("ifsc code :- " + ifsc);
        System.out.println("available balance :- " + balance);
        System.out.println();
    }
}
class saving extends basic_details
{
    Scanner sc = new Scanner(System.in);
    void bal()
    {
        //available balance
        System.out.println("--------transaction details---------");
        System.out.println();
        System.out.println("1 -> credit");
        System.out.println("2 -> debit");
        System.out.println("3 -> check balance");
        System.out.println("---------credit or debit--------");
        //choice for credit or debit
        System.out.print("enter choice :- ");
        int credit_debit = sc.nextInt();
        //amount for credit or debit
        if(credit_debit == 1)
        {
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= 100000)
            {
                balance += amount;
                System.out.println("available amount :- " + balance);
            }
            else
            {
                System.out.println("your account is saving you have per day limit maximum 100000");
                System.out.println("if you have restart your transaction then click yes");

                System.out.println("---restart---");
                System.out.println("1 -> yes");
                System.out.println("2 -> no");
                System.out.println("-----");
                System.out.print("1 for yes and 2 for no :- ");
                int yes_no = sc.nextInt();

                if(yes_no == 1)
                {
                    bal();
                }
                else
                {
                    System.out.println("thanku for connecting us");
                    System.exit(0);
                }   
            }
        }
        else if(credit_debit == 2)
        {
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                if(amount <= 25000)
                {
                    balance -= amount;
                    System.out.println("money is debited ....");
                    System.out.println("available balance :- " + balance);
                }
                else
                {
                    System.out.println("---sorry---");
                    System.out.println("your account is saving you have per day limit maximum 25000");
                    System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int yes_no = sc.nextInt();

                    if(yes_no == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                    }   
                }
            }
            else
            {
                System.out.println("sorry your balance no inficient");
                System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int ch2 = sc.nextInt();

                    if(ch2 == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                }
            }
        }
        else if(credit_debit == 3)
        {
            show();
        }
        else
        {

            System.out.println("sorry......enter right choice...");
            System.out.println("---restart your full application---");
            System.out.println("1 -> yes");
            System.out.println("2 -> no");
            System.out.println("-----");
            System.out.print("1 for yes and 2 for no :- ");
            int ch = sc.nextInt();

            if(ch == 1)
            {
                bal();
            }
            else
            {
                System.out.println("thanku for connecting us");
                System.exit(0);
            }   
        }
    }
    void details()
    {
        System.out.println();
        System.out.println();
        System.out.println("---- account details ----");
        System.out.println("accounr number :- " + acc_no);
        System.out.println("ifsc code :- " + ifsc);
        System.out.println("available balance :- " + balance);

    }
}
class current extends basic_details
{
    Scanner sc = new Scanner(System.in);
    void bal()
    {
        //available balance
        System.out.println("--------transaction details---------");
        System.out.println();
        System.out.println("1 -> credit");
        System.out.println("2 -> debit");
        System.out.println("3 -> check balance");
        System.out.println("---------credit or debit--------");
        //choice for credit or debit
        System.out.print("enter choice :- ");
        int credit_debit = sc.nextInt();
        //amount for credit or debit
        if(credit_debit == 1)
        {
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= 500000)
            {
                System.out.println("-------------------------------");
                System.out.println("amount is credited successfully.");
                balance += amount;
                System.out.println("available amount :- " + balance);
            }
            else
            {
                System.out.println("your account is saving you have per day limit maximum 500000");
                System.out.println("if you have restart your transaction then click yes");

                System.out.println("---restart---");
                System.out.println("1 -> yes");
                System.out.println("2 -> no");
                System.out.println("-----");
                System.out.print("1 for yes and 2 for no :- ");
                int yes_no = sc.nextInt();

                if(yes_no == 1)
                {
                    bal();
                }
                else
                {
                    System.out.println("thanku for connecting us");
                    System.exit(0);
                }   
            }
        }
        else if(credit_debit == 2)
        {
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                if(amount <= 100000)
                {
                    balance -= amount;
                    System.out.println("money is debited successfuly....");
                    System.out.println("available balance :- " + balance);
                }
                else
                {
                    System.out.println("---sorry---");
                    System.out.println("your account is saving you have per day limit maximum 100000");
                    System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int yes_no = sc.nextInt();

                    if(yes_no == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                    }   
                }
            }
            else
            {
                System.out.println("sorry your balance no inficient");
                System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int ch2 = sc.nextInt();

                    if(ch2 == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                    }
            }
        }
        else if(credit_debit == 3)
        {
            show();
        }
        else
        {

            System.out.println("sorry......enter right choice...");
            System.out.println("---restart your full application---");
            System.out.println("1 -> yes");
            System.out.println("2 -> no");
            System.out.println("-----");
            System.out.print("1 for yes and 2 for no :- ");
            int ch = sc.nextInt();

            if(ch == 1)
            {
                bal();
            }
            else
            {
                System.out.println("thanku for connecting us");
                System.exit(0);
            }   
        }
    }
    void details()
    {
        System.out.println();
        System.out.println();
        System.out.println("---- account details ----");
        System.out.println("accounr number :- " + acc_no);
        System.out.println("ifsc code :- " + ifsc);
        System.out.println("available balance :- " + balance);

    }
}
class pf_account extends basic_details
{
    Scanner sc = new Scanner(System.in);
    void bal()
    {
        //available balance
        System.out.println("--------transaction details---------");
        System.out.println();
        System.out.println("1 -> credit");
        System.out.println("2 -> debit");
        System.out.println("3 -> check balance");
        System.out.println("---------credit or debit--------");
        //choice for credit or debit
        System.out.print("enter choice :- ");
        int credit_debit = sc.nextInt();
        //amount for credit or debit
        if(credit_debit == 1)
        {
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= 500000)
            {
                System.out.println("-------------------------------");
                System.out.println("amount is credited successfully.");
                balance += amount;
                System.out.println("available amount :- " + balance);
            }
            else
            {
                System.out.println("your account is saving you have per day limit maximum 500000");
                System.out.println("if you have restart your transaction then click yes");

                System.out.println("---restart---");
                System.out.println("1 -> yes");
                System.out.println("2 -> no");
                System.out.println("-----");
                System.out.print("1 for yes and 2 for no :- ");
                int yes_no = sc.nextInt();

                if(yes_no == 1)
                {
                    bal();
                }
                else
                {
                    System.out.println("thanku for connecting us");
                    System.exit(0);
                }   
            }
        }
        else if(credit_debit == 2)
        {
            System.out.print("enter duration of time :- ");
            int year = sc.nextInt();
            balance = balance + (balance * (year / 100));
            System.out.println("balance = " + balance);
            System.out.print("enter amount :- ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                if(amount <= 100000)
                {
                    balance -= amount;
                    System.out.println("money is debited successfuly....");
                    System.out.println("available balance :- " + balance);
                }
                else
                {
                    System.out.println("---sorry---");
                    System.out.println("your account is saving you have per day limit maximum 100000");
                    System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int yes_no = sc.nextInt();

                    if(yes_no == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                    }   
                }
            }
            else
            {
                System.out.println("sorry your balance no inficient");
                System.out.println("if you have restart your transaction then click yes");

                    System.out.println("---restart---");
                    System.out.println("1 -> yes");
                    System.out.println("2 -> no");
                    System.out.println("-----");
                    System.out.print("1 for yes and 2 for no :- ");
                    int ch2 = sc.nextInt();

                    if(ch2 == 1)
                    {
                        bal();
                    }
                    else
                    {
                        System.out.println("thanku for connecting us");
                        System.exit(0);
                    }
            }
        }
        else if(credit_debit == 3)
        {
            show();
        }
        else
        {

            System.out.println("sorry......enter right choice...");
            System.out.println("---restart your full application---");
            System.out.println("1 -> yes");
            System.out.println("2 -> no");
            System.out.println("-----");
            System.out.print("1 for yes and 2 for no :- ");
            int ch = sc.nextInt();

            if(ch == 1)
            {
                bal();
            }
            else
            {
                System.out.println("thanku for connecting us");
                System.exit(0);
            }   
        }
    }
    void details()
    {
        System.out.println();
        System.out.println();
        System.out.println("---- account details ----");
        System.out.println("accounr number :- " + acc_no);
        System.out.println("ifsc code :- " + ifsc);
        System.out.println("available balance :- " + balance);

    }
}
public class program1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----account type-----");
        System.out.println();
        System.out.println("1 -> saving");
        System.out.println("2 -> current");
        System.out.println("3 -> PF account");
        System.out.println();
        System.out.print("enter account :- ");
        int acc_type = sc.nextInt();

        if(acc_type == 1)
        {
            saving s = new saving();
            s.get();
            s.show();
            s.bal();
            s.details();
        }
        else if(acc_type == 2)
        {
            current s = new current();
            s.get();
            s.show();
            s.bal();
            s.details();
        }
        else if(acc_type == 3)
        {
            pf_account s = new pf_account();
            s.get();
            s.show();
            s.bal();
            s.details();
        }
        else
        {
            System.out.println("----sorry----");
            System.out.println("you have entered wrong choice.......");
        }
        
    }    
}