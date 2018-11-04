package com.tds.manager.userDatil;


import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.tds.manager.service.TestService;

public class UserDatailServiceImpl implements UserDetailsService {

	//调用dubbo的远程服务提供者 的接口
	private  TestService testService;
	

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("login 经过了该验证类");
		
		List<GrantedAuthority> grantedAuth=new ArrayList<>();
		grantedAuth.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		cn.tds.manager.pojo.User user=testService.findByAccount(username);
			if(user!=null) {
				return new User(username,user.getPassword(),grantedAuth);
			}else {
				return null;
			}
		
	
	}

}
