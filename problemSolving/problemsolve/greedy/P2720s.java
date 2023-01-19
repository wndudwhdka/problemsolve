package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2720s {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T  = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int[] coin = new int[] {25,10,5,1};
		
		int idx = 0; 
		
		for(int i=0; i <T;i++) {
		
			int[] change = new int[4];
			arr[i] = Integer.parseInt(br.readLine());
			idx = 0; 
			while(arr[i]!=0) { // 돈이 없어질 때까지 반복  
				
				if(arr[i]>=coin[idx]) {
					arr[i]-=coin[idx];
					change[idx]++;
				}
				else {
					idx++;
				}
				
			}
			for(int j=0;j<4;j++)
			{
				System.out.print(change[j]+" ");
			}
		
			System.out.println();
			
		}
		br.close();
		
		
		
		
	}

}
