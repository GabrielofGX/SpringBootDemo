package com.gabriel.service.impl;

import com.gabriel.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author gabriel
 * @Type TestServiceImpl
 * @Desc
 * @date 2018/11/20 16:12
 */
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String getTest(String str) {
		return str + "_" + str;
	}

}