package com.tc25.bizImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tc25.bean.User;
import com.tc25.biz.View;
import com.tc25.data.Users;
import com.tc25.tools.Input;
import com.tc25.view.MainView;
import com.tc25.view.RegisterView;
import com.tc25.view.UserLoginView;

public class Manager {
	View mv, ulv, rv, adv;
	Users users;
	int choose;
	String acc, pwd, conPwd, pwdTip;
	boolean excecuteIsContinue;
	Pattern p;
	Matcher m;

	public Manager() {
		mv = new MainView();
		rv = new RegisterView();
		ulv = new UserLoginView();
		choose = -1;
		excecuteIsContinue = true;
		users = new Users();
	}

	public void run() {
		while (excecuteIsContinue) {
			mv.show(1);
			mv.show(2);
			choose = (Input.getInstance()).getInt(0, 3);
			switch (choose) {
			default:
				break;
			case 0:
				mv.show(0);
				break;
			case 1:
				User temp = null;
				if (null != (temp = userLogin())) {
					new userManager(temp).run();
				}
				;
				break;
			case 2:
				register();
				break;
			case 3:
				break;
			}
		}
	}

	public User userLogin() {
		int index = 1;
		boolean isContinue = true;
		User nowUser = null;
		while (isContinue) {
			switch (index) {
			case 1:
				ulv.show(1);
				acc = (Input.getInstance()).getString();
				if (!users.getUsers().containsKey(acc)) {
					ulv.show(3);
					index = 1;
				} else {
					nowUser = users.getUsers().get(acc);
					if (nowUser.getErrorCount() > 5) {
						ulv.show(5);
						isContinue = false;
					} else {
						index = 2;
					}
				}
				break;
			case 2:
				ulv.show(2);
				pwd = (Input.getInstance()).getString();
				if (pwd.equals(nowUser.getUserPwd())) {
					isContinue = false;
					// 登陆成功,重置锁定计数
					nowUser.setErrorCount(0);
					return nowUser;
				} else if (nowUser.getErrorCount() < 5) {
					ulv.show(4);
					nowUser.setErrorCount(nowUser.getErrorCount() + 1);
					index = 2;
					if (nowUser.getErrorCount() >= 3) {
						final int tempInt = nowUser.getErrorCount();
						final String tempString = nowUser.getUserPwdTip();
						new View() {
							@Override
							public void show(int index) {
								System.out.println("您已连续输错" + tempInt + "次,错误5次将锁定账户");
								System.out.println("提示:" + tempString);
							}
						}.show(1);
					}
				} else {
					nowUser.setUserStatus(true);
					ulv.show(5);
				}
				break;
			default:
				break;
			}
		}
		return null;
	}

	public void register() {
		int index = 1;
		boolean isContinue = true;
		while (isContinue) {
			switch (index) {
			case 1:
				rv.show(1);
				acc = (Input.getInstance()).getString();
				p = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9_.]{5,15}");
				m = p.matcher(acc);
				if ((users.getUsers()).containsKey(acc)) {
					rv.show(5);
					index = 1;
				} else if ("0".equals(acc)) {
					isContinue = false;
				} else if (m.matches()) {
					index = 2;
				} else {
					rv.show(6);
				}
				break;
			case 2:
				rv.show(2);
				pwd = (Input.getInstance()).getString();
				p = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9_.*]{5,15}");
				m = p.matcher(pwd);
				if ("0".equals(pwd)) {
					isContinue = false;
				} else if (m.matches()) {
					index = 3;
				} else {
					rv.show(6);
				}
				break;
			case 3:
				rv.show(3);
				conPwd = (Input.getInstance()).getString();
				if ("0".equals(conPwd)) {
					isContinue = false;
				} else if (conPwd.equals(pwd)) {
					index = 4;
				} else {
					index = 2;
					pwd = "";
					conPwd = "";
				}
				break;
			case 4:
				rv.show(4);
				pwdTip = (Input.getInstance()).getString();
				if ("0".equals(pwdTip)) {
					isContinue = false;
				} else {
					isContinue = false;
				}
				users.add(acc, pwd, pwdTip);
				System.out.println(users.getUsers().get(acc));
				break;
			default:
				break;
			}
		}
		acc = "";
		pwd = "";
		conPwd = "";
		pwdTip = "";
	}

}
