package com.chenpc.admin.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 自定义异常
 * @author chenpc
 * @version 1.0
 * @since 2021/3/12/03/12  14:16
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户信息错误")
@AllArgsConstructor
public class UserInfoException extends RuntimeException{

}
