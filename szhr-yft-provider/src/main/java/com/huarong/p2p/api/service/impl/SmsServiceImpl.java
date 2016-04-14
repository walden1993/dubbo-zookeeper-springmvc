package com.huarong.p2p.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huarong.p2p.api.service.SmsService;
/**
 * 短信发送接口实现
 * @author he
 *
 * 2016年4月14日
 */
@Service(protocol="dubbo",async=true)
public class SmsServiceImpl implements SmsService {
	
	@Override
	public boolean checkTemplate(String template){
		if ("template".equals(template)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean sendSms(String defaultMessage, String template,
			boolean isVoice) {
		return true;
	}
	
	@Override
	public boolean sendSms(String defaultMsgOrTemplate, boolean isVoice) {
		boolean result = false;
		if (checkTemplate(defaultMsgOrTemplate)) {
			result = sendSms(null, defaultMsgOrTemplate, isVoice);
		}else {
			result = sendSms(defaultMsgOrTemplate, null, isVoice);
		}
		return result;
	}

}
