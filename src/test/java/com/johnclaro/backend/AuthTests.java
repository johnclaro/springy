package com.johnclaro.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class AuthTests {

	@Test
	public void doit()
	{
		assertEquals("junit", "junit", "Should be junit");
	}

}
