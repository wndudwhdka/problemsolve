package algorithm;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 8; 
		int[] heap = {6,9,10,4,5,1,12,3};
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
				child =root; //루트를 타고올라간다. 
				
			}
			while(child!=0); // 타고올라온 루트가 0이고 child가 그위치에 해당되면 끝. 
		}
		for (int i=0;i<size;i++)
		{
			System.out.println(heap[i]);
		}
		System.out.println(cnt+"만큼 반복되었습니다.");
	}

}
