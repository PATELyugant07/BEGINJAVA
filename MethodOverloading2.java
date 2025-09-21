public class MethodOverloading2{
	static void foo(){
		System.out.println("Good Morning Bro!");
	}
	static void foo(int a){
		System.out.println("Good Morning " + a + " Bro!");
	}
	public static void main(String[] args){
		foo(); 
		foo(3000); 
	}
}