package com.wyat.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class ServiceUnavailableException extends HttpStatusCodeException {

	private static final long serialVersionUID = 1L;

	public ServiceUnavailableException(HttpStatus statusCode, String statusText) {
        super(statusCode, statusText);
    }
}
