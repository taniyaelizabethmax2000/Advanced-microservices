package com.ust.bootsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.bootsecurity.model.MyUserDetails;
import com.ust.bootsecurity.model.User;
import com.ust.bootsecurity.repo.UserRepository;

@Service
//userdetailsservice is a framework class which contains all methods
public class MyUserDetailsService implements UserDetailsService {

	@Autowired

	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Optional<User> user= repo.findByUserName(username);
	user.orElseThrow(() -> ( new UsernameNotFoundException("Not Found: " + username ) ));
	
	return user.map(MyUserDetails::new).get();
	}

}
