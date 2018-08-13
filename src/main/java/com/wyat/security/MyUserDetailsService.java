package com.wyat.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Transactional
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private com.wyat.dao.repository.UserRepository userRepository;


    public MyUserDetailsService() {
        super();
    }

    // API

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
       

        try {
            final com.wyat.dao.domain.User user = userRepository.findByEmailAddress(email);
            if (user == null) {
                throw new UsernameNotFoundException("No user found with username: " + email);
            }

            return  loadUserByUsername(user.getEmailAddress());
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }




}
