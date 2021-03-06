package com.example.springbootproperties;

import com.example.springbootproperties.config.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class SpringbootpropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpropertiesApplication.class, args);
	}
}
