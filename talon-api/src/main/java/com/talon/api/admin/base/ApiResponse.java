package com.talon.api.admin.base;

import lombok.Data;

@Data
public class ApiResponse <T>{

    private Integer code;

    private String msg;

    private T data;

    public ApiResponse(Integer code, String msg, T data) {
        this.code = RetCode.SUCCESS.getCode();
        this.msg = RetCode.SUCCESS.getMsg();
        this.data = data;
    }
}
