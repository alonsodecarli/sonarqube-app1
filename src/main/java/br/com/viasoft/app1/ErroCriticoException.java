package br.com.viasoft.app1;

public class ErroCriticoException extends RuntimeException {

    public ErroCriticoException(String message) {
        super(message);
    }

    public ErroCriticoException(String message, Throwable cause) {
        super(message, cause);
    }
}