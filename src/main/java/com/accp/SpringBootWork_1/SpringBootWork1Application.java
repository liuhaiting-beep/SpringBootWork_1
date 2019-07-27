package com.accp.SpringBootWork_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@ImportResource(value= {"classpath:spring-web.xml"})
@SpringBootApplication
//@ComponentScan(basePackages = {"dao","biz","action","cfg","pojo","interceptor"})
public class SpringBootWork1Application extends SpringBootServletInitializer{

		//jar
		public static void main(String[] args) {
			SpringApplication.run(SpringBootWork1Application.class, args);
		}

		
		//war
		@Override
		public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(SpringBootWork1Application.class);
		}

}
