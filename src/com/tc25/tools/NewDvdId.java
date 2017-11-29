package com.tc25.tools;

/**
 * 
 * @Title : NewDvdId.java
 * @Package : com.tc25.tools
 * @Description : 获取DvdId
 * 
 * @Author Jet
 * @Date 2017年11月20日下午8:17:00
 * @Version 1.0
 */
public class NewDvdId {
	private int id;
	private static NewDvdId newDvdId;

	private NewDvdId() {
		newDvdId = this;
	}

	public int getId() {
		return ++id;
	}

	public static NewDvdId getInstance() {
		return newDvdId == null ? (new NewDvdId()) : newDvdId;
	}

}
