package com.tc25.view;

import com.tc25.biz.View;

public class UserManageView implements View {

	public void showMainView() {
		System.out.println("进入->账户管理");
	}

	public void showMenuView() {

		System.out.println("1.修改昵称");
		System.out.println("2.修改密码");
		System.out.println("3.修改密码提示");
		System.out.println("0.返回上一层");
	}

	public void showChangeNameView() {

		System.out.println("进入->修改昵称");
		System.out.println("->请输入新的昵称:");
	}

	public void showChangePwdView(int index) {
		switch (index) {
		case 0:

			break;
		case 1:
			System.out.println("进入->修改密码");
			System.out.println("->请输入原密码:");
			break;
		case 2:
			System.out.println("->请输入新密码:");
			break;
		case 3:
			System.out.println("->请再输入一遍新密码:");
			break;
		case 4:
			System.out.println("->密码修改成功.");
			break;
		case 5:
			System.out.println("密码不一致,请重新输入.");
			break;
		default:
			break;
		}
	}

	public void showChangePwdTipsView() {

		System.out.println("进入->修改密码提示");
		System.out.println("->验证用户密码:");
	}

	public void showQuitView() {

		System.out.println("离开<-账户管理");
	}

	private static final int ChangePwdTipsView = 5;
	private static final int ChangePwdView = 4;
	private static final int ChangeNameView = 3;
	private static final int MenuView = 2;
	private static final int MainView = 1;
	private static final int Quit = 0;

	@Override
	public void show(int index) {
		switch (index) {
		case Quit:
			System.out.println("离开<-账户管理");
			break;
		case MainView:
			System.out.println("进入->账户管理");
			break;
		case MenuView:
			System.out.println("1.修改昵称");
			System.out.println("2.修改密码");
			System.out.println("3.修改密码提示");
			System.out.println("0.返回上一层");
			break;
		case ChangeNameView:
			System.out.println("进入->修改昵称");
			System.out.println("->请输入新的昵称:");
			break;
		case ChangePwdView:
			System.out.println("进入->修改密码");
			System.out.println("->请输入原密码:");
			break;
		case ChangePwdTipsView:
			System.out.println("进入->修改密码提示");
			System.out.println("->验证用户密码:");
			break;

		default:
			break;
		}
	}

}
