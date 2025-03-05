package br.com.viasoft.app1;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class App1ApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		// Teste que verifica se a aplicação inicia sem falhas
		App1Application.main(new String[]{});

		// Verifica se o contexto da aplicação foi carregado corretamente
		assertNotNull(applicationContext, "O contexto da aplicação não deve ser nulo");
	}
}
