package bai12_QuanLySinhVien;

public class Class {
	private String tenLop;
	private String tenKhoa;
	public Class(){}
	public Class(String tenLop, String tenKhoa) {
		super();
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	@Override
	public String toString() {
		return "Class [tenLop=" + tenLop + ", tenKhoa=" + tenKhoa + "]";
	}	
	
}
