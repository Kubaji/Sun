package com.baizhi.zbw.dto;

public class Column {

	private Man man;
	private Woman woman;
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	@Override
	public String toString() {
		return "Column [man=" + man + ", woman=" + woman + "]";
	}
	
}
