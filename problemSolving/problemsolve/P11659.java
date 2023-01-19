
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class P11659 { // 구간합구하기 
	public static void main(String[] args) throws IOException {
	
//		long beforeTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());// 첫째줄
		
		
		//---------------첫쨰줄입력
		int n = Integer.parseInt(st1.nextToken()); // 수 개수
		int m = Integer.parseInt(st1.nextToken()); // 제시할 구간 개수 
		int[] arr = new	int[n];  // 저장할 수들 
		int[] ans = new int[m];  // 정답 저장 배열
		int[] nujeok = new int[n]; 
		int nu =0; 
		
		
		
		//---------------둘쨰줄입력
		String str = br.readLine();
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			arr[i] = Integer.parseInt(s[i]);
		}
		
		//---------------누적합 미리계산
		for(int i=0; i<nujeok.length;i++)
		{	nu += arr[i]; 
			nujeok[i] = nu;
		}
		
		
		//---------------셋쨰줄이상 입력 및 계산
		int[] a = new int[2];
		String[] t = new String[2];
		for(int i=0;i<m;i++)
		{
			str = br.readLine();
			t = str.split(" ");			 // a[0]  a[1] a[2] a[3] a[4] 
			a[0] = Integer.parseInt(t[0]);// 1 		2 	3 	  4	   5 
			a[1] = Integer.parseInt(t[1]);// n[0] n[1] n[2] n[3] n[4]
										  //  1     3    6    10   15
			if(a[0]-1==0) ans[i] = nujeok[a[1]-1];
			else ans[i] = nujeok[a[1]-1]-nujeok[a[0]-2];
		}
		
		
//		for(int i=0;i<m;i++)
//		{
//			System.out.println(ans[i]);
//		}
		for(int i=0;i<m;i++)
		{
			System.out.println(ans[i]);
		}
		br.close();
		
//		long aftertime = System.currentTimeMillis();
//		
//		System.out.println("실행시간은 : "+(aftertime-beforeTime)+"ms");
		

	}

}
