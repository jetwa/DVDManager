package com.tc25.view;

import com.tc25.bean.User;
import com.tc25.biz.View;

public class UserView implements View {

	private User nowUser;

	private void mainView() {
		System.out.println("��½�ɹ�" 
				+ "\n��ǰ�û�:" + nowUser.getUserAccount() 
				+ "\n�û��ǳ�:" + nowUser.getUserName() 
				+ "\n�û�ID:"+ nowUser.getUserId() 
				+ "\n���DVD����:" + "");
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
		System.out.println("1.�����˻�����");
		System.out.println("2.�鿴DVD����");
		System.out.println("3.�鿴�ɽ�DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("0.������һ��");
	}

}
