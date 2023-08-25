package com.app.service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;
  private Long id;
  private String username;
  private String email;

  @JsonIgnore
  private String password;
  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id, String username, String email, String password,
      Collection<? extends GrantedAuthority> authorities) {
	  System.out.println(getClass() +"and authorities method");
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(User user) {
	  System.out.println( "static build method");
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getUserRole().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getId(), 
        user.getUserName(), 
        user.getEmail(),
        user.getPassword(), 
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
	  System.out.println(getClass() +"and getAuthorities method");
    return authorities;
  }

  public Long getId() {
	  System.out.println(getClass() +"and getId method");
    return id;
  }

  public String getEmail() {
	System.out.println(getClass() +"and getEmail method");
    return email;
  }

  @Override
  public String getPassword() {
	System.out.println(getClass() +"and getPassword method");
    return password;
  }

  @Override
  public String getUsername() {
	System.out.println(getClass() +"and getUsername method");
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
	  System.out.println(getClass() +"and isAccountNonExpired method");
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
	  System.out.println(getClass() +"and isAccountNonLocked method");
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
	  System.out.println(getClass() +"and isAccountNonLocked method");
    return true;
  }

  @Override
  public boolean isEnabled() {
	  System.out.println(getClass() +"and isEnabled method");
    return true;
  }

  @Override
  public boolean equals(Object o) {
	  System.out.println(getClass() +"and equals method");
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
