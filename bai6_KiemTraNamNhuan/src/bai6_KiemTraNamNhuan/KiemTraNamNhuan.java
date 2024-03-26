package bai6_KiemTraNamNhuan;

import java.util.Scanner;

public class KiemTraNamNhuan {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao thang: ");
	long month = sc.nextLong();
	System.out.println("Nhap vao nam: ");
	long year = sc.nextLong();
	
	switch ((int)month) {
	case 1: 
	case 3:
	case 5:
	case 7:
	case 8: 
	case 10:
	case 12:
		System.out.println("Thang co 31 ngay");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("Thang co 30 ngay");
		break;
	
	case 2:
		if ( ((int)year%4 == 0 && (int)year%100 != 0) || ( (int)year%400==0) )
		{
			System.out.println("Nam nhuan va co 29 ngay.");
		}
		else 
			System.out.println("Nam khong nhuan va co 28 ngay.");
	default:
		throw new IllegalArgumentException("Unexpected value: " + month);
	}
	}
	
}
