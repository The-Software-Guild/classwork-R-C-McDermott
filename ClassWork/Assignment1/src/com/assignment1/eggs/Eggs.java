package com.assignment1.eggs;

public class Eggs {
	private int eggs;
	private int dozen;
	private int gross;
	private int remainingEggs;
	
	public Eggs(int eggs) {
		this.eggs = eggs;
		this.setGross();
		this.setDozen();
		this.setRemainingEggs();
	}
	
	public int getEggs() {
		return eggs;
	}
	
	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	
	public int getDozen() {
		return dozen;	
	}
	
	public void setDozen() {
		this.dozen = eggs / 12 - ((144 / 12) * gross);
	}
	
	public int getGross() {
		return gross;
	}
	
	public void setGross() {
		this.gross = this.eggs / 144;
	}
	
	public int getRemainingEggs() {
		return remainingEggs;
	}
	
	public void setRemainingEggs() {
		this.remainingEggs = eggs - (12 * dozen) - (144 * gross);
	}
}
