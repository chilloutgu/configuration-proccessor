package me.chillgu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import me.chillgu.demo.config.UserConfig;

@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	private UserConfig userConfig;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=========================");
		System.out.println("name :: " + userConfig.getName());
		System.out.println("age :: " + userConfig.getAge());
		System.out.println("fullName :: " + userConfig.getFullName());
		System.out.println("email :: " + userConfig.getEmail());
		System.out.println("=========================");
	}
}
