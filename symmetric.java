import java.util.Scanner;
public class symmetric{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows:");
		int row=sc.nextInt();
		System.out.print("Enter Number of columns:");
		int column=sc.nextInt();
		if(row!=column){
			System.out.println("Matrix is not symmetric");
			return;
		}
		int[][] matrix=new int[row][column];
		System.out.println("Enter matrix elements");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		boolean symmetric=true;

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(matrix[i][j]!=matrix[i][j]){
					symmetric=false;
					break;
				}
			}
		}
		if(symmetric){
			System.out.println("The matrix is Symmetric");
		}else{
			System.out.println("The matrix is not symmetric");
		}
	}
}
