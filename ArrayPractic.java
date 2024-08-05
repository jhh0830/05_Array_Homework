package com.kh.array.practice;

import java.util.Arrays;

import javax.management.openmbean.ArrayType;

public class ArrayPractic {

	public void parcitce1() {
		int[] arr = new int[10];
		for(int i = 0; i< 10; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
	}
}
