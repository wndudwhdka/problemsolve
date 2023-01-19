package greedy;

import java.util.Scanner;
import java.util.Arrays;

public class P11399s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
			
		int ans = 0; 
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			ans += (n-i)*arr[i]; 
		}
		
		System.out.println(ans);
	
		sc.close();
	}

}
