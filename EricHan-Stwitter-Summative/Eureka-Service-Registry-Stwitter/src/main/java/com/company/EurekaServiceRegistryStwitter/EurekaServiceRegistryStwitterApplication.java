package com.company.EurekaServiceRegistryStwitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistryStwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryStwitterApplication.class, args);
	}

}
