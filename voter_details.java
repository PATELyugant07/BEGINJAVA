import java.util.*;
class voter
{
    Scanner sc = new Scanner(System.in);
    int voter_id,voter_contactno,voter_aadhar;
    String votername,voter_address;
    voter()
    {
        System.out.print("enter voter id :- ");
        voter_id = sc.nextInt();
        System.out.print("enter voter name :- ");
        votername = sc.next();
        System.out.print("enter voter contact no :- ");
        voter_contactno = sc.nextInt();
        System.out.print("enter voter address :- ");
        voter_address = sc.next();
        System.out.print("enter voter aadhar :- ");
        voter_aadhar = sc.nextInt();
        System.out.println();
    }
    void print()
    {
        System.out.println("--- emp details ---");
        System.out.println("voter id :- " + voter_id);
        System.out.println("voter name :- " + votername);
        System.out.println("voter contect no :- " + voter_contactno);
        System.out.println("voter address :- " + voter_address);
        System.out.println("voter aadhar :- " + voter_aadhar);
    }
}
public class voter_details 
{
    public static void main(String[] args)
    {
        voter v[] = new voter[10];
        for(int i=0;i<10;i++)
        {
            v[i] = new voter();
            v[i].print();
        }
    }    
}
