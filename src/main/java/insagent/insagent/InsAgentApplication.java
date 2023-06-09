package insagent.insagent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsAgentApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(InsAgentApplication.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(InsAgentApplication.class, args);
		LOG.info("End");
	}

}
