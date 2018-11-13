package com.gabriel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gabriel
 * @email 996492571@qq.com
 * @date 2018/8/7 17:02
 * @desc
 */
@RestController
public class TestController {

	@GetMapping("/test")
	private String test(String name){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return name + "_" + name;
	}
}
