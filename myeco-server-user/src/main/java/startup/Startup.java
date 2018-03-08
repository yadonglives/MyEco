package startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 *
 * @description	： 启动用户服务
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午10:55:19
 */
@SpringBootApplication
@EnableEurekaClient
public class Startup {
	
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
