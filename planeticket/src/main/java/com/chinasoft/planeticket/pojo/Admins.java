package com.chinasoft.planeticket.pojo;

public class Admins {
  private int adid;
  private String adname;
  private String adpwd;
  private String adpowers;
public int getAdid() {
	return adid;
}
public void setAdid(int adid) {
	this.adid = adid;
}
public String getAdname() {
	return adname;
}
public void setAdname(String adname) {
	this.adname = adname;
}
public String getAdpwd() {
	return adpwd;
}
public void setAdpwd(String adpwd) {
	this.adpwd = adpwd;
}
public String getAdpowers() {
	return adpowers;
}
public void setAdpowers(String adpowers) {
	this.adpowers = adpowers;
}
@Override
public String toString() {
	return "Admins [adid=" + adid + ", adname=" + adname + ", adpwd=" + adpwd + ", adpowers=" + adpowers + "]";
}
  
  
}
