package com.example.travel.securitylogin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class SecurityloginApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SecurityloginApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        UserDetails user =
                User.builder()
                        .username("user")
                        .password(passwordEncoder().encode("12345"))
                        .roles("USER")
                        .build();
        System.out.println(user);
        System.out.println(user.getPassword());
    }
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
