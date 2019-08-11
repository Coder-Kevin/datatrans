package org.data.common.util;

public final class StringUtil {

	private StringUtil(){}

	public static boolean isEmpty(String str) {
		return !isNotEmpty(str);
	}
	
	public static boolean isNotEmpty(String str) {
		return str != null && str.length()>0;
	}
}
