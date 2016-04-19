package com.huarong.p2p.api.mybatis.mapper;

import com.huarong.p2p.api.mybatis.model.SmsConfig;

public interface SmsConfigMapper {
    SmsConfig selectByPrimaryKey(Integer id);
}