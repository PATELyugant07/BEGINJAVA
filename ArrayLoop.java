public class ArrayLoop{
	public static void main(String[] args){
		int [] mark = new int[5];
		mark[0] = 100;
		mark[1] = 70;
		mark[2] = 30;
		mark[3] = 40;
		mark[4] = 60;
		for (int i=0;i<mark.length; i++)
		{
			System.out.println(mark[i]);
		}
		System.out.println("reverse");
		for (int i=mark.length -1; i>=0; i--)
		{
			System.out.println(mark[i]);
		}
	}
}