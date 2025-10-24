package hello_routine_tracker.hello_routine_tracker_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloRoutineTrackerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRoutineTrackerEurekaApplication.class, args);
	}

}
