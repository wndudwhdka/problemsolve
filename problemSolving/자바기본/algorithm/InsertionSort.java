package algorithm;



public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,5,2,53,5,6,5,63,45,2,53235,346,5,54,6,34,5345};
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int idx = i; 
			for(int j=idx-1;j>=0;j--)
			{
				if(temp>arr[j])
				{
					arr[j+1]=arr[j];
					idx--;
				}
				
			}
			arr[idx] = temp;
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
