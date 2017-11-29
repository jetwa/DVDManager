package com.tc25.bean;

/**
 * 
 * @Title : User.java
 * @Package : com.tc25.bean
 * @Description : Userʵ����
 * 
 * @Author Jet
 * @Date 2017��11��20������6:00:39
 * @Version 1.0
 */
public class User {

	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userName=" + userName + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}

	private String userAccount;
	private String userName;
	private int userId;
	private String userPwd;
	private String userPwdTip;
	private boolean userStatus;
	private int errorCount;

	/**
	 * �޲ι���
	 */
	public User() {
		super();
	}

	/**
	 * ȫ�ι���(����ID)
	 * 
	 * @param userAccount
	 * @param userName
	 * @param userPwd
	 * @param userPwdTip
	 * @param userStatus
	 */
	public User(String userAccount, String userName, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
		errorCount = 0;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserPwdTip() {
		return userPwdTip;
	}

	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}

	public boolean isUserStatus() {
		return userStatus;
	}

	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

}
