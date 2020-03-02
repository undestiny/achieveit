package com.ecnu2020.achieveit.enums;


/**
 * 异常枚举
 * @author yan on 2020-02-27
 */
public enum ExceptionTypeEnum {

    LOGIN_INVALID(1001,"登录状态失效，请重新登录"),
    PROJECTID_MISSING(1002,"缺失项目id"),
    PROJECTID_INVALID(1003,"无效的项目id"),
    PERMISSION_DENIED(1004,"权限不足"),
    LOGIN_FAILED(1005,"登录校验失败"),
    ADD_FAIL(1006,"用户已存在"),
    DELETE_FAIL(1007,"用户不存在");



    private int errorCode;

    private String codeMessage;

    ExceptionTypeEnum(int errorCode, String codeMessage) {
        this.errorCode = errorCode;
        this.codeMessage = codeMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getCodeMessage() {
        return codeMessage;
    }
}
