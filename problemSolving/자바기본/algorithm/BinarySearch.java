package algorithm;

public class BinarySearch {
	
	// 정렬되어 있을 경우에만 가능
	// 반복문은 배열의 인덱스를 절반씩 나눠 가며 탐색을 진행한다. 
	static int[] arr = {1,2,3,4,7,9,12,15,16,18,23,116,1216,1436,1552};
	
	public static void main(String[] args) {
		int n = 100000;
		if(binarySearch(n)) System.out.println(n+"은 이진트리에 있습니다.");
		else System.out.println(n+"은 이진트리에 없습니다.");
		
	}
	
	public static boolean binarySearch(int n) {
		int min=0; 
		int max=arr.length-1;
		int mid=0;
		int cnt=0; 
		while(min<=max)
		{
			mid = (min+max)/2;
			if(arr[mid]>n) // 중간값이 입력값 보다 크면
			{
				max = mid-1;	
			}
			else if(arr[mid]<n) // 중간값이 입력값 보다 작으면 
			{
				min = mid+1; 
			}
			else // 중간값 입력값이 같으면 
			{
				System.out.println("cnt는 "+cnt+"번 입니다");
				return true;
			}
			
			cnt++;
		}
		System.out.println("cnt는 "+cnt+"번 입니다");
		return false;
		
	}

}
