package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-50,30, 20, 50, 30 ,10,1,2,5,7,1}; 
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)// 앞뒤를 비교하면서 가장 큰것을 뒤로
			{
				if(arr[j-1]>arr[j])
				{
					swap (arr,j-1,j);
				}
			}
		}
		
		System.out.println("오름차순 정렬 후 .");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
		
	
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)// 앞뒤를 비교하면서 가장 큰것을 뒤로
			{
				if(arr[j-1]<arr[j])
				{
					swap (arr,j-1,j);
				}
			}
		}
		
		System.out.println("내림차순 정렬 후 .");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
		}
		
		



	static void swap(int []arr, int i, int j)
	{
		int temp = arr[i]; 
		arr[i] = arr[j];
		arr[j] = temp ;
		
	}
}
