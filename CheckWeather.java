import java.util.Scanner;

public class CheckWeather {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String web = sc.next();
			if(web.endsWith(".org")){
				System.out.println("This is organizational website");
			}
			else if(web.endsWith(".com")){
				System.out.println("This is commercial website");
			}
			else if(web.endsWith(".in")){
				System.out.println("This is indian website");
			}
    }

}