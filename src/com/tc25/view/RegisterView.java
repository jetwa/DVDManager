package com.tc25.view;

import com.tc25.biz.View;

public class RegisterView implements View {

	@Override
	public void show(int index) {
		switch (index) {
		case 1:
			System.out.println("->�û�ע��");
			System.out.println("->0.����ע�Ტ������һ��");
			System.out.println("��½�˺�->�������½�˺�:");
			break;
		case 2:
			System.out.println("��½����->�������½����:");
			break;
		case 3:
			System.out.println("ȷ������->��������һ��:");
			break;
		case 4:
			System.out.println("������ʾ->������������ʾ:");
			break;
		case 5:
			System.out.println("�û�����,����������");
			break;
		case 6:
			System.out.println("��ʽ������Ҫ��,����������");
			break;
		default:
			break;
		}
	}

}
