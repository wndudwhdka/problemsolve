package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class P1152s {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		System.out.println(st.countTokens());
		
		
		
		
		br.close();
		
	}
}
