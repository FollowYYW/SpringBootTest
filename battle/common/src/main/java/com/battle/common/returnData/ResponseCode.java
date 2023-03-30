package com.battle.common.returnData;

/**
 * @Author kinds
 * @Date 2023/3/30 23:47
 * @Description 统一返回对象枚举
 */
public enum ResponseCode {

    /**
     * 成功
     */
    SUCCESS("200", "成功"),
    /**
     * 失败
     */
    FAIL("500", "失败"),
    ;

    private ResponseCode(String val, String msg) {
        this.val = val;
        this.msg = msg;
    }

    public String val(){
        return val;
    }

    public String msg(){
        return msg;
    }

    private String val;
    private String msg;
}
