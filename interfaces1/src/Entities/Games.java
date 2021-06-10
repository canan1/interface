package Entities;

public class Games {
	private String gamesName;
	private int price;
	private int discount;
	public Games(String gamesName, int price, int discount) {
		super();
		this.gamesName = gamesName;
		this.price = price;
		this.discount = discount;
	}
	public String getGamesName() {
		return gamesName;
	}
	public void setGamesName(String gamesName) {
		this.gamesName = gamesName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}

}
