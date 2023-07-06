package com.battle.common.exception;

/**
 * @Author kinds
 * @Date 2023/4/12 0:38
 * @Description 1 开头的为非自定义异常
 */
public enum ExceptionEnums {

    RuntimeException(10001, "RuntimeException"),
    MethodArgumentNotValidException(10002, "非法参数验证异常"),
    HttpMessageNotReadableException(10003, "HTTP解析请求参数异常"),
    HttpMediaTypeException(10004, "请求Content-Type属性设置错误"),
    BadSqlGrammarException(10005, "SQL 语法异常"),

    AddUserFail(65001, "新增用户失败"),
    ;


    private Integer code;
    private String message;

    ExceptionEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
