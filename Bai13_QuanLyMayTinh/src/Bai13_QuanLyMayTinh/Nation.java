package Bai13_QuanLyMayTinh;

public class Nation {
	private String maQuocGia, tenQuocGia;

	
	public Nation(String maQuocGia, String tenQuocGia) {
		super();
		this.maQuocGia = maQuocGia;
		this.tenQuocGia = tenQuocGia;
	}

	public String getMaQuocGia() {
		return maQuocGia;
	}

	public void setMaQuocGia(String maQuocGia) {
		this.maQuocGia = maQuocGia;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
}
