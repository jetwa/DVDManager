package com.tc25.tools;

import java.util.*;

/**
 * 
 * @Title : Input.java
 * @Package : com.tc25.tools
 * @Description : TODO
 * 
 * @Author Jet
 * @Date 2017年11月21日下午12:08:33
 * @Version 1.0
 */
public class Input {
	private Scanner s;
	private static Input input;

	private Input() {
		s = new Scanner(System.in);
		input = this;
	}

	public int getInt(int min, int max) {
		int temp = Integer.valueOf(s.next());
		if (Integer.valueOf(temp) >= min && Integer.valueOf(temp) <= max) {
			return temp;
		}
		return -1;
	}

	public static Input getInstance() {
		return input == null ? new Input() : input;
	}

	public String getString() {
		return s.next();
	}

}
