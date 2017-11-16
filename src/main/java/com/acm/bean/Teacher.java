package com.acm.bean;

import com.xuxueli.poi.excel.annotation.ExcelField;
import com.xuxueli.poi.excel.annotation.ExcelSheet;

@ExcelSheet(name = "名单")
public class Teacher {
	@ExcelField(name = "工号")
    private String id;
    @ExcelField(name= " 姓名 ")
    private String name;
    @ExcelField(name= " 金额 ")
    private Integer money;

    
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

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
    
    
}