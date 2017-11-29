package com.tc25.bean;

import java.util.*;

/**
 * 
 * @Title : LendRecord.java
 * @Package : com.tc25.bean
 * @Description : 借出记录实体类
 * 
 * @Author Jet
 * @Date 2017年11月20日下午6:21:16
 * @Version 1.0
 */
class Test {
}

public class LendRecord implements Comparable<LendRecord> {
	private int lrId;
	private String lrNumber;
	private Date lendDate;
	private Date returnDate;
	private boolean lrStatus;
	private int dvdId;
	private String dvdName;

	/**
	 * 无参构造
	 */
	public LendRecord() {
		super();
	}

	@Override
	public String toString() {
		return "LendRecord [lrId=" + lrId + ", lrNumber=" + lrNumber + ", lendDate=" + lendDate + ", returnDate="
				+ returnDate + ", lrStatus=" + lrStatus + ", dvdId=" + dvdId + ", dvdName=" + dvdName + "]";
	}

	/**
	 * 全参构造(不含ID)
	 * 
	 * @param lrNumber
	 * @param lendDate
	 * @param returnDate
	 * @param lrStatus
	 * @param dvdId
	 * @param dvdName
	 */
	public LendRecord(String lrNumber, Date lendDate, Date returnDate, boolean lrStatus, int dvdId, String dvdName) {
		super();
		this.lrNumber = lrNumber;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
		this.lrStatus = lrStatus;
		this.dvdId = dvdId;
		this.dvdName = dvdName;
	}

	public int getLrId() {
		return lrId;
	}

	public void setLrId(int lrId) {
		this.lrId = lrId;
	}

	public String getLrNumber() {
		return lrNumber;
	}

	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isLrStatus() {
		return lrStatus;
	}

	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	@Override
	public int compareTo(LendRecord o) {
		return lendDate.compareTo(o.getLendDate());
		// return (o.getLendDate()).getTime() - lendDate.getTime() >0?-1:1;
	}

}
