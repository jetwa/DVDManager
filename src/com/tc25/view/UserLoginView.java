package com.tc25.view;

import com.tc25.biz.View;

public class UserLoginView implements View {

	@Override
	public void show(int index) {
		switch (index) {
		case 1:
			System.out.println("->用户登陆");
			System.out.println("->0.放弃登陆并返回上一层");
			System.out.println("登陆账号->请输入登陆账号:");
			break;
		case 2:
			System.out.println("登陆密码->请输入登陆密码");
			break;
		case 3:
			System.out.println("不存在的账户->");
			break;
		case 4:
			System.out.println("密码错误->");
			break;
		case 5:
			System.out.println("对不起,您的账户已被锁定");
			break;
		default:
			break;
		}
	}

}
