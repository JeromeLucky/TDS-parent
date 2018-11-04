package cn.tds.manager.service;

import cn.tds.manager.pojo.User;

public interface TestService {
	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	String queryDate();
	User findByAccount(String account);
	int addUser(User user);
}

