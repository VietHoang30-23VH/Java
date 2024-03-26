package bai12_QuanLySinhVien;

public class Test {

		public static void main(String[] args) {
			Date ngay1 = new Date(19, 7, 2002);
			Date ngay2 = new Date(17, 2, 2001);
			Date ngay3 = new Date(19, 7, 2002);
			
			
			Class lop1 = new Class("DH01", "Khoa Công nghệ Thông tin");
			Class lop2 = new Class("DH02", "Khoa Khoa học Máy tính");
			Class lop3 = new Class("DH03", "Khoa An ninh mạng");
			
			Student sv1 = new Student("0001", "Tùng ITV", ngay1, 9.0, lop1);
			Student sv2 = new Student("0002", "Peter Le", ngay2, 4.0, lop2);
			Student sv3 = new Student("0003", "Lê Tùng", ngay3, 6.0, lop3);
			
			System.out.println("Tên khoa: ");
			System.out.println("SV1: "+ sv1.layTenKhoa());
			System.out.println("SV2: "+ sv2.layTenKhoa());
			System.out.println("SV3: "+ sv3.layTenKhoa());
			System.out.println("Kiểm tra thi đạt: ");
			System.out.println("SV1: "+ sv1.KiemTraThiDat());
			System.out.println("SV2: "+ sv2.KiemTraThiDat());
			System.out.println("SV3: "+ sv3.KiemTraThiDat());
			System.out.println("Kiểm tra cùng ngày sinh:");
			System.out.println("sv1 và sv2: "+ sv1.KiemTraCungNgaySinh(sv2));
			System.out.println("sv1 và sv3: "+ sv1.KiemTraCungNgaySinh(sv3));
			
		}
	
}
