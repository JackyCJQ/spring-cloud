package com.jacky.app01.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResult<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public BaseResult() {
    }

    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> BaseResult<T> defaultSuccess(T data) {
        return new BaseResult<T>(0, "success", data);
    }

    public static <T> BaseResult<T> defaultSuccess(int code, String message) {
        return new BaseResult<T>(code, message, null);
    }

    public static <T> BaseResult<T> success(int code, String message, T data) {
        return new BaseResult<T>(code, message, data);
    }

}