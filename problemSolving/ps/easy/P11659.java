package easy;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException; 
import java.io.BufferedReader;

public class P11659 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new	int[n]; 
		int[] ans = new int[m]; 
		String str  = br.readLine();
	
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
	
		
		int str;
		int fin;
		int total; 
		for(int i=0;i<m;i++)
		{
			str = Integer.parseInt(st.nextToken());
			fin = Integer.parseInt(st.nextToken());
//			str = sc.nextInt();
//			fin = sc.nextInt();
			total=0;
			for(int j=(str-1);j<fin;j++)
			{
				total += arr[j]; 
			}
			ans[i] = total; 
					
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(ans[i]);
		}
		br.close();
		

	}

}
