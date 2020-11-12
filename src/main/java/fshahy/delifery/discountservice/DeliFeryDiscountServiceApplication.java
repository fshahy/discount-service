package fshahy.delifery.discountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliFeryDiscountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliFeryDiscountServiceApplication.class, args);
	}

}
