package com.tc25.view;

import com.tc25.biz.View;

public class UserManageView implements View {

	public void showMainView() {
		System.out.println("����->�˻�����");
	}

	public void showMenuView() {

		System.out.println("1.�޸��ǳ�");
		System.out.println("2.�޸�����");
		System.out.println("3.�޸�������ʾ");
		System.out.println("0.������һ��");
	}

	public void showChangeNameView() {

		System.out.println("����->�޸��ǳ�");
		System.out.println("->�������µ��ǳ�:");
	}

	public void showChangePwdView(int index) {
		switch (index) {
		case 0:

			break;
		case 1:
			System.out.println("����->�޸�����");
			System.out.println("->������ԭ����:");
			break;
		case 2:
			System.out.println("->������������:");
			break;
		case 3:
			System.out.println("->��������һ��������:");
			break;
		case 4:
			System.out.println("->�����޸ĳɹ�.");
			break;
		case 5:
			System.out.println("���벻һ��,����������.");
			break;
		default:
			break;
		}
	}

	public void showChangePwdTipsView() {

		System.out.println("����->�޸�������ʾ");
		System.out.println("->��֤�û�����:");
	}

	public void showQuitView() {

		System.out.println("�뿪<-�˻�����");
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
			System.out.println("�뿪<-�˻�����");
			break;
		case MainView:
			System.out.println("����->�˻�����");
			break;
		case MenuView:
			System.out.println("1.�޸��ǳ�");
			System.out.println("2.�޸�����");
			System.out.println("3.�޸�������ʾ");
			System.out.println("0.������һ��");
			break;
		case ChangeNameView:
			System.out.println("����->�޸��ǳ�");
			System.out.println("->�������µ��ǳ�:");
			break;
		case ChangePwdView:
			System.out.println("����->�޸�����");
			System.out.println("->������ԭ����:");
			break;
		case ChangePwdTipsView:
			System.out.println("����->�޸�������ʾ");
			System.out.println("->��֤�û�����:");
			break;

		default:
			break;
		}
	}

}
