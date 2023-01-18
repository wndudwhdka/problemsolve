package algorithm;

// 출처 : https://codingnojam.tistory.com/44

public class Dfs_Recursive {

	static boolean[] visited = new boolean[9]; 
	
	
	// 이미지 주소 
	// https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcbRnry%2Fbtq2Ma1f8bm%2FpcMvcQhqVaIrmnHvCFzIC1%2Fimg.png
	// 각 노드의 연결 노드 표기 0번은 제외 
	static int[][] graph = {{},{2,3,8}, {1,6,8},{1,5}, {5,7},{3,4,7},{2},{4,5},{1,2}};
	
	
	// main에서 dfs 호출 
	public static void main(String[] args) {
		
		dfs(1);
	}			

		
	static void dfs(int nodeIndex){ 
		
		// 방문 처리
		visited[nodeIndex] = true; 
		
		// 방문 노드  출력
		System.out.print(nodeIndex + "->");
		
		// 방문한 노드에 인접한 노드 찾기
		for (int node : graph[nodeIndex]) {
			// 인접한 노드가 방문한 적이 없다면 DFS 수행
			System.out.println(node);
			if(!visited[node]) {
				dfs(node);
			}
				
			
		}
		
		
		
	}

}
