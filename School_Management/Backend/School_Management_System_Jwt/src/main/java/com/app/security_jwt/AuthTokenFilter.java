package com.app.security_jwt;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;
import com.app.service.UserDetailsServiceImpl;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthTokenFilter extends OncePerRequestFilter {
  @Autowired
  private JwtUtils jwtUtils;

  @Autowired
  private UserDetailsServiceImpl userDetailsService;

  private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			System.out.println(getClass() +"and in filter ");
			String authHeader = request.getHeader("Authorization");
			if (authHeader != null && authHeader.startsWith("Bearer ")) {
				System.out.println("contains JWT " + authHeader);
				String jwt = authHeader.substring(7);// extracting jwt token value from auth header
				// validate JWT
				if (jwtUtils.validateJwtToken(jwt)) {
					// In case of validated token : get user's identity n add it in security ctx
					// holder.
					//1 . get user name from validated JWT (there is no pwd or authorities in the token)
					UserDetails userDetails = userDetailsService
							.loadUserByUsername(jwtUtils.getUserNameFromJwtToken(jwt));
					//if the authentication object is already not available from sec ctx
					if (SecurityContextHolder.getContext().getAuthentication() == null) {

						// create a new Authentication object
						UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
								userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
						authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						SecurityContextHolder.getContext().setAuthentication(authentication);
					}
				}
			}
		} finally {
			filterChain.doFilter(request, response);
		}
	}
}
