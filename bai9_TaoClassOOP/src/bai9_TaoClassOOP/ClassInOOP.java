package bai9_TaoClassOOP;

import java.util.Objects;

public class ClassInOOP {
	private int day;
	private int month;
	private int year;
	

	public ClassInOOP ( int d, int m, int y)
	{
		this.day=d; this.month=m; this.year=y;
	}
	public void PrintDay()
	{
		System.out.println("Ngay da nhap: "+day);
	}
	public void PrintMonth()
	{
		System.out.println("Thang da nhap: "+month);
	}
	public void PrintYear()
	{
		System.out.println("Nam da nhap: "+year);
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setDay(int d)
	{
		if ( d>0 && d<32) this.day=d;
	}
	public void setMonth(int month) {
		if ( month >=1 && month <=12)
		this.month = month;
	}
	public void setYear(int year) {
		if (year>=1)
		this.year = year;
	}
	@Override
	public String toString() {
		return this.day +"/" + this.month + "/" + this.year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassInOOP other = (ClassInOOP) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
};
