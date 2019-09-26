public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] arr)
	{
		qs(arr, 0, arr.length-1); //calling quicksort function
	}
	 //left is 0, right is the last index in array
	public void qs(int[] a, int left, int right)
	{
		if(left<right)
		{
			int pivot= partition(a, left, right);
			qs(a, left, pivot-1);
			qs(a, pivot+1, right);
		}

	}

	public int partition(int [] a, int left, int right)
	{
			int pivot= a[right];
			int i=left-1;  //one more than the pivor
		for(int j=left; j<right; j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}		
		int temp = a[i+1];
		a[i+1]= a[right];
		a[right]= temp;
		return i+1;
	}
		
}
