package cn.tds.manager.dao;

import cn.tds.manager.pojo.User;

public interface UserMapper {

	/**
	 * 从数据库获取当前时间
	 * @return
	 */
	String queryDate();
	int addUser(User user);
	User findByAccount(String account);
	
	
}
