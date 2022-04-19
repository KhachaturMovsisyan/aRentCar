package com.autorent.web.exception;

import com.autorent.web.exception.base.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends UserException {
}
