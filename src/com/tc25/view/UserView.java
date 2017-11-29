package com.tc25.view;

import com.tc25.bean.User;
import com.tc25.biz.View;

public class UserView implements View {

	private User nowUser;

	private void mainView() {
		System.out.println("登陆成功" 
				+ "\n当前用户:" + nowUser.getUserAccount() 
				+ "\n用户昵称:" + nowUser.getUserName() 
				+ "\n用户ID:"+ nowUser.getUserId() 
				+ "\n借出DVD数量:" + "");
	}

	public UserView(User nowUser) {
		super();
		this.nowUser = nowUser;
	}

	@Override
	public void show(int index) {
		switch (index) {
		case 0:
			break;
		case 1:
			mainView();
			break;
		case 2:
			menuView();
			break;
			
		default:
			break;
		}
	}

	private void menuView() {
		System.out.println("==============================");
		System.out.println("1.个人账户管理");
		System.out.println("2.查看DVD排行");
		System.out.println("3.查看可借DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("0.返回上一层");
	}

}
