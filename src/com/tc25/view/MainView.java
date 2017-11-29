package com.tc25.view;

import com.tc25.biz.View;

public class MainView implements View {

	private void main() {
		System.out.println("==============================");
		System.out.println("    欢迎使用Wo的DVD管理系统   ");
	}

	private void menu() {
		System.out.println("==============================");
		System.out.println("1.用户登陆");
		System.out.println("2.用户注册");
		System.out.println("3.管理员登陆");
		System.out.println("0.退出");
		System.out.print("->请选择:");
	}

	private void exit() {
		System.out.println("==============================");
		System.out.println("   感谢您的使用,欢迎下次光临  ");
	}

	@Override
	public void show(int index) {
		switch (index) {
		case 0:
			exit();
			break;
		case 1:
			main();
			break;
		case 2:
			menu();
			break;
		default:
			break;
		}
	}
}
