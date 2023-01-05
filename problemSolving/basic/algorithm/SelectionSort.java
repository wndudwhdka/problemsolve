package algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 30, 50, 20, 10, 40을 선택 정렬로 정렬하시오
		
		// 오름차순 ascending 
		int[] arr = new int[] {30, 50, 20, 10, 40};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
		
		System.out.println("오름차순 결과는 다음과 같습니다.");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		// 내림차순 descending
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
		
		System.out.println();
		System.out.println("내림차순 결과는 다음과 같습니다.");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

	
	static void swap(int[] arr,int first, int second)
	{
		int temp; 
		temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp; 
		
	}
}
