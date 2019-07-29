package com.eric.EricHanCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EricHanCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EricHanCloudConfigServerApplication.class, args);
	}

}
