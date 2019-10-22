package examRemake.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("examRemake")
public class RootApplicationContextConfig {

	@Bean
	public SessionFactory factory() {
		SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

		return factory;
	}
}