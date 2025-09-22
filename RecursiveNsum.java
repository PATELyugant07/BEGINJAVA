public class RecursiveNsum{
		static int sumRect(int n){
		if(n==1){
			return 1;
		}
		return n + sumRect(n-1);
	}
	public static void main(String[] args){
		int c= sumRect(6);
		System.out.println(c);
	}
}