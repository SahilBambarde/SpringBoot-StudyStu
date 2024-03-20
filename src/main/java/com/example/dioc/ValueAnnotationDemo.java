package com.example.dioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {
    @Value("Default Name")
    private String defaultName;

    public String getHost() {
        return host;
    }

    @Value("${mail.host}")
    private String host;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Value("${mail.email}")
    private String email;
    @Value("${mail.password}")
    private String password;

    public String getJavaHome() {
        return javaHome;
    }

    @Value("${java.home}")
    private String javaHome;
//    @Value("${home}")
//    private String homeDir;
    public String getDefaultName() {
        return defaultName;
    }
}
