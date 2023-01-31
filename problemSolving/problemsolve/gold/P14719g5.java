package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719g5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[W];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<W;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int max = arr[0]; 
		int min = arr[0];
		int maxidx = 0;
		int minidx = 0; 
		// 전 구간 조사 
		boolean down = false;
		for(int i=0;i<W;i++)
		{
			//
			if(arr[i]<max)
			{
				down = true;
			}
			
		}
		
		
		
		br.close();
	}

}
