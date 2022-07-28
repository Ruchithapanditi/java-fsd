package com;
import java.util.*;

public class LinearSearch {
	public static int linearsearch(int arr[],int search) {
		for (int i = 0; i <arr.length; i++)  
	    {  
	      if (arr[i]== search) 
	      {  
	         return i;
	      }    
	    }
		return -1;
	}

	public static void main(String[] args) {
		 int  n, search;  
		 Scanner input = new Scanner(System.in);  
		   int arr[]= {2,5,7,6,3,10,4,8};
		   n=arr.length;
		   ArrayList<Integer>al=new ArrayList<Integer>(n);
		   for(int x:arr) {
			   al.add(x);
		   }
		   System.out.println("Given Array:"+al);
		   System.out.println("Enter value to find");  
		    search = input.nextInt();  
		    int res=linearsearch(arr,search);
		    if(res==-1)
		    {
		    	 System.out.println(search + " isn't present in array.");  
		    }
		    else {
		    	System.out.println(search + " is present at location " + (res+1 )+ ".");  
		    }
		   
		     
		   }
	
	}

