import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P1920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  
		HashSet<Integer> h = new HashSet<>();
		
		st = new StringTokenizer(br.readLine()); 
		for(int i=0;i<N;i++)
		{
			h.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine()); 
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()); 
		for(int i=0;i<M;i++)
		{
			if(h.contains(Integer.parseInt(st.nextToken())))
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
		
		br.close();

	}

}
