package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class P1150 {

	public static void main(String[] args) throws IOException {
		
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken());
		
		int[]arr = new int[n]; 
		int[]dif = new int[n-1];
		int[]idx = new int[n-1];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine()); // 값 입력 오름차순..
		}
		//========================================
		
		for(int i=0;i<n-2;i++) // 최단거리 배열과 그 최단거리의 앞의 점 배열 할당. 
		{
			dif[i] = arr[i+1]-arr[i];
			idx[i] = i;
		}
		
		int ans=0; 
		
		for(int i=0;i<k;i++) // k개의 수 만큼 반복 
		{
			int min = 1000000001;
			int minidx =-1; 
			for(int j=0;j<n-2;j++) // 최솟값을 찾기 
			{
				if (min>dif[j]) {
					min = dif[j];
					minidx = j; 
				}
				 
				
			}
			dif[minidx] = 0; 
			ans += min;
		}
		
		//========================================		
		//출력
		br.close();

		System.out.println(ans);
		
		
	}

}
