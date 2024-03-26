package bai11_QuanLyPhim;

public class Publicer {
	private String NameOfPublicer;
	private String Nation;
	public Publicer(String nameOfPublicer, String nation) {
		NameOfPublicer = nameOfPublicer;
		Nation = nation;
	}
	public String getNameOfPublicer() {
		return NameOfPublicer;
	}
	public void setNameOfPublicer(String nameOfPublicer) {
		NameOfPublicer = nameOfPublicer;
	}
	public String getNation() {
		return Nation;
	}
	public void setNation(String nation) {
		Nation = nation;
	}
	public void ShowNameOfPublicer()
	{
		System.out.println("Name of publicer is:" +" "+this.NameOfPublicer);
	}
}
