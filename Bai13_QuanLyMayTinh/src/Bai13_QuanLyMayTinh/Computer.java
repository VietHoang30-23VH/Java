package Bai13_QuanLyMayTinh;

public class Computer {
	private Manufacturer hangsanxuat;
	private Date ngaysanxuat;
	private double price;
	private double thoigianbaohanh;
	public Computer(Manufacturer hangsanxuat, Date ngaysanxuat, double price, double thoigianbaohanh) {
		super();
		this.hangsanxuat = hangsanxuat;
		this.ngaysanxuat = ngaysanxuat;
		this.price = price;
		this.thoigianbaohanh = thoigianbaohanh;
	}
	public Manufacturer getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(Manufacturer hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
	public Date getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(Date ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getThoigianbaohanh() {
		return thoigianbaohanh;
	}
	public void setThoigianbaohanh(double thoigianbaohanh) {
		this.thoigianbaohanh = thoigianbaohanh;
	}
	public boolean kiemTraGiaThapHon(Computer cm)
	{
		return this.price < cm.price;
	}
	public String layTenQuocGia()
	{
		return this.hangsanxuat.getTenHangSanXuat();
	}
}
