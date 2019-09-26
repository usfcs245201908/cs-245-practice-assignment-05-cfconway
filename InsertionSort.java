public class InsertionSort implements SortingAlgorithm
{
	public void sort(int[] a)
	{	
		for(int i=1;i<a.length;i++)
		{ int j=i-1;
			while(j>=0 && a[j]>a[i])
			{
				a[j+1]= a[j];
				j=j-1;
			}
		} 
	}

}