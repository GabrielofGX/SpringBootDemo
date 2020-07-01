package com.gabriel.controller;

import com.alibaba.fastjson.JSONObject;
import com.gabriel.dto.User;
import com.gabriel.service.TestService;
import org.jasypt.encryption.StringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author gabriel
 * @email 996492571@qq.com
 * @date 2018/8/7 17:02
 * @desc
 */
@RestController
public class TestController {
	@Autowired
	private HttpServletResponse response;

	@Autowired
	private StringEncryptor encryptor;

	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@PostMapping("/test")
	private String test(@RequestBody JSONObject request){
		log.info(request.toString());
		String password = request.getString("password");
        String result = encryptor.decrypt(password);
		return result;
	}

	@PostMapping("/user")
	private User create(@RequestBody User user){
		user.setName("aa");
		User user2 = new User(1,"a", 2);
		return user;
	}



}
