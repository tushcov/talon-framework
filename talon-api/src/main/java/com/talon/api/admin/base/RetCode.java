package com.talon.api.admin.base;

import lombok.Data;

public enum  RetCode {

    SUCCESS(200, "SUCCEESS"),

    PAGE_NOT_FOUND(404,"页面找不到"),

    SERVICE_UNAVAILABLE(502, "服务不可用"),

    ;


    private Integer code;

    private String  msg;

    RetCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
