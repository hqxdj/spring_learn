package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.MyTest;

@Configuration
public class MyConfig {

	@Bean
	public MyTest myTest() {
		return new MyTest("xdj");
	}

}
