package com.tds.manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.tds.manager.pojo.User;
import cn.tds.manager.service.TestService;

@Controller
@RequestMapping("/dsManager")
public class TestController {
	@Autowired
	private TestService testService;
	@ResponseBody
	@RequestMapping("/test.do")
		public String queryTime() {
			
			return testService.queryDate();
					
		}
	@ResponseBody
	@RequestMapping("/add.do")
	public int addUser(User user) {
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String encodePassword=passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		return testService.addUser(user);
				
	}
	
	
}
