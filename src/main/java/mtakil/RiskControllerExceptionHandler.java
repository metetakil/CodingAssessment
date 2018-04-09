package mtakil;

import mtakil.model.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class RiskControllerExceptionHandler /*extends ResponseEntityExceptionHandler */ {

    @ExceptionHandler(value = HttpClientErrorException.class)
    public ResponseEntity handleHttpClientErrorException(HttpServletRequest request, HttpClientErrorException e) {
        ErrorInfo eInfo = new ErrorInfo();
        eInfo.setMessage(e.getMessage());
        eInfo.setHttpStatus(e.getStatusCode());
        eInfo.setExceptionName(e.getClass().getSimpleName());

        return new ResponseEntity(eInfo, e.getStatusCode());
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity handleUnknownHostException(HttpServletRequest request, NullPointerException e) {
        ErrorInfo eInfo = new ErrorInfo();
        eInfo.setMessage(e.getMessage());
        eInfo.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        eInfo.setExceptionName(e.getClass().getSimpleName());

        return new ResponseEntity(eInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity handle(HttpMessageNotReadableException e) {
        ErrorInfo eInfo = new ErrorInfo();
        eInfo.setMessage(e.getMessage());
        eInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        eInfo.setExceptionName(e.getClass().getSimpleName());

        return new ResponseEntity(eInfo, HttpStatus.BAD_REQUEST);
    }

/*
    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

 */



}
