import java.util.Scanner;
public class matrixadd{
        public static void main(String[]args){
                int row,column;
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter number of rows:");
                row=scan.nextInt();
                System.out.println("Enter number of columns:");
                column=scan.nextInt();
		

                int[][] matrix1=new int[row][column];
		int[][] matrix2=new int[row][column];
		int[][] sum=new int[row][column];
                System.out.println("Enter first matrix  Elements:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<column;j++){
                                matrix1[i][j]=scan.nextInt();
                        }
                }
                System.out.println("Enter second matrix Elements:");
                for(int i=0;i<row;i++){
                        for(int j=0;j<column;j++){
                                matrix2[i][j]=scan.nextInt();
			}
		}
                for (int i=0;i<row;i++){
                        for(int j=0;j<column;j++){
                                sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("sum of matrix");
                for (int i=0;i<row;i++){
                        for(int j=0;j<column;j++){
                                System.out.print(sum[i][j]+" ");
                        }

                        System.out.println();
		}
		}
}
	
               
