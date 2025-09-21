public class MethodOverloading{
	static void change1(int [] arr){
		arr[0]=98;
	}
	static void tellJoke(){
		System.out. println("I invented new joke!\n" + 
		"Plagiarism");
	}
	public static void main(String[] args){
		//tellJoke();
		int [] marks = {52, 71, 72, 87, 98};
		change1(marks);
		System.out.println("the value of x after running change is:" + marks[0]);
	}
}