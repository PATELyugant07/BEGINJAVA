public class RemDup{
    public static void main(String[] args){
        int arr[]= {1,1,2,2,2,3,};
         
         int ans [] = new int[arr.length];

            ans[0]=arr[0];
    
            int j=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i] != ans[j]){
                    j++;
                    ans[j]=arr[i];

                }
                }
                for( int i=0;i<arr.length/2;i++){
            System.out.println(ans[i]);
            }
       
    }       
}