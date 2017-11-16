package com.acm.bean;

public class TeacherPrize {
    private String tacherid;

    private String teachernmae;

    private String prizename;

    private Integer number;

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
}