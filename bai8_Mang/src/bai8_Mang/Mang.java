package bai8_Mang;

import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
	double mang1[];
	Scanner sc = new Scanner(System.in);
	mang1 = new double[10];
	for (int i =0 ; i< mang1.length; i++)
	{
		System.out.println("Nhap phan tu thu "+ i + ":");
		mang1[i]= sc.nextDouble();
	}
	double sum=0;
	for (int i = 0; i < mang1.length; i++) {
		sum+=mang1[i];
	}
	System.out.println("Tong phan tu: " + (int)sum);
	
	try {
		double mang2[] = new double[] {1,2,3,4,5,6};
	for(int i=mang2.length-1;i>=0;i++)
	{
		System.out.println("Mang dao nguoc:" + mang2[i]);
	}
	} catch (Exception e) {
		System.out.println("Nhap lai mang:");
	}
	
	}	
}
