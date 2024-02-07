import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(scopeName = "singleton")
    public Employee employee(){
        return new Employee(1,"India",555.5,address());
    }

    @Bean
    public Address address(){
        return new Address(1,"Chennai","570099");
    }
}
