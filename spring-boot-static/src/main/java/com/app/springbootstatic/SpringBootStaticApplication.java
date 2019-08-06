package com.app.springbootstatic;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.app.springbootstatic.service.SpringBootStaticService;

@SpringBootApplication
public class SpringBootStaticApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootStaticApplication.class, args);

	}

}
