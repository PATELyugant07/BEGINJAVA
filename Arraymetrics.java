public class Arraymetrics
{
	public static void main(String[] args){
		int [][] mat1 = {{1, 2, 3},
						{4, 5, 6}}; 
		int [][] mat2 = {{2, 6, 3},
						{9, 7, 6}}; 
		int [][] result = {{0, 0, 0},
						{0, 0, 0}};
		for (int i=0;i<mat1.length;i++){
			for (int j=0;j<mat1[i].length;j++){
				System.out.format("setting value for i=%d and j=%d/\n", i, j);
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		for (int i=0;i<mat1.length;i++){
			for (int j=0;j<mat1[i].length;j++){
				System.out.println(result[i][j] + " ");
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println("");
		}
	}
}