package Sorting;

import java.util.Scanner;

class QuickSort
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
   /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = new QuickSorting().partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} 
}

/*This is a function problem.You only need to complete the function given below*/
/* The main function that implements QuickSort() (present in a class 
   different from QuickSort)
   arr[] --> Array to be sorted,   low  --> Starting index,  high  --> Ending index 
static void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        
        int pi = new QuickSort().partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    } }*/
class QuickSorting
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    static int partition(int arr[], int low, int high)
    {
       int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
}
