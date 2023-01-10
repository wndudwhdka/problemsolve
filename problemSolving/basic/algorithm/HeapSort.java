package algorithm;

public class HeapSort { //root가 가장 큰 값을 가지는 최대힙  

	public static void main(String[] args) {
		
		// 트리를 먼저 최대 힙 구조로 구성 
		
		int[] heap = {6,9,10,4,5,1,12,3};
		int size = heap.length; 
		
//		for(노드의 갯수만큼 반복) {
//			int child위치 = 반복인자
//			do {
//				int root위치 = (child위치 -1)/2
//				if(heap[root위치]<heap[child위치]) {
//					root위치 값과 child위치 값과 맞바꿈
//					
//					
//				}
//				child위치 = root위치
//			}
//			while(child위치가0이 될때까지)
//		}
		
		
		//// 		 6 		초기상태
		//		   9   10
		//       4  5 1  12  
		//		3
		
		int cnt=0; 
		for (int i=1;i<size;i++)
		{
			int child = i; 
			do {
				int root = (child -1)/2; 
				if (heap[root] < heap[child]) {// 부모가 자식보다 작다면 그 둘의 위치를 바꿔라 
					int temp = heap[root]; 
					heap[root] = heap[child];
					heap[child] = temp; 
					cnt++;
					for (int j=0;j<size;j++)
					{
						System.out.print(heap[j]+" ");
					}
					System.out.println("i는 "+i+"입니다.");
				}
				child =root; //부모를 타고 올라가면서 0까지 확인.  
				
			}
			while(child!=0); // 타고올라온 루트가 0이고 child가 그위치에 해당되면 끝. 
		}
		
		for (int i=0;i<size;i++)
		{
			System.out.println(heap[i]);
		}
		System.out.println(cnt+"만큼 반복되었습니다.");
		
		
	////	      12 		최대힙 상태. 
	//		   6     10
	//       4   5  1   9  
	//		3
	
		
//		for(노드의 개수만큼 반복인자 내려가며 반복) {
//			
//		}
			
		

		
		for(int i=size -1;i>= 0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp; 
			int root = 0; 
			int child = 1; 
			do { 
				child = 2 * root +1;
				
				
				if(heap[child]<heap[child+1]&&child<i-1) {
					child++;
				}
				
				if(heap[root]<heap[child] && child<i) {
					temp = heap[root];
					heap[root] = heap[child];
					heap[child] = temp; 
				}
			} while(child <i);
		}
		for (int i = 0; i < size; i++) {
			System.out.println(heap[i]);

	
	}
	

		 
		
		
		
	}

}
