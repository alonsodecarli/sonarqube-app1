package br.com.viasoft.app1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ErroCriticoExceptionTest {

    @Test
    void testErroCriticoExceptionWithMessage() {
        String mensagem = "Erro crítico ocorrido";
        ErroCriticoException exception = new ErroCriticoException(mensagem);

        assertEquals(mensagem, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testErroCriticoExceptionWithMessageAndCause() {
        String mensagem = "Erro crítico com causa";
        Throwable causa = new RuntimeException("Causa do erro");
        ErroCriticoException exception = new ErroCriticoException(mensagem, causa);

        assertEquals(mensagem, exception.getMessage());
        assertEquals(causa, exception.getCause());
    }

}
