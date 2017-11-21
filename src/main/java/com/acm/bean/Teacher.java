package com.acm.bean;

import java.util.HashMap;
import java.util.Map;

import com.sargeraswang.util.ExcelUtil.ExcelCell;

public class Teacher {
	 @ExcelCell(index = 0)
    private String id;
	 
	 @ExcelCell(index = 1)
    private String name;
	 
	 @ExcelCell(index = 2)
    private Integer money;

	 private Map<String, Object> con = new HashMap<>();
    
    public Teacher() {
		super();
	}


	public Teacher(String id, String name, Integer money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}


	public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    
    

	public Map<String, Object> getCon() {
		return con;
	}


	public void setCon(Map<String, Object> con) {
		this.con = con;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
    
    
}