
import java.io.*;
public class Main {
	
		//public static int[] ()	 )
	
	
		public static void main(String[] args) throws IOException {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					int a = Integer.parseInt(br.readLine());
					
					
					int[] num = new int[a];
					int[] num1 = new int[a]; 
					int cnt=0;
					int tmp;
					for(int i=0;i<a;i++)
					{
						
						num[i] = Integer.parseInt(br.readLine());
						
						for(int j=0;j<=i-1;i++)
						{
							if(num[i]<=num[0])//맨앞에
							{
								tmp = num[i]; 
							}
							
							if(num[i]>=num[j])//중간
							{
								if(num[i]<=num[j+1])
								{
									
								}
							 }
							 if (num[i]>=num[i])
							 {
								
							 }
						}
						
						if(i==0) {
								num1[cnt]=num[i];
								cnt++;
								
						}
						else {
						
							
								num1[cnt]=num[i/2];
								cnt++;
								
	
						}
						
					 }
					for(int i=0;i<a;i++)
					{
						
						System.out.println(num1[i]);
						
					 }

					
			
		}

}
