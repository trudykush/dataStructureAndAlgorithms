package Sorting;

import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int arr[],int n)
		{
			int i;
			for(i=1;i<n;i++)
			new InsertionSortClass().insert(arr,i);
		}
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}

/*This is a function problem.You only need to complete the function given below*/
/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */
/* Function to sort an array using insertion sort
static void insertionSort(int arr[], int n)
{
  GfG obj = new GfG();
   for (int i = 1; i < n; i++)
      obj.insert(arr, i);
} */
class InsertionSortClass
{
  static void insert(int arr[],int i)
  {
       int key = 0;
       key = arr[i];
       int j = i-1;
       
       while (j >=0 && arr[j] > key) {
           arr[j+1] = arr[j];
           j = j-1;
       }
       arr[j+1] = key;
  }
}