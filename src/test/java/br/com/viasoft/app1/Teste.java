package br.com.viasoft.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Teste {

    private static final Logger logger = LoggerFactory.getLogger(Teste.class);

    public void metodo() {
        // gere um erro critico no sonar
        logger.info("Teste");

        // Uso inseguro de senha (Security Hotspot)
        String senha2 = "123456";

        logger.info( String.format("Senha: %s", senha2));

        throw new ErroCriticoException("Erro crítico intencional para SonarQube");
    }

    public static void main(String[] args) {
        logger.info("Hello World!");
    }

}
