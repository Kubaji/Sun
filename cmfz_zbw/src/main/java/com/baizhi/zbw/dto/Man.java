package com.baizhi.zbw.dto;

import java.util.List;

public class Man {

	private List<String> month;
	private List<Integer> count;
	public List<String> getMonth() {
		return month;
	}
	public void setMonth(List<String> month) {
		this.month = month;
	}
	public List<Integer> getCount() {
		return count;
	}
	public void setCount(List<Integer> count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Man [month=" + month + ", count=" + count + "]";
	}
	
}
