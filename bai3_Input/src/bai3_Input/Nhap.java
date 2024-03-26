package bai3_Input;

import java.util.Scanner;

public class Nhap {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao ho ten:");
	String HoTen = sc.nextLine();
	
	System.out.println("Nhap vao dia chi:");
	String madc = sc.nextLine();
	
	System.out.println("Nhap vao diem thi:");
	float diemtb = sc.nextFloat();

	System.out.println("Nhap vao so thu tu: ");
	int stt = sc.nextInt();
	
	System.out.println("--- Xuat thong tin ---");
	System.out.println("Ho ten:" + HoTen);
	System.out.println("Dia chi:" + madc);
	System.out.println("Diem thi:" + diemtb);
	System.out.println("So thu tu:" + stt);
	}
}
