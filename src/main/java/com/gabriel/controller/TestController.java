package com.gabriel.controller;

import com.gabriel.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gabriel
 * @email 996492571@qq.com
 * @date 2018/8/7 17:02
 * @desc
 */
@RestController
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@PostMapping("/test2")
	private String test2(@RequestBody String request){
		log.info(request);
		return testService.getTest(request);
	}
}
