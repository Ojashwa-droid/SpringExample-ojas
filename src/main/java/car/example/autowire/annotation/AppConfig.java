package car.example.autowire.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "car.example.autowire.annotation")
public class AppConfig {
}
