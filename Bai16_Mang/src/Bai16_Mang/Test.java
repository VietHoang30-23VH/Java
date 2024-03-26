package Bai16_Mang;

import java.util.Arrays;

public class Test {
	public static int[] reverse (int[] x) {
		int[] rs= new int[x.length];
		int index=0;
		for (int i=x.length - 1; i>=0 ;i--)
		{
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int[] array = new int [] {1,7,4,6,7,8,9,10};
		int[] array2 = new int [15];
		
		//
		System.out.println("array ban đầu: "+ Arrays.toString(array));
		// Hàm sắp xếp 
		Arrays.sort(array);
		System.out.println("array sau khi sắp xếp: "+ Arrays.toString(array));
		// Hàm tìm kiếm
		System.out.println(Arrays.binarySearch(array, 4));
		System.out.println(Arrays.binarySearch(array, -1));
		// Hàm điền giá trị
		Arrays.fill(array2, 5);
		System.out.println("array2 sau khi điền giá trị: " + Arrays.toString(array2));
		// Hàm sắp xếp giảm dần
		Arrays.sort(array);
		array = Test.reverse(array);
		System.out.println("Array sau khi sắp xếp giảm dần: " + Arrays.toString(array));
		
			
		
		
		
	}
}
