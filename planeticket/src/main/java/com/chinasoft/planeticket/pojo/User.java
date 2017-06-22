package com.chinasoft.planeticket.pojo;

import java.sql.Date;

public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String urealname;
	private String usex;
	private int uage;
	private Date ubirthday;
	private String uidnum;
	private String uemail;
	private String uphone;
	
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUrealname() {
		return urealname;
	}
	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	public String getUidnum() {
		return uidnum;
	}
	public void setUidnum(String uidnum) {
		this.uidnum = uidnum;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", urealname=" + urealname + ", usex="
				+ usex + ", uage=" + uage + ", ubirthday=" + ubirthday + ", uidnum=" + uidnum + ", uemail=" + uemail
				+ ", uphone=" + uphone + ", money_mid=" + "]";
	}
	
	
}	
