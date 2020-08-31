package com.Team3.loanProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles(value = "tests")
@ContextConfiguration(classes = TestConfig.class)
@SpringBootTest
class LoanProjectApplicationTests {

	@Test
	void contextLoads() {
	}

}
