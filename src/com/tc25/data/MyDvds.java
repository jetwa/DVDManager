package com.tc25.data;

import java.util.*;

import com.tc25.bean.*;

/**
 * 
 * @Title : DVDs.java
 * @Package : com.tc25.data
 * @Description : DVD������
 * 
 * @Author Jet
 * @Date 2017��11��20������6:21:39
 * @Version 1.0
 */

public class MyDvds {
	private ArrayList<MyDvd> myDvds;

	public MyDvds() {
		super();
		myDvds = new ArrayList<>();
		add("��Գ̩ɽ");
		add("��Գ̩ɽ");
		add("��Գ̩ɽ");
		add("��Գ̩ɽ2");
		add("��Գ̩ɽ2");
		add("��Գ̩ɽ2");
		add("��Գ̩ɽ3");
		add("��Գ̩ɽ3");
		add("��Գ̩ɽ3");
		add("��Գ̩ɽ4");
	}

	public void add(String dvdName) {
		myDvds.add(new MyDvd(dvdName, new Date(), 1, 0));

	}

	public ArrayList<MyDvd> getMyDvds() {
		return myDvds;
	}
}