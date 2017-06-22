package com.chinasoft.planeticket.pojo;

/**
 * 机组人员
 * @author Administrator
 *
 */

public class Works {
    private int wid;
    private String wcaptain;
    private String wairline;
    private int Flight_fid;
    private String wplanenum;
    
    
	public String getWplanenum() {
		return wplanenum;
	}
	public void setWplanenum(String wplanenum) {
		this.wplanenum = wplanenum;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWcaptain() {
		return wcaptain;
	}
	public void setWcaptain(String wcaptain) {
		this.wcaptain = wcaptain;
	}
	public String getWairline() {
		return wairline;
	}
	public void setWairline(String wairline) {
		this.wairline = wairline;
	}
	public int getFlight_fid() {
		return Flight_fid;
	}
	public void setFlight_fid(int flight_fid) {
		Flight_fid = flight_fid;
	}
	@Override
	public String toString() {
		return "Works [wid=" + wid + ", wcaptain=" + wcaptain + ", wairline=" + wairline + ", Flight_fid=" + Flight_fid
				+ "]";
	}
    
    
}
