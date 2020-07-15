package net.eprojex.handoferisband.cloud.handoferisspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HandoferisSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandoferisSpringCloudConfigServerApplication.class, args);
	}

}
