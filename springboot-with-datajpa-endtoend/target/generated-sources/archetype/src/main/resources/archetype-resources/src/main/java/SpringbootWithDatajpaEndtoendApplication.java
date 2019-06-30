#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWithDatajpaEndtoendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithDatajpaEndtoendApplication.class, args);
	}

}
