package com.gabriel.service.impl;
/*
 * Project: com.gabriel.service.impl
 *
 * File Created at 2018/11/20
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */

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
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/11/20 gabriel create
 */