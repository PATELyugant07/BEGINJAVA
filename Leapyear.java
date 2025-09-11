import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        System.out.println("Enter the year to be checked");
        Scanner s=new Scanner(System.in);
        int yr= s.nextInt();

        if((yr%4==0 && yr%100!=0)|| yr%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

}