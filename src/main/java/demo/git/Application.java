package demo.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("demo.git")
public class Application {

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}

// private static final Logger log = LoggerFactory.getLogger(Application.class);

// @Bean
// public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
// return args -> {
// User user = restTemplate.getForObject(
// "https://api.github.com/users/octocat", User.class);
// log.info(user.toString());
// };
// }
