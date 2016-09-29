package com.mo.retail.store.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mo.retail.store.restapi.model.ErrorMessage;

/**
 * Rest APIp Exception handler
 * 
 * @author vinit-prajapati
 *
 */
@ControllerAdvice
public class RestExceptionHandler {

	private final ErrorMessage invalidMethod = new ErrorMessage("99", "Invalid HTTP Request Method");
	private final ErrorMessage invalidResource = new ErrorMessage("98", "Internal Server Error");

	/**
	 * Returns error message for invalid method
	 * 
	 * @return ErrorMessage
	 */
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public @ResponseBody ResponseEntity<ErrorMessage> handleInvalidMethod() {
		return new ResponseEntity<ErrorMessage>(invalidMethod, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Returns error for any exception within system
	 * 
	 * @param exception
	 * @return ErrorMessage
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ResponseEntity<ErrorMessage> handleError(final Exception exception) {
		System.out.println(exception.getMessage());
		exception.printStackTrace();
		return new ResponseEntity<ErrorMessage>(invalidResource, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
