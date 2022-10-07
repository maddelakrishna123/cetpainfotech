package com.cetpa.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity

public class AppSecurirtConfig extends WebSecurityConfigurerAdapter{
	
	// authenticated users 
	@Autowired
	private UserDetailsService userdetailService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("krishna").password("$2a$12$EkYDLdHLdpRApdjEAlZIwONHkJHt3l0XFOdtC5V6rGotOl4nNa1KS").roles("ADMIN","USER")
		
		//.and().withUser("kumar").password("$2a$12$EkYDLdHLdpRApdjEAlZIwONHkJHt3l0XFOdtC5V6rGotOl4nNa1KS").roles("USER");
		
		
		auth.userDetailsService(userdetailService).passwordEncoder(passwordEncoder());
	}
	
	// authorization
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	  
		http.csrf().disable().authorizeRequests().antMatchers("/","/h2-console").permitAll()
		.and().authorizeRequests().antMatchers(HttpMethod.GET).hasAnyAuthority("USER","ADMIN").antMatchers(HttpMethod.POST).hasAnyAuthority("ADMIN")
		.anyRequest().authenticated().and().httpBasic().and().headers().frameOptions().disable();
	
	}


@Bean
public PasswordEncoder passwordEncoder()
{
//return	NoOpPasswordEncoder.getInstance();
	
	return new BCryptPasswordEncoder();
}


}
