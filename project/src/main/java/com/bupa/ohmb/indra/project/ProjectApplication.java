package com.bupa.ohmb.indra.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.bupa.ohmb.indra.project.controller.UserResponse;
import com.bupa.ohmb.indra.project.security.Authentication;

@ServletComponentScan
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	
	}

}
