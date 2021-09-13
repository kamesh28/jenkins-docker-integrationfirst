package com.dockerjenkin.dockerjenkinintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinIntegrationApplication {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Jenkins-Docker-Integration";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinIntegrationApplication.class, args);
	}

}
