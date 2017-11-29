package com.tc25.view;

import com.tc25.biz.View;

public class RegisterView implements View {

	@Override
	public void show(int index) {
		switch (index) {
		case 1:
			System.out.println("->用户注册");
			System.out.println("->0.放弃注册并返回上一层");
			System.out.println("登陆账号->请输入登陆账号:");
			break;
		case 2:
			System.out.println("登陆密码->请输入登陆密码:");
			break;
		case 3:
			System.out.println("确认密码->请再输入一遍:");
			break;
		case 4:
			System.out.println("密码提示->请输入密码提示:");
			break;
		case 5:
			System.out.println("用户存在,请重新输入");
			break;
		case 6:
			System.out.println("格式不符合要求,请重新输入");
			break;
		default:
			break;
		}
	}

}
