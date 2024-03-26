package Bao10_QuanLySach;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day>0 && day<32)
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month <13)
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0)
		this.year = year;
	}
	
}
