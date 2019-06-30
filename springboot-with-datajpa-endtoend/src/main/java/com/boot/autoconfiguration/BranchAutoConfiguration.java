package com.boot.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.boot.autoconfiguration.entity")
public class BranchAutoConfiguration {
public static void main(String[] args) {
	SpringApplication.run(BranchAutoConfiguration.class, args);
}
}
