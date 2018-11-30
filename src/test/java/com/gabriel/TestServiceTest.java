package com.gabriel;
/*
 * Project: com.gabriel
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author gabriel
 * @Type TestServiceTest
 * @Desc
 * @date 2018/11/20 15:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

	@Autowired
	private TestService testService;

	@Test
	public void test(){
		String str = "aa";
		Assert.assertEquals("aa_aa", testService.getTest(str));
//		assertThat(testService.getTest(str), equals("aa_aa"));
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