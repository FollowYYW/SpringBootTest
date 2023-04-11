package com.battle.common.returnData;

/**
 * @Author kinds
 * @Date 2023/3/30 23:52
 * @Description 统一返回样式封装
 */
public class ResultData {

    private int code;

    private String message;

    private Object data;

    public ResultData(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultData success (Object data){
        return new ResultData(ResponseCode.SUCCESS.val(), ResponseCode.SUCCESS.msg(), data);
    }

    public static ResultData success (Object data, String msg){
        return new ResultData(ResponseCode.SUCCESS.val(), msg, data);
    }

    public static ResultData fail (){
        return new ResultData(ResponseCode.FAIL.val(), ResponseCode.FAIL.msg(), null);
    }

    public static ResultData fail (String msg){
        return new ResultData(ResponseCode.FAIL.val(), msg, null);
    }

    public static ResultData fail (int code, String msg){
        return new ResultData(code, msg, null);
    }

    public static ResultData fail (int code, String msg, Object data){
        return new ResultData(code, msg, data);
    }
}
