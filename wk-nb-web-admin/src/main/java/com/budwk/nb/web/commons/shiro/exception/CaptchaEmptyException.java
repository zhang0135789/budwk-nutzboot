package com.budwk.nb.web.commons.shiro.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @author wizzer(wizzer@qq.com) on 2017/1/10.
 */
public class CaptchaEmptyException extends AuthenticationException {

    public CaptchaEmptyException() {
        super();
    }

    public CaptchaEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CaptchaEmptyException(String message) {
        super(message);
    }

    public CaptchaEmptyException(Throwable cause) {
        super(cause);
    }
}
