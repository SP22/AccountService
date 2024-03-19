package account.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorMessage> handleUserException(AuthException e, WebRequest request) {
        ErrorMessage body = new ErrorMessage(
                HttpStatus.BAD_REQUEST.value(),
                LocalDateTime.now(),
                e.getMessage(),
                request.getContextPath());

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}
