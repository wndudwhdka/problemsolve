package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


//문제
//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//입력
//첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
//
//출력
//조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

public class P1181 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine()); 
		List<String> listS = new ArrayList<>();
		String temp; 
		
		int cnt=0; 
		// N번의 입력 받기 
		for(int i=0;i<N;i++)
		{	
			temp = br.readLine();
			
			// 중복검사 해서 중복데이터 원천 배제 
			if(!listS.contains(temp)){
				 listS.add(temp);
			}
			else {
				cnt++;
			}
		}
		
		N-=cnt;
		
		// nlogn 짜리로 해야할듯. 
		for(int k=(N-1);k>0;k--) {
			for(int i=0;i<k;i++)
			{	
				//앞의 단어 길이가 뒤에 꺼보다 크면
				if(listS.get(i).length()>listS.get(i+1).length())
				{	
					temp = listS.get(i); 
					listS.set(i,listS.get(i+1));
					listS.set(i+1,temp);
						
				}
				// 두개의 길이가 같을 경우 
				else if(listS.get(i).length()==listS.get(i+1).length())
				{
				
					// 사전 순서 정렬 
					if(listS.get(i).compareTo(listS.get(i+1))>0)
					{
						
						temp = listS.get(i); 
						listS.set(i,listS.get(i+1));
						listS.set(i+1,temp);
					}
									
				}
				
			
			}
		}

		for(int i=0;i<N;i++)
		{
			System.out.println(listS.get(i));
		}
		
		br.close();
		
	}
}
