import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4344 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		
		double[] f = new double[c]; 
		
		for(int i=0;i<c;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			//int n = Integer.parseInt(br.readLine());
			
			double[] arr = new double[N];
			
			double avg = 0; 
			for(int j=0;j<N;j++)
			{
			
				arr[j] = Float.parseFloat(st.nextToken());
				avg += arr[j]; 
				 
			}
			avg = avg / N; 
			int cnt=0; 
			for(int j=0;j<N;j++)
			{
				if(arr[j]>avg) cnt++;
				 
			}
			double ans = (double)(cnt) / N * 100f;
//			System.out.printf("안녕 \n");
			f[i] = ans; 
		}
		

		for(int i=0;i<c;i++)
		{
			System.out.printf("%.3f%%\n",f[i]);
		}

		br.close(); 
	}

}
