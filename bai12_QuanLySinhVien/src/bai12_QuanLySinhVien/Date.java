package bai12_QuanLySinhVien;

import java.util.Objects;

public class Date {
	private int ngay;
	private int thang;
	private int nam;
	public Date()
	{
		this.ngay = 0;
		this.thang = 0;
		this.nam = 0;
	}
	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		if (this.ngay > 0 && this.ngay <32)
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		if (this.thang > 0 && this.thang <13)
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		if (this.nam >0)
		this.nam = nam;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Date other = (Date) obj;
		return nam == other.nam && ngay == other.ngay && thang == other.thang;
	}
	
}
