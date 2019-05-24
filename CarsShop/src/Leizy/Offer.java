package Leizy;

enum Type { SELL, BUY }

public class Offer {
	private Type type; // buy/sell
	private int id; // offer's id
	private double price; // offered price
	private String notes; // any notes
	//private Car type;
	
	public Offer(Type type, double price, String notes, int id) {
		this.type = type;
		this.price = price;
		this.notes = notes;
		this.id = id;
	}
	
	public Type getType() {
		return type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
