package SportsEventManager.API.api_sporting_events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "SportsEventManager.API.api_sporting_events.entities")
public class ApiSportingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSportingEventsApplication.class, args);
	}

}
