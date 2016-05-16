package myApps;

public class Assignment2
{
	public static void main(String[] args)
	{
		int[] myArray={0,3,5,2,1,66,23,45,31,4432,21};
		int[] sortedArray=arraySort(myArray);
		for(int i=0;i<=sortedArray.length-1;i++)
		{
			System.out.println(sortedArray[i]);
		}
	}
	public static int[] arraySort(int[] arr)
	{
		 boolean swapped;
		    do {
		        swapped = false;
		        for (int j=0;j<arr.length-1;j++)
		            if (arr[j]>arr[j+1]) {
		                int temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		                swapped = true;
		            }
		    } while (swapped);
		return arr;
	}
}