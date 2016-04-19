package com.huarong.p2p.api.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.huarong.p2p.api.mybatis.model.SendSms;
import com.huarong.p2p.api.service.SendSmsService;

public class SendSmsServiceImpl  implements SendSmsService {/*

	@Override
	public int checkSendSmsCount(String startTime, String endTime, String mobile) {
		Map<String, String> sqlParam = new HashMap<String, String>();
		sqlParam.put("startTime", startTime);
		sqlParam.put("endTime", endTime);
		sqlParam.put("mobile", mobile);
		return dataAccessor.selectOne("com.huarong.p2p.api.mybatis.inter.SendSmsMapper.checkSendSmsCount", sqlParam);
	}

	@Override
	public int insertSendSms(SendSms sendSms) {
		return dataAccessor.insert("com.huarong.p2p.api.mybatis.inter.SendSmsMapper.insertSendSms", sendSms);
	}

*/}
