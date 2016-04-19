package com.huarong.p2p.api.service;

import javax.validation.constraints.NotNull;

import com.huarong.p2p.api.mybatis.model.User;
import com.huarong.p2p.api.param.LoginParam;

/**
 * 用户服务接口
 * @author he
 *
 * 2016年4月15日
 */
public interface UserService {
	
	public User login(@NotNull LoginParam loginParam,String lastIP) throws Exception;
	
}
