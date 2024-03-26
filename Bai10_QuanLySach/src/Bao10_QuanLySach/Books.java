package Bao10_QuanLySach;

public class Books {
	private String NameOfBook;
	private double Price;
	private int DayOfPublic;
	private Author author;
	public Books(String NameOfBook, double price, int dayOfPublic, Author author) {
	
		this.NameOfBook = NameOfBook;
		this.Price = price;
		this.DayOfPublic = dayOfPublic;
		this.author = author;
	}
	public String getNameOfBook() {
		return NameOfBook;
	}
	public void setNameOfBook(String NameOfBook) {
		NameOfBook = NameOfBook;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getDayOfPublic() {
		return DayOfPublic;
	}
	public void setDayOfPublic(int dayOfPublic) {
		DayOfPublic = dayOfPublic;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void PrintNameOfBook()
	{
		System.out.println("The name of this book is" + this.NameOfBook);
	}
	public boolean CheckYearOfBook(Books obj)
	{
		return this.DayOfPublic == obj.DayOfPublic;
	}
	public double PriceAfterReducing(double x)
	{
		return this.Price*( (1-x)/100);
	}
	
	
	
}
