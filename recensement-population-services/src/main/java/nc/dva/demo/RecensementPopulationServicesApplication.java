package nc.dva.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RecensementPopulationServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecensementPopulationServicesApplication.class,
                args);
    }
}
