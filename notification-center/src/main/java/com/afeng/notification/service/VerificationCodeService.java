package com.afeng.notification.service;

import com.afeng.notification.model.VerificationCode;

public interface VerificationCodeService {

	VerificationCode generateCode(String phone);

	String matcheCodeAndGetPhone(String key, String code, Boolean delete, Integer second);
}
