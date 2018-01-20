package br.com.jordano.services.br.com.jordano.services.exceptions;

/**
 * Created by jordano on 20/01/2018.
 */
public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
