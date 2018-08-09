package kr.co.FChoice.vo;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int fc_seq;
	private int fc_parent;
	private int fc_comment;
	private String fc_cat;
	private String fc_subject;
	private String fc_content;
	private int fc_file;
	private MultipartFile fileName;
	private int fc_hit;
	private String fc_id;
	private String fc_ip;
	private String fc_rdate;
	private int total;
	private int limit;
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getFc_seq() {
		return fc_seq;
	}
	public void setFc_seq(int fc_seq) {
		this.fc_seq = fc_seq;
	}
	public int getFc_parent() {
		return fc_parent;
	}
	public void setFc_parent(int fc_parent) {
		this.fc_parent = fc_parent;
	}
	public int getFc_comment() {
		return fc_comment;
	}
	public void setFc_comment(int fc_comment) {
		this.fc_comment = fc_comment;
	}
	public String getFc_cat() {
		return fc_cat;
	}
	public void setFc_cat(String fc_cat) {
		this.fc_cat = fc_cat;
	}
	public String getFc_subject() {
		return fc_subject;
	}
	public void setFc_subject(String fc_subject) {
		this.fc_subject = fc_subject;
	}
	public String getFc_content() {
		return fc_content;
	}
	public void setFc_content(String fc_content) {
		this.fc_content = fc_content;
	}
	public int getFc_file() {
		return fc_file;
	}
	public void setFc_file(int fc_file) {
		this.fc_file = fc_file;
	}
	public MultipartFile getFileName() {
		return fileName;
	}
	public void setFileName(MultipartFile fileName) {
		this.fileName = fileName;
	}
	public int getFc_hit() {
		return fc_hit;
	}
	public void setFc_hit(int fc_hit) {
		this.fc_hit = fc_hit;
	}
	public String getFc_id() {
		return fc_id;
	}
	public void setFc_id(String fc_id) {
		this.fc_id = fc_id;
	}
	public String getFc_ip() {
		return fc_ip;
	}
	public void setFc_ip(String fc_ip) {
		this.fc_ip = fc_ip;
	}
	public String getFc_rdate() {
		return fc_rdate;
	}
	public void setFc_rdate(String fc_rdate) {
		this.fc_rdate = fc_rdate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	

}
