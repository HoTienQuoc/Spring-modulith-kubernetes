package com.springmodulith.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ApplicationModules.of(DemoApplication.class).verify();
	}

}
