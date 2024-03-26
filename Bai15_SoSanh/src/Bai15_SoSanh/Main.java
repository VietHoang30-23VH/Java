package Bai15_SoSanh;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input these strings here: ");
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			
			// Hàm equals : so sánh 2 chuỗi , trả về kết quả true - false
			System.out.println("s1 is equal to s2: " + s1.equals(s2));
			// Hàm equalsIgnoreCase : so sánh 2 chuỗi không phân biệt hoa thường
			System.out.println("s1 is equal to s2:" + s1.equalsIgnoreCase(s2));
			// Hàm CompareTo (): so sánh 
			System.out.println(s1.compareTo(s2));
			// Hàm regionMatches : so sánh 1 đoạn chuỗi 
			boolean check = s1.regionMatches(2, s2, 0, 4);
			System.out.println(check);
			// Hàm startWith : kiểm tra chuỗi bắt đầu bằng.0..
			System.out.println(s2.startsWith("Dang"));
			// Hàm endWith : kiếm tra chuỗi kết thúc bằng...
			
			// Hàm indexOf : kiểm tra chuỗi s2 có trong s1 hay không
			System.out.println("Vị trí của s2 có trong s1 là:" + s2.indexOf(s1));
			
			// Hàm lastIndexof : tìm kiếm từ trái sang phải
			System.out.println("vị trí của s2 trong s1 từ phải sang trái:" + s2.lastIndexOf(s1));
			
			// Hàm concat(): nối các chuỗi lại với nhau
			String s3 = s1.concat(s2);
			System.out.println("s3: " + s3);
			// Hàm replace : thay thế
			String s4 = "va ";
			String s5 = s4.replaceAll(s4, s3);
			System.out.println("s5 = " + s5);
			// Hàm toLowerCase
			// Hàm toUpperCase
			 
			// Hàm trim() : xóa khoảng trắng dư thừa ở đầu chuỗi
			// Hàm subString() : cắt chuỗi con 
			
	}
}
