public class VargumenT{
	static int sum(int ...arr){
		int result = 0;
		for(int a: arr){
			result +=a;
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println("the sum off 4 + 5 is: " + sum(4, 5));
		System.out.println("the sum off 4 + 5 + 7 is: " + sum(4, 5, 7));
	}
}