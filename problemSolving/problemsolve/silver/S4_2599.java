package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_2599 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		int sum = 0; 
		for(int i=0;i<k;i++)
		{
			sum += arr[i]; 
		}
		int max = sum; 
		for(int i=0;i<n-k;i++)
		{
			if(max<(sum-arr[i]+arr[i+k]))
			{
				max = sum; 
			}
			sum = sum-arr[i]+arr[i+k];
//			System.out.println(sum);
		}
		
		System.out.println(max);
		
		br.close(); 
	}

}
