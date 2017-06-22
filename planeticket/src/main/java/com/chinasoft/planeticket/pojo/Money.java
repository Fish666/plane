package com.chinasoft.planeticket.pojo;

public class Money{
    private Integer mid;
    private String mbankid;
    private String moneys;
    private String mlevel;
    private String mcashcoupon;
    
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMbankid() {
		return mbankid;
	}
	public void setMbankid(String mbankid) {
		this.mbankid = mbankid;
	}
	public String getMoneys() {
		return moneys;
	}
	public void setMoneys(String moneys) {
		this.moneys = moneys;
	}
	public String getMlevel() {
		return mlevel;
	}
	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}
	public String getMcashcoupon() {
		return mcashcoupon;
	}
	public void setMcashcoupon(String mcashcoupon) {
		this.mcashcoupon = mcashcoupon;
	}
	
	@Override
	public String toString() {
		return "Money [mid=" + mid + ", mbankid=" + mbankid + ", moneys=" + moneys + ", mlevel=" + mlevel
				+ ", mcashcoupon=" + mcashcoupon + "]";
	}
	
    
}