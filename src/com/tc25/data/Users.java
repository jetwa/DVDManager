package com.tc25.data;

import java.util.*;

import com.tc25.bean.*;

public class Users {
	private HashMap<String,User> users;

	public Users() {
		super();
		users = new HashMap<>();
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
		add("aaa","123","123");
	}

	public void add(String userAccount, String userPwd, String userPwdTip) {
		users.put(userAccount,new User(userAccount, userAccount, userPwd, userPwdTip, false));
	}

	public HashMap<String,User> getUsers() {
		return users;
	}

}
