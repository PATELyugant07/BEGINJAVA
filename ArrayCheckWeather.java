public class ArrayCheckWeather{
	public static void main(String[] args){
		float [] marks= {45.5f, 55.5f, 65.5f, 75.5f, 85.5f};
		float num = 25.5f;
		boolean isInArray = false;
		for (float element: marks)
		{
			if(num==element){
				isInArray = true;
				break;
			}
		}
		if(isInArray){
			System.out.println("The Value is present in the array");
		}
		else{
			System.out.println("The Value is not present the array");
		}
		
	}
}