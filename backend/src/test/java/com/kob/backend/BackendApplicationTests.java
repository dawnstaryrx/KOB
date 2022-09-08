package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.xml.bind.SchemaOutputResolver;
import java.net.PasswordAuthentication;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("dfjb"));
        System.out.println(passwordEncoder.encode("yzd"));
        System.out.println(passwordEncoder.encode("ch"));
        System.out.println(passwordEncoder.encode("abc"));
    }

}
