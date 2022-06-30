package programs;
import java.util.Scanner;

public class TransposeOfMatrix {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [][] matrix = new int[10][10];
		int m,n,temp;
		m = sc.nextInt(); n = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//Transpose of matrix 
		for(int i=0;i<m;i++) {
			for(int j=0;j<i;j++) {				
				temp = matrix [i][j];
				matrix[i][j] = matrix [j][i];
				matrix[j][i] = temp;				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}		
		sc.close();		
	}
}