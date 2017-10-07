package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Mahmut on 10/7/2017.
 */
@Configuration
@EnableJpaRepositories(basePackages = "app.repository")
public class JPAConfiguration {


}
