package com.afeng.notification.service;

import java.util.Map;

import com.afeng.notification.model.Sms;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.afeng.model.common.Page;

public interface SmsService {

	void save(Sms sms, Map<String, String> params);

	void update(Sms sms);

	Sms findById(Long id);

	Page<Sms> findSms(Map<String, Object> params);

	/**
	 * 发送短信
	 */
	SendSmsResponse sendSmsMsg(Sms sms);
}
