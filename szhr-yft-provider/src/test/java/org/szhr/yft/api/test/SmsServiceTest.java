package org.szhr.yft.api.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.huarong.p2p.api.service.SmsService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring.xml") 
@Transactional
public class SmsServiceTest {
	SmsService smsService;
}
