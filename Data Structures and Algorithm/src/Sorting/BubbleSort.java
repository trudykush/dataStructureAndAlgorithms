package Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			bubbleSort(arr,n);
			printArray(arr);
			
		t--;	
		}
	}
	static void bubbleSort(int arr[], int n)
	{
	    int i, j;
        for (i = 0; i < n-1; i++)      
            new BubbleSortClass().bubble(arr, i, n);
	 }
}
    

class BubbleSortClass
{
	static void bubble(int arr[], int i, int n)
    {
        for (int j=0; j<n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp;
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}