package com.cdv.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT, properties = {
		"server.port:8080" })
public class MyControllerTest {

	private TestRestTemplate template = new TestRestTemplate();
	@Value("${local.server.port}")
	private int port;

	@Test
	public void testRest() {
		String res = template.getForObject("http://localhost:" + port + "/web/api/my/getName", String.class);
		assertTrue(res.equals("Hello Spring Boot!"));
	}
}
