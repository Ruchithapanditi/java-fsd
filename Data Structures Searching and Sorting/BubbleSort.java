package com;

public class BubbleSort {
	public static void bubblesort(int arr[]) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++) {
				 if(arr[j-1]>arr[j]) {
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j]=temp;
				 }
			}
		}
	}


	public static void main(String[] args) {
		 int[] arr = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        bubblesort(arr);
	         
	        System.out.println("After Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	            }
	}
}


