package com.tc25.view;

import com.tc25.biz.View;

public class UserLoginView implements View {

	@Override
	public void show(int index) {
		switch (index) {
		case 1:
			System.out.println("->�û���½");
			System.out.println("->0.������½��������һ��");
			System.out.println("��½�˺�->�������½�˺�:");
			break;
		case 2:
			System.out.println("��½����->�������½����");
			break;
		case 3:
			System.out.println("�����ڵ��˻�->");
			break;
		case 4:
			System.out.println("�������->");
			break;
		case 5:
			System.out.println("�Բ���,�����˻��ѱ�����");
			break;
		default:
			break;
		}
	}

}
