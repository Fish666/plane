package com.chinasoft.planeticket.pojo;

import java.sql.Date;

public class Plane {
	//出发时间 到达时间 出发地，目的地 航班号 每个舱座位数量 机票数量 航空公司
	private int fid;
	private String fplanenum;
	private Date fstartdate;
	private String fstartplace;
	private int fprice;
	private Date fenddate;
	private String fendplace;
	private String fcompany;
	private int fsitcount;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFplanenum() {
		return fplanenum;
	}
	public void setFplanenum(String fplanenum) {
		this.fplanenum = fplanenum;
	}
	public Date getFstartdate() {
		return fstartdate;
	}
	public void setFstartdate(Date fstartdate) {
		this.fstartdate = fstartdate;
	}
	public String getFstartplace() {
		return fstartplace;
	}
	public void setFstartplace(String fstartplace) {
		this.fstartplace = fstartplace;
	}
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public Date getFenddate() {
		return fenddate;
	}
	public void setFenddate(Date fenddate) {
		this.fenddate = fenddate;
	}
	public String getFendplace() {
		return fendplace;
	}
	public void setFendplace(String fendplace) {
		this.fendplace = fendplace;
	}
	public String getFcompany() {
		return fcompany;
	}
	public void setFcompany(String fcompany) {
		this.fcompany = fcompany;
	}
	public int getFsitcount() {
		return fsitcount;
	}
	public void setFsitcount(int fsitcount) {
		this.fsitcount = fsitcount;
	}
	@Override
	public String toString() {
		return "manager [fid=" + fid + ", fplanenum=" + fplanenum + ", fstartdate=" + fstartdate + ", fstartplace="
				+ fstartplace + ", fprice=" + fprice + ", fenddate=" + fenddate + ", fendplace=" + fendplace
				+ ", fcompany=" + fcompany + ", fsitcount=" + fsitcount + "]";
	}
	
}



