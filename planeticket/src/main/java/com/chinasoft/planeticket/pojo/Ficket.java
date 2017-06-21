package com.chinasoft.planeticket.pojo;

import java.sql.Time;

public class Ficket {
	/**
	 * id
	 */
	private int tid; 
	/**
	 * 出发地
	 */
	private String tstartplace; 
	/**
	 * 到达地
	 */
	private String tendplace;
	/**
	 * 仓位
	 */
	private String tcabin;
	/**
	 * 日期
	 */
	private String tdate;
	/**
	 * 时间
	 */
	private Time times;
	/**
	 * 座位
	 */
	private String tsit;
	/**
	 * 儿童
	 */
	private String tchildren;
	/**
	 * 婴儿
	 */
	private String tbaby;
	/**
	 * 价格
	 */
	private String tprice;
	/**
	 * 乘客姓名
	 */
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTstartplace() {
		return tstartplace;
	}
	public void setTstartplace(String tstartplace) {
		this.tstartplace = tstartplace;
	}
	public String getTendplace() {
		return tendplace;
	}
	public void setTendplace(String tendplace) {
		this.tendplace = tendplace;
	}
	public String getTcabin() {
		return tcabin;
	}
	public void setTcabin(String tcabin) {
		this.tcabin = tcabin;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public Time getTimes() {
		return times;
	}
	public void setTimes(Time time) {
		this.times = time;
	}
	public String getTsit() {
		return tsit;
	}
	public void setTsit(String tsit) {
		this.tsit = tsit;
	}
	public String getTchildren() {
		return tchildren;
	}
	public void setTchildren(String tchildren) {
		this.tchildren = tchildren;
	}
	public String getTbaby() {
		return tbaby;
	}
	public void setTbaby(String tbaby) {
		this.tbaby = tbaby;
	}
	public String getTprice() {
		return tprice;
	}
	public void setTprice(String tprice) {
		this.tprice = tprice;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Ficket [tid=" + tid + ", tstartplace=" + tstartplace + ", tendplace=" + tendplace + ", tcabin=" + tcabin
				+ ", tdate=" + tdate + ", time=" + times + ", tsit=" + tsit + ", tchildren=" + tchildren + ", tbaby="
				+ tbaby + ", tprice=" + tprice + ", tname=" + tname + "]";
	}
	
	
	
}



