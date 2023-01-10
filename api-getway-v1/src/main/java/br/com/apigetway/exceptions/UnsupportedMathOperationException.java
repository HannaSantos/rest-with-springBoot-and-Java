package br.com.apigetway.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Essa classe sempre vai retorno um código de erro BAD REQUEST
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

    public UnsupportedMathOperationException(String ex) {
        super(ex);
    }

    private static final long serialVersionUID = 1L;
}
