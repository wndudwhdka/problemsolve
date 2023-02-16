package silver;

import java.util.Scanner;

public class S3_2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); 
		
		int[] a = {0,0,0,0,0};
		int[] arr = new int[6];
		int[] length = new int[6]; 
		for(int i=0;i<6;i++)
		{
			arr[i] = sc.nextInt();
			length[i] = sc.nextInt(); 
		}
		
		
		sc.close();
	}
}
