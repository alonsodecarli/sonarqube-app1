package br.com.viasoft.app1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(App1Application.class)
class App1ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testHelloWithoutName() throws Exception {
		mockMvc.perform(get("/hello")) // Faz GET em /hello
				.andExpect(status().isOk()) // Espera HTTP 200
				.andExpect(content().string("Hello World!")); // Espera "Hello World!"
	}

	@Test
	void testHelloWithName() throws Exception {
		mockMvc.perform(get("/hello").param("name", "Alonso"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Alonso!"));
	}
}
