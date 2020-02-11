/**
 * 
 */
package com.pavnik.employee.security;

import static org.springframework.security.core.userdetails.User.withUsername;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.pavnik.employee.entity.User;
import com.pavnik.employee.repo.UserRepository;

/**
 * @author pavni
 *
 */
@Component
public class EmployeeWebUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JWTProvider empJWTProvider;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() ->
        new UsernameNotFoundException(String.format("User with name %s does not exist", username)));

		return withUsername(user.getUsername())
		    .password(user.getPassword())
		    .authorities(user.getRoles())
		    .accountExpired(false)
		    .accountLocked(false)
		    .credentialsExpired(false)
		    .disabled(false)
		    .build();
	}
	/**
	 * 
	 * @param jwtToken
	 * @return
	 */
    public Optional<UserDetails> loadUserByJwtToken(String jwtToken) {
        if (empJWTProvider.isValidToken(jwtToken)) {
            return Optional.of(
                withUsername(empJWTProvider.getUsername(jwtToken))
                .authorities(empJWTProvider.getRoles(jwtToken))
                .password("") 
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build());
        }
        return Optional.empty();
    }
    /**
     * 
     * @param jwtToken
     * @return
     */
    public Optional<UserDetails> loadUserByJwtTokenAndDatabase(String jwtToken) {
        if (empJWTProvider.isValidToken(jwtToken)) {
            return Optional.of(loadUserByUsername(empJWTProvider.getUsername(jwtToken)));
        } else {
            return Optional.empty();
        }
    }
}
