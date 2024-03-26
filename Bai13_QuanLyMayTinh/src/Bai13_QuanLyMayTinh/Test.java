package Bai13_QuanLyMayTinh;

public class Test {
	public static void main(String[] args) {
		Date ngay1 = new Date (15, 8, 2025);
		Date ngay2 = new Date (1, 3, 2025);
		Date ngay3 = new Date (6, 9, 2025);
		
		Nation Nation1 = new Nation ("VN", "Việt Nam");
		Nation Nation2 = new Nation ("USA", "Hoa Kỳ");
		Nation Nation3 = new Nation ("TW", "Đài Loan");
		
		Manufacturer Manufacturer1 = new Manufacturer ("VNLaptop", Nation1);
		Manufacturer Manufacturer2 = new Manufacturer ("Macbook", Nation2);
		Manufacturer Manufacturer3 = new Manufacturer ("Asus", Nation3);
		
		Computer Computer1 = new Computer (Manufacturer1, ngay1, 1500, 12);
		Computer Computer2 = new Computer (Manufacturer2, ngay2, 2000, 24);
		Computer Computer3 = new Computer (Manufacturer3, ngay3, 1000, 12);
		
		System.out.println("So sanh gia thấp hơn: ");
		System.out.println("M1 < M2: "+ Computer1.kiemTraGiaThapHon(Computer2));
		System.out.println("M1 < M3: "+ Computer1.kiemTraGiaThapHon(Computer3));
		
		
		System.out.println("Tên quốc gia: ");
		System.out.println("M1: "+ Computer1.layTenQuocGia());
		System.out.println("M2: "+ Computer2.layTenQuocGia());
		System.out.println("M3: "+ Computer3.layTenQuocGia());
	}
}
