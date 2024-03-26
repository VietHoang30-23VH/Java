package bai11_QuanLyPhim;

public class Movie {
	private String NameOfMovie;
	private int NamSanXuat;
	Publicer pub;
	private double Price;
	DateShow date;
	public Movie(String nameOfMovie, int namSanXuat, Publicer pub, double price, DateShow date) {
		NameOfMovie = nameOfMovie;
		NamSanXuat = namSanXuat;
		this.pub = pub;
		Price = price;
		this.date = date;
	}
	public String getNameOfMovie() {
		return NameOfMovie;
	}
	public void setNameOfMovie(String nameOfMovie) {
		NameOfMovie = nameOfMovie;
	}
	public int getNamSanXuat() {
		return NamSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		NamSanXuat = namSanXuat;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	// Cau a
	public boolean Check(Movie obj)
	{
		return this.Price < obj.Price ; 
	}
	// Cau b
	public String TenHang()
	{
		System.out.println("Name of Publicer is: ");
		return this.pub.getNameOfPublicer();
	}
	// Cau c
	public double PriceReducing(double x)
	{
		return this.Price *(1-x/100);
	}
}
