package com;
import java.util.ArrayList;
import java.util.Arrays;

public class OrderStatistics {
	static int Kthsmallest(int arr[],int k) {
		Arrays.sort(arr);
		return arr[k-1];	
	}

	public static void main(String[] args) {
		int[] arr= {4,2,7,9,11,5,13,8,3};
		ArrayList<Integer> al=new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    al.add(i);
		}
		System.out.println(al);
		int k=3;
		int res=Kthsmallest(arr,k);
		System.out.println("The "+k+"th smallest element of given array:"+res);

	}

}
