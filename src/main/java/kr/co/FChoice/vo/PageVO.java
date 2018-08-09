package kr.co.FChoice.vo;

public class PageVO {
	
	private int limit;
	private int pg;	
	private int start_pg;
	private int end_pg;
	private int total;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getStart_pg() {
		return start_pg;
	}
	public void setStart_pg(int start_pg) {
		this.start_pg = start_pg;
	}
	public int getEnd_pg() {
		return end_pg;
	}
	public void setEnd_pg(int end_pg) {
		this.end_pg = end_pg;
	}
	
	

}
