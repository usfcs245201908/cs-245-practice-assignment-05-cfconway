public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		int low=0;
		int high=a.length-1;
		msort(a, low, high);
	}
	public void msort(int[] array, int lowIndex, int highIndex)
	{
		 //basecase 
		if (lowIndex<highIndex)
		{
			int middle = (lowIndex+highIndex)/2;
			msort(array, lowIndex, middle);
			msort(array, middle+1, highIndex);
			merge(array, lowIndex, middle, highIndex);
		}

 	}

 	public void merge(int[] array, int lowIndex, int midIndex, int highIndex)
 	{
 		//first find sizes of arrays to be merged:
 		int sizeOne= midIndex-lowIndex+1;
 		int sizeTwo= highIndex-midIndex;

 		//now create two temp arrays
 		int[] left = new int[sizeOne];
 		int[] right = new int[sizeTwo];

 		//now copy new data to arrays
 		for(int i=0; i<sizeOne; i++)
 		{
 			left[i]= array[i+lowIndex];
 		}

 		for(int j=0; j<sizeTwo; j++)
 		{
 			right[j]= array[midIndex+j+1];
 		}

 		//now merge
 		int i=0;
 		int j=0;
 		int k= lowIndex;
 		while(i<sizeOne && j<sizeTwo)
 		{
 			if(left[i]<=right[j])
 			{
 				array[k]=left[i];
 				i++;
 			}
 			else
 			{
 				array[k]= right[j];
 				j++;
 			}
 			k++;
 		}

 		while(i<sizeOne)
 		{
 			array[k]=left[i];
 			i++;
 			k++;
 		}
 		while(j<sizeTwo)
 		{
 			array[k]= right[j];
 			j++;
 			k++;
 		}
 	}

}