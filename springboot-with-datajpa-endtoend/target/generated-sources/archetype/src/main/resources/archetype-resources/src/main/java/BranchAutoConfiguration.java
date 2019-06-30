#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="${package}.entity")
public class BranchAutoConfiguration {
public static void main(String[] args) {
	SpringApplication.run(BranchAutoConfiguration.class, args);
}
}
