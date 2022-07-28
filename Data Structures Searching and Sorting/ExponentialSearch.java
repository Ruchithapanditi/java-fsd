package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {
	
    public static int exponentialSearch(int[] arr ,int length, int value ){

    if(arr[0]==value){
        return 0;
        }
    int i=1;
    while(i<length && arr[i]<=value){

        i=i*2;
    }
    return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
    }


	public static void main(String[] args) {
		int[] arr = {6,12,18,24,32};
	    int length= arr.length;
	    Scanner input = new Scanner(System.in);
	    ArrayList<Integer>al=new ArrayList<Integer>(length);
		   for(int x:arr) {
			   al.add(x);
		   }
		   System.out.println("Given Array:"+al);
		   System.out.println("Enter value to find");  
		    int search = input.nextInt();  
	    int outcome = exponentialSearch(arr,length,search);
	    if(outcome<0){

	        System.out.println( "Element is not present in the array");

	     }else {

	         System.out.println( "Element is  present in the array at index :"+(outcome+1));
	     }

	}

}
