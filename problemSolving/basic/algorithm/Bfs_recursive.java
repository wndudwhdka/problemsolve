package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs_recursive { //

	public static void main(String[] args) {
		
		// 인덱스 번호가 노드 번호이고 각 노드는 서로 상호 연결되어 있다  
		// 이미지 주소 
		// https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcbRnry%2Fbtq2Ma1f8bm%2FpcMvcQhqVaIrmnHvCFzIC1%2Fimg.png
		int[][] graph = {{},{2,3,8},{1,6,8},{1,5},{5,7},{3,4,7},{2},{4,5},{1,2}};
		
		// 그래프 방문을 확인하는 booolean
		boolean[] visited = new boolean[9]; 
		
		//
		int start = 1; 
		System.out.println("출발지점 "+start+"번 노드 : "+bfs(1,graph,visited));
		
	}
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		// 탐색 순서를 출력하기 위한 용도 
		StringBuilder sb = new StringBuilder(); 
		Queue<Integer> queue = new LinkedList<Integer>(); //LinkedList는 interface Queue를 implements하였다. 
		
		// 큐에 BFS를 시작할 노드 번호 기입 
		queue.offer(start);
		
		// 시작노드 방문처리 
		visited[start] = true; 
		
		while(!queue.isEmpty())
		{
			
			// 큐에서 꺼낸 노드의 번호 할당
			int nodeIndex = queue.poll();
			sb.append(nodeIndex+"->");
			
			// 그래프에서 꺼낸 노드의 index로 해당 노드로 접근해서 연결된 노드들을 체크
			for(int i=0;i<graph[nodeIndex].length;i++)
			{
				// 연결된 노드 번호 temp에 할당
				int temp = graph[nodeIndex][i];
				
				// 조사를 하였는데 해당 노드가 방문한적이 없다면
				if(!visited[temp]) {
					
					//방문을 체크후 queue에 해당 노드를 삽입
					visited[temp] = true;
					queue.offer(temp); 
				}
				
			}
			
			
			
		}
		
		return sb.toString();
		
	}
	
}
