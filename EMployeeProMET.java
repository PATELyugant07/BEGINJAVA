// File: EMployeeProMET.java

class Employee
{
	int salary;
	String name;
    
    // I fixed a small typo here: getSalry -> getSalary
	public int getSalary(){ 
		return salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
}

public class EMployeeProMET
{ 
	public static void main(String[] args){
		Employee YUG = new Employee();
		YUG.setName("codeWithYUG");
		System.out.println(YUG.getName());
		
	}
}