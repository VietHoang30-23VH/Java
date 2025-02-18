package bai12_QuanLySinhVien;

import java.util.Objects;

public class Student {
	private String maSinhVien;
	private String hoVaTen;
	private Date dateofbirth;
	private double diemTrungBinh;
	private Class lop;
	public Student(String maSinhVien, String hoVaTen, Date dateofbirth, double diemTrungBinh, Class lop) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.dateofbirth = dateofbirth;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String layTenKhoa()
	{
		return this.lop.getTenKhoa();
	}
	public boolean KiemTraThiDat()
	{
		return this.diemTrungBinh >= 5.0;
	}
	public boolean KiemTraCungNgaySinh(Student st)
	{
		return this.dateofbirth.equals(st.dateofbirth);
	}
	
	
}
