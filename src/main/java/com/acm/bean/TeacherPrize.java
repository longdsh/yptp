package com.acm.bean;

import com.sargeraswang.util.ExcelUtil.ExcelCell;

public class TeacherPrize {

	@ExcelCell(index = 0)
	private String tacherid;
	@ExcelCell(index = 1)
	private String teachernmae;
	@ExcelCell(index = 2)
	private String prizename;
	@ExcelCell(index = 3)
	private Integer number;

	public TeacherPrize() {
		// TODO Auto-generated constructor stub
	}

	public TeacherPrize(String tacherid, String teachernmae, String prizename, Integer number) {
		super();
		this.tacherid = tacherid;
		this.teachernmae = teachernmae;
		this.prizename = prizename;
		this.number = number;
	}

	public String getTacherid() {
		return tacherid;
	}

	public void setTacherid(String tacherid) {
		this.tacherid = tacherid == null ? null : tacherid.trim();
	}

	public String getTeachernmae() {
		return teachernmae;
	}

	public void setTeachernmae(String teachernmae) {
		this.teachernmae = teachernmae == null ? null : teachernmae.trim();
	}

	public String getPrizename() {
		return prizename;
	}

	public void setPrizename(String prizename) {
		this.prizename = prizename == null ? null : prizename.trim();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "TeacherPrize [tacherid=" + tacherid + ", teachernmae=" + teachernmae + ", prizename=" + prizename
				+ ", number=" + number + "]";
	}

}