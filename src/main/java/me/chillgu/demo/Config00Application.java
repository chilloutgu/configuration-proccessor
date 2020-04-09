package me.chillgu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import me.chillgu.demo.config.UserConfig;

@SpringBootApplication
@EnableConfigurationProperties(UserConfig.class)
public class Config00Application {

	public static void main(String[] args) {
		SpringApplication.run(Config00Application.class, args);
	}

}
