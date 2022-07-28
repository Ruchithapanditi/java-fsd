package com;
import java.util.*;

public class RangeQueries {
	static int query(int arr[],int l,int u) {
		int sum=0;
		for (int i=l;i<=u;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[]= {11,23,54,65,38,40,72};
		ArrayList<Integer> al=new ArrayList<Integer>(arr.length);
		for(int i:arr) {
			al.add(i);
		}
		System.out.println("Given Array:"+al);
		System.out.println("Sum of numbers in given range is:"+query(arr,0,5));
		System.out.println("Sum of numbers in given range is:"+query(arr,3,6));
	
		

	}

}
