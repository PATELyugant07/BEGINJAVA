public class largestnum{
	public static void main(String[] args){
		int arr[]={2,4,5,1,0};
		
		int max=arr[0];
		for(int i=1;i<4;i++){
			if (arr[i] < max)
			{
				max = arr[i];
			}
		
		} System.out.println(max);
	}
}