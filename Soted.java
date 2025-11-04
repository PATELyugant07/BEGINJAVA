public class Soted{
    public static void main(String[] args){
		
		
		
		int arr[]= {1,2,7,4,5};
		boolean isShortd= false;
		
		
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] < arr[i+1]){
				isShortd= true;
			}
			else{
				isShortd= false;
				break;
			}
			
			
    }
	if(isShortd==true){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
	}	
}