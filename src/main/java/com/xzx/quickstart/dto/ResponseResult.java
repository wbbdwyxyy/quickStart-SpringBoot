package com.xzx.quickstart.dto;

import com.xzx.quickstart.common.enums.HttpCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用的结果返回类
 *
 * @param <T>
 */
@Data
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {


    private Integer code;

    private String message;

    private T data;

    public ResponseResult() {
        this.code = 200;
    }

    public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public static ResponseResult errorResult(int code, String msg) {
        ResponseResult result = new ResponseResult();
        return result.error(code, msg);
    }

    public static ResponseResult okResult(int code, String msg) {
        ResponseResult result = new ResponseResult();
        return result.ok(code, null, msg);
    }

    public static ResponseResult okResult(Object data) {
        ResponseResult result = setHttpCodeEnum(HttpCodeEnum.SUCCESS, HttpCodeEnum.SUCCESS.getMessage());
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static ResponseResult errorResult(HttpCodeEnum enums) {
        return setHttpCodeEnum(enums, enums.getMessage());
    }

    public static ResponseResult errorResult(HttpCodeEnum enums, String errorMessage) {
        return setHttpCodeEnum(enums, errorMessage);
    }

    public static ResponseResult setHttpCodeEnum(HttpCodeEnum enums) {
        return okResult(enums.getCode(), enums.getMessage());
    }

    private static ResponseResult setHttpCodeEnum(HttpCodeEnum enums, String errorMessage) {
        return okResult(enums.getCode(), errorMessage);
    }

    public ResponseResult<?> error(Integer code, String msg) {
        this.code = code;
        this.message = msg;
        return this;
    }

    public ResponseResult<?> ok(Integer code, T data) {
        this.code = code;
        this.data = data;
        return this;
    }

    public ResponseResult<?> ok(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.message = msg;
        return this;
    }

    public ResponseResult<?> ok(T data) {
        this.data = data;
        return this;
    }
}
