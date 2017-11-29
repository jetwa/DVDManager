package com.tc25.tools;

public class StringTools {

	/**
	 * 
	 * @param str 不确定要传递多少个String,所以使用可变参
	 * @return true代表参数全部合法,false代表至少有1个不合法
	 */
	public static boolean checkArgument(String... str) {
		if (str != null) {

		}
		for (String s : str) {
			if (s == null || s.length()==0) {
				return false;
			}
		}
		return true;
	}
}
