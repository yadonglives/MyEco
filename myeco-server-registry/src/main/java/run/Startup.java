package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 *
 * @description	： 启动注册中心
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午10:55:19
 */
@EnableEurekaServer
@SpringBootApplication
public class Startup {
	
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
