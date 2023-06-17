package com.ust.bootsecurity.config;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@EnableWebSecurity//this class used for all security needs
public class EmpSecurityConfig  extends WebSecurityConfigurerAdapter{//override method
	
	
	@Autowired
	UserDetailsService userDetailsService;
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	//which users can use application ,who you are(authenticate user)

	//where 
//	auth.inMemoryAuthentication().withUser("bond").password("james").roles("USER")
//	.and().withUser("poo").password("bear").roles("ADMIN");
	//auth.jdbcAuthentication().dataSource(dataSource);
	auth.userDetailsService(userDetailsService);
}

@Bean
@SuppressWarnings("deprecation")
public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}
@Override
protected void configure(HttpSecurity http) throws Exception {
	//who can access which  endpoints
	http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")//only admin can access /admin endpoint
	.antMatchers("/user").hasAnyRole("USER").antMatchers("/").permitAll().and().formLogin();//user endpoint can be access by both admin and user
}
}
