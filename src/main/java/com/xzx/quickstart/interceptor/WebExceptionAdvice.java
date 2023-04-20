package com.xzx.quickstart.interceptor;

import com.xzx.quickstart.common.enums.HttpCodeEnum;
import com.xzx.quickstart.dto.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常统一返回结果
 */
@Slf4j
@RestControllerAdvice
public class WebExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseResult handleRuntimeException(RuntimeException e) {
        log.error(e.toString(), e);
        return ResponseResult.errorResult(HttpCodeEnum.SERVER_ERROR);
    }
}
