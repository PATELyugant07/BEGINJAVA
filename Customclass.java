class Employee{
	int id;
	String name;
}

public class Customclass{
	public static void main(String[] args){
		System.out.println("this is my custom class");
		Employee yug = new Employee();
		yug.id = 12;
		yug.name = "Yugant";
		System.out.println(yug.id);
		System.out.println(yug.name);
	}
}