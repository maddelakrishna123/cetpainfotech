package com.cetpa.mvc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.cetpa.mvc.dao.UserRepository;
import com.cetpa.mvc.models.Role;
import com.cetpa.mvc.models.User;
@Component
public class CustomeUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		   User user = repo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found");
		}
		else
		{
			
			List<GrantedAuthority> grantedAuthoritues = new ArrayList<GrantedAuthority>();
			
			    Set<Role> roles = user.getRoles();
			    
			    for(Role r:roles)
			    {
			    	SimpleGrantedAuthority sga = new SimpleGrantedAuthority(r.getRolename());
			    	grantedAuthoritues.add(sga);
			    }
			
			
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthoritues);
		
		}
	}

}
