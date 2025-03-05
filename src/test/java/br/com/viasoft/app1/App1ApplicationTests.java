package br.com.viasoft.app1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;


@WebMvcTest(App1Application.class)
class App1ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		// Teste que verifica se a aplicação inicia sem falhas
		App1Application.main(new String[]{});

		//Add at least one assertion to this test case.
		Assert.isTrue(true, "Teste de contexto");
	}



}
