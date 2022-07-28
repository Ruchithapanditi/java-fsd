package com;
import java.util.*;

public class ArrayRotation {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(6);
		arr.add(7);
		arr.add(5);
		arr.add(11);
		arr.add(8);
		arr.add(15);
		System.out.println("Original Array before Rotation:"+arr);
		Collections.rotate(arr, 6); //left rotation
		System.out.println("Array after 1 rotations:"+arr);

	}

}
