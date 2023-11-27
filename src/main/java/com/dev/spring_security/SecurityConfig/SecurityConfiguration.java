package com.dev.spring_security.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration  {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails userDetails = User.withUsername("baskar").password("baskar").roles("USER").build();
        return new InMemoryUserDetailsManager(userDetails);
    }

}
