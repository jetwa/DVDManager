package com.tc25.view;

import com.tc25.biz.View;

public class MainView implements View {

	private void main() {
		System.out.println("==============================");
		System.out.println("    ��ӭʹ��Wo��DVD����ϵͳ   ");
	}

	private void menu() {
		System.out.println("==============================");
		System.out.println("1.�û���½");
		System.out.println("2.�û�ע��");
		System.out.println("3.����Ա��½");
		System.out.println("0.�˳�");
		System.out.print("->��ѡ��:");
	}

	private void exit() {
		System.out.println("==============================");
		System.out.println("   ��л����ʹ��,��ӭ�´ι���  ");
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
