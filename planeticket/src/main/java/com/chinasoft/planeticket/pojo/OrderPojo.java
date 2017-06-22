package com.chinasoft.planeticket.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderPojo {
	private int oid;
	/**
	 * 订单名字
	 */
	private String oname;
	/**
	 * 订单类型
	 */
	private String ostatus;
	/**
	 * 订单号
	 */
	private String onumber;
	/**
	 * 订单创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date oDate;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOstatus() {
		return ostatus;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public String getOnumber() {
		return onumber;
	}
	public void setOnumber(String onumber) {
		this.onumber = onumber;
	}
	@Override
	public String toString() {
		return "OrderPojo [oid=" + oid + ", oDate=" + oDate + ", oname=" + oname + ", ostatus=" + ostatus + ", onumber="
				+ onumber + "]";
	}
	
}
