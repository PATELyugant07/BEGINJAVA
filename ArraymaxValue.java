public class ArraymaxValue{
	public static void main(String[] args){
		int [] arr ={1,21,3,455,5,34,67};
		int max = 0;
		for(int e: arr){
			if(e>max){
				max = e;
			}
	}
	System.out.println("the value of the maximun element in this array is :"+ max);
}
}