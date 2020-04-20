package com.afeng.backend.service;

import java.util.Map;

import com.afeng.backend.model.BlackIP;
import com.afeng.model.common.Page;

public interface BlackIPService {

	void save(BlackIP blackIP);

	void delete(String ip);

	Page<BlackIP> findBlackIPs(Map<String, Object> params);

}
