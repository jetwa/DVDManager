package com.tc25.data;

import java.util.*;

import com.tc25.bean.*;

/**
 * 
 * @Title : DVDs.java
 * @Package : com.tc25.data
 * @Description : DVD集合类
 * 
 * @Author Jet
 * @Date 2017年11月20日下午6:21:39
 * @Version 1.0
 */

public class MyDvds {
	private ArrayList<MyDvd> myDvds;

	public MyDvds() {
		super();
		myDvds = new ArrayList<>();
		add("人猿泰山");
		add("人猿泰山");
		add("人猿泰山");
		add("人猿泰山2");
		add("人猿泰山2");
		add("人猿泰山2");
		add("人猿泰山3");
		add("人猿泰山3");
		add("人猿泰山3");
		add("人猿泰山4");
	}

	public void add(String dvdName) {
		myDvds.add(new MyDvd(dvdName, new Date(), 1, 0));

	}

	public ArrayList<MyDvd> getMyDvds() {
		return myDvds;
	}
}