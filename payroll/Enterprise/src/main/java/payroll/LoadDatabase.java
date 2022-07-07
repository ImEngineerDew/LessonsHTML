import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.toadsdewin.payroll.*;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(payroll.EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new payroll.Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new payroll.Employee("Frodo Baggins", "thief")));
        };
    }
}