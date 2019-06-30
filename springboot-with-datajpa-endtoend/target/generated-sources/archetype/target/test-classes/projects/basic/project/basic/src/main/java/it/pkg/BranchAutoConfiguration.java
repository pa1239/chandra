package it.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="it.pkg.entity")
public class BranchAutoConfiguration {
public static void main(String[] args) {
	SpringApplication.run(BranchAutoConfiguration.class, args);
}
}
