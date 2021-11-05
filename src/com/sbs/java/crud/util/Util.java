package com.sbs.java.crud.util;

import java.text.SimpleDateFormat; // 글 생성 시간 형태
import java.util.Date;

public class Util {
	public static String getNowDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date time = new Date();
				
		return format.format(time);
	}

}
