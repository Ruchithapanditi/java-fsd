package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l && l <= arr.length - 1) {
                int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

	public static void main(String[] args) {
		int  n, search;  
		BinarySearch bs=new BinarySearch();
		 Scanner input = new Scanner(System.in);  
		   int arr[]= {2,3,5,8,11,16,20};
		   n=arr.length;
		   ArrayList<Integer>al=new ArrayList<Integer>(n);
		   for(int x:arr) {
			   al.add(x);
		   }
		   System.out.println("Given Array:"+al);
		   System.out.println("Enter value to find");  
		    search = input.nextInt();  
		    int res=bs.binarySearch(arr,0,n-1,search);
		    if(res==-1)
		    {
		    	 System.out.println(search + " isn't present in array.");  
		    }
		    else {
		    	System.out.println(search + " is present at location " +( res+1)+ ".");  
		    }

	}

	private static int binarysearch(int[] arr, int i, int j, int search) {
		// TODO Auto-generated method stub
		return 0;
	}

}
