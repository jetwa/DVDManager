package com.tc25.tools;

public class StringTools {

	/**
	 * 
	 * @param str ��ȷ��Ҫ���ݶ��ٸ�String,����ʹ�ÿɱ��
	 * @return true�������ȫ���Ϸ�,false����������1�����Ϸ�
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
