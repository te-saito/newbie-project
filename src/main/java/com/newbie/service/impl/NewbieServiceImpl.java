package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService;

@Service
public class NewbieServiceImpl implements NewbieService {

	@Override
	public String getMessage(String message) {
		// 文字列を反転させて返すよ
		StringBuffer sb = new StringBuffer(message);
        message = sb.reverse().toString();

        return message;
	}

	@Override
	public String getBlackOut(String message){
		// 文字列のアルファベットを伏字にするよ
		message = message.replaceAll("[a-z]", "-");
		return message;
	}

}
