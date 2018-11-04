

package cn.tds.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tds.manager.dao.UserMapper;
import cn.tds.manager.pojo.User;
import cn.tds.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private UserMapper testMapper;

	@Override
	public String queryDate() {
		return this.testMapper.queryDate();
	}

	@Override
	public User findByAccount(String account) {
		// TODO Auto-generated method stub
		return testMapper.findByAccount(account);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return testMapper.addUser(user);
	}
}
