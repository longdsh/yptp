package com.acm.bean;

import java.util.HashMap;
import java.util.Map;

import com.sargeraswang.util.ExcelUtil.ExcelCell;

public class Prize {
	 @ExcelCell(index = 0)
    private String name;
	 @ExcelCell(index = 1)
    private Integer price;
	 @ExcelCell(index = 2)
    private Integer number;
    
    Map<String, Object> con = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

	public Map<String, Object> getCon() {
		return con;
	}

	public void setCon(Map<String, Object> con) {
		this.con = con;
	}
    
    
}