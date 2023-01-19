package algorithm;

import java.util.Stack;

public class Dfs_Stack {

	static boolean[] visited = new boolean[9]; 
	
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7},{2},{4,5}, {1,2}};  
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		
		// 맨처음 스택에 1번노드 입력 (처음을 1번 노드로 가정하고 진행) 
		stack.push(1); 
		
		// 1번 노드 
		visited[1] = true;
		
		// 스택이 빌때까지 반복
		while(!stack.isEmpty())
		{
			// 현재 스택의 꼭대기를 뽑아서
			int nodeIndex = stack.pop(); 
			
			// 해당 데이터 출력 
			System.out.println(nodeIndex );
		
			
			// pop한 노드의 주변노드 탐색
			for(int LinkedNode : graph[nodeIndex])
			{
				// 연결된 노드를 봤을 때 방문한적이 없으면
				if(!visited[LinkedNode]) {
					
					// 연결된 노드를 스택에 넣고 방문처리 
					stack.push(LinkedNode);
					visited[LinkedNode] = true; 
				}
				
				
			}
			
		}
		
		
	}
	
}
