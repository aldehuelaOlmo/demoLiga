package controller;

import javax.validation.ConstraintViolationException;

/**
 * Created by victor.nieto.castan on 05/06/2017.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public void handleHttpMessageNotReadableException(Exception ex) {

        log.error("Request Body with unreadable format", ex);
    }

    @ResponseStatus(HttpStatus.CONFLICT) // 409
    @ExceptionHandler(ConstraintViolationException.class)
    public void handleConstraintViolationException(Exception ex) {

        log.error("Data Integrity Violation Exception: ", ex);
    }

    @ResponseStatus(HttpStatus.CONFLICT) // 409
    @ExceptionHandler(TransactionSystemException.class)
    public void handleTransactionSystemException(Exception ex) {

        log.error("An error occurred processing request", ex);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {

        log.error("An error occurred processing request", ex);
    }

    @ResponseStatus(HttpStatus.CONFLICT) // 409
    @ExceptionHandler(CloneNotSupportedException.class)
    public void handleCloneError(Exception ex) {

        log.error("An error occurred processing clone", ex);
    }

    @ResponseStatus(HttpStatus.CONFLICT) // 409
    @ExceptionHandler(ParseException.class)
    public void handleParseExceptionError(Exception ex) {

        log.error("An error occurred processing parse", ex);
    }


}
