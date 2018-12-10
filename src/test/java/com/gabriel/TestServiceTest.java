package com.gabriel;

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