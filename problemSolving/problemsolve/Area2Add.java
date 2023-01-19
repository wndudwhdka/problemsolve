import java.util.Scanner;

public class Area2Add {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int m = sc.nextInt();
 		int[][] fir = new int[n][m];
 		int[][] sec = new int[n][m];
 		
 		for(int i=0;i<n;i++) {
 			for(int j=0;j<m;j++)
 			{
 				fir[i][j] = sc.nextInt();
 			}
 		}
 		
 		for(int i=0;i<n;i++) {
 			for(int j=0;j<m;j++)
 			{
 				sec[i][j] = sc.nextInt();
 				fir[i][j] += sec[i][j];
 			}
 		}
 		for(int i=0;i<n;i++) {
 			for(int j=0;j<m;j++)
 			{
 				System.out.print(fir[i][j]+" ");
 				
 			}
 			System.out.println();
 		}
 		sc.close();
	}
 	
}
