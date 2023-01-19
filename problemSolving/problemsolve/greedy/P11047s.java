package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P11047s {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1]; 
		
		for(int i=1;i<=n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt=0; 
		while(k!=0) //k가 0이 될때까지 
		{
			if(k-arr[n]>=0)
			{
				k-=arr[n];
				cnt++;
			}
			else
			{
				n--;
			}
		}
		System.out.println(cnt);
		br.close();
		
	}

}
