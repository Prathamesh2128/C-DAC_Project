package com.app.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.entities.User;

import lombok.Data;

@Data
public class UserDetailsImpl implements UserDetails{
	private User user;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println("get authorities "+user.getRoles());
		return user.getRoles().stream().map(r -> new SimpleGrantedAuthority(r.getUserRole().name()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		System.out.println("get pwd");
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}
	
	public int getId() {
		return user.getId();
	}
	
	public String getEmail() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return user.isActive();
	}
}
