package com.afeng.log.service;

import java.util.Map;

import com.afeng.model.common.Page;
import com.afeng.model.log.Log;

public interface LogService {

	/**
	 * 保存日志
	 *
	 * @param log
	 */
	void save(Log log);

	Page<Log> findLogs(Map<String, Object> params);

}
