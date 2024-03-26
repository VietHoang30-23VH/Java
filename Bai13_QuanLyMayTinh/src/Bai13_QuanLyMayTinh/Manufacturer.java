package Bai13_QuanLyMayTinh;

public class Manufacturer {
	private String tenHangSanXuat;
	private Nation quocgia;
	
	public Manufacturer(String tenHangSanXuat, Nation quocgia) {
		super();
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocgia = quocgia;
	}
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public Nation getQuocgia() {
		return quocgia;
	}
	public void setQuocgia(Nation quocgia) {
		this.quocgia = quocgia;
	}
	
	
}
