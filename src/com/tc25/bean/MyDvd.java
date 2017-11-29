package com.tc25.bean;

import java.util.*;

import com.tc25.tools.*;

/**
 * 
 * @Title : DVD.java
 * @Package : com.tc25.bean
 * @Description : DVD实体类
 * 
 * @Author Jet
 * @Date 2017年11月20日下午5:58:40
 * @Version 1.0
 */

public class MyDvd {
	private String dvdName;
	private int dvdId;
	private Date dvdData;
	private int dvdStatus;
	private int dvdLendCount;

	/**
	 * 无参构造
	 */
	public MyDvd() {
		super();
	}

	/**
	 * 全参构造(不含ID)
	 * 
	 * @param dvdName
	 * @param dvdDate
	 * @param dvdStatus
	 * @param dvdLendCount
	 */
	public MyDvd(String dvdName, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdData = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
		this.dvdId = NewDvdId.getInstance().getId();
	}

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public Date getDvdData() {
		return dvdData;
	}

	public void setDvdData(Date dvdData) {
		this.dvdData = dvdData;
	}

	public int getDvdStatus() {
		return dvdStatus;
	}

	public void setDvdStatus(int dvdStatus) {
		this.dvdStatus = dvdStatus;
	}

	public int getDvdLendCount() {
		return dvdLendCount;
	}

	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}

	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdId=" + dvdId + ", dvdData=" + dvdData + ", dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}

}
