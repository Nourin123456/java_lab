import java.util.Scanner;
public class matrix{
	public static void main(String[]args){
		int row,column;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		row=scan.nextInt();
		System.out.println("Enter number of columns:");
		column=scan.nextInt();
		int[][] matrix=new int[row][column];
		System.out.println("Enter Elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("The entered matrix is:");
		for (int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
