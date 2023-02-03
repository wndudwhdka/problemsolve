package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class S3_2108 {

	public static void main(String[] args) throws  IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		int[] arr = new int[N];
		int min=0,max=0; 
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =Integer.parseInt(br.readLine());
			sum+=arr[i];
			if(i==0)
			{
				min=arr[i];
				max=arr[i]; 
			}
		}
		
		br.close();
		Arrays.sort(arr);
		int middle = arr[(arr.length-1)/2];
		sum=sum/N;
		System.out.println(sum);
		System.out.println(middle);
		
		
		

	}

}
