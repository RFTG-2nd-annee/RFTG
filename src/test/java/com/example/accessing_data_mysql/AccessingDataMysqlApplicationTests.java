package com.example.accessing_data_mysql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AccessingDataMysqlApplicationTests {

	@Test
	void contextLoads() {
	}

}
