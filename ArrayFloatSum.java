public class ArrayFloatSum{
	public static void main(String[] args){
		float [] marks= {45.5f, 55.5f, 65.5f, 75.5f, 85.5f};
		float sum = 0; 
		for (float element: marks)
		{
			sum = sum + element;
		}
		System.out.println("The Value of sum is" +sum);
	}
}