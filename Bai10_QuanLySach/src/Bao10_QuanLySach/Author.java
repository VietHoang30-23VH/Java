package Bao10_QuanLySach;

public class Author {
	private String NameAuthor;
	private Date DayOfBirth;
	public Author(String nameAuthor, Date dayOfBirth) {
		this.NameAuthor = nameAuthor;
		this.DayOfBirth = dayOfBirth;
	}
	public String getNameAuthor() {
		return NameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.NameAuthor = nameAuthor;
	}
	public Date getDayOfBirth() {
		return DayOfBirth;
	}
	public void setDayOfBirth(Date dayOfBirth) {
		this.DayOfBirth = dayOfBirth;
	}
	
}
