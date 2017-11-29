package com.tc25.bizImpl;

import com.tc25.bean.User;
import com.tc25.biz.View;
import com.tc25.tools.Input;
import com.tc25.view.UserManageView;
import com.tc25.view.UserView;

/**
 * 普通用户的DVD管理器业务
 * 
 * @author Jet
 *
 */
public class userManager {
	private User nowUser;
	private boolean isContinue;
	private View uv;

	public userManager(User nowUser) {
		this.nowUser = nowUser;
		isContinue = true;
		uv = new UserView(nowUser);
	}

	public void run() {
		int choose = 0;
		uv.show(0);
		while (isContinue) {
			uv.show(1);
			choose = (Input.getInstance()).getInt(0, 5);
			switch (choose) {
			case 0:
				uv.show(0);
				isContinue = false;
				break;
			case 1:
				userManage();
				break;
			case 2:
				prtDVDRank();
				break;
			case 3:
				prtLendable();
				break;
			case 4:
				lendDVD();
				break;
			case 5:
				returnDVD();
				break;
			default:
				break;
			}
		}
	}

	private void returnDVD() {
		// TODO Auto-generated method stub

	}

	private void lendDVD() {
		// TODO Auto-generated method stub

	}

	private void prtLendable() {
		// TODO Auto-generated method stub

	}

	private void userManage() {
		UserManageView umv = new UserManageView();
		int choose = 0;
		boolean isContinue = true;
		umv.showMainView();
		while (isContinue) {
			umv.showMenuView();
			choose = (Input.getInstance()).getInt(0, 5);
			switch (choose) {
			case 0:
				umv.showQuitView();
				isContinue = false;
				break;
			case 1:
				umv.showChangeNameView();
				String name = Input.getInstance().getString();
				nowUser.setUserName(name);
				break;
			case 2:
				umv.showChangePwdView(1);
				String pwd = Input.getInstance().getString();
				if (nowUser.getUserPwd().equals(pwd)) {
					int temp = 0;
					while (temp < 3) {
						umv.show(2);
						pwd = Input.getInstance().getString();
						umv.show(3);
						String pwdC = Input.getInstance().getString();
						if (pwd.equals(pwdC)) {
							nowUser.setUserPwd(pwd);
							break;
						} else {
							umv.showChangePwdView(5);
							temp++;
						}
					}
				}
				changePwd();
				break;
			case 3:
				umv.showChangePwdTipsView();
				changePwdTips();
				break;
			default:
				break;
			}
		}
	}

	private void changePwdTips() {
		// TODO Auto-generated method stub

	}

	private void changePwd() {
		// TODO Auto-generated method stub

	}

	private void changeName() {

	}

	private void prtDVDRank() {
		// TODO Auto-generated method stub

	}
}
