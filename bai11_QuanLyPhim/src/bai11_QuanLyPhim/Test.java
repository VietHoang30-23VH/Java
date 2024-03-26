package bai11_QuanLyPhim;

public class Test {
	public static void main(String[] args) {
		DateShow ngay1= new DateShow (14,02,2024);
		DateShow ngay2= new DateShow (15,02,2024);
		DateShow ngay3= new DateShow (16,02,2024);
		
		Publicer pub1 = new Publicer ("Hang A","Viet Nam");
		Publicer pub2 = new Publicer ("Hang B","Han Quoc");
		Publicer pub3 = new Publicer ("Hang C","Trung Quoc");
		
		Movie mov1 = new Movie ("Mai",2024,pub1,45000,ngay1);
		Movie mov2 = new Movie ("Squid Game",2023,pub2,90000,ngay2);
		Movie mov3 = new Movie ("Kung fu Panda",2024,pub3,55000,ngay3);
		
		System.out.println("So phim 1 voi phim 2:" + mov1.Check(mov2));
		int x=10;
		System.out.println("Gia ve sau khi giam:" + mov1.PriceReducing(x));
		
		
	}
}
