package com.rohithempire9.githubintelljdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class GithubIntelljDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubIntelljDemoApplication.class, args);
    }
}