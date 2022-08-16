package com.quicktron.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



/**
 * @Author houfeng
 * @Date 2022/7/1 16:30
 */
public class CommonResponse<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResponse(T data){
        this.data = data;
    }

    public static <T> CommonResponse<T> success(T data){
        CommonResponse<T> commonResponse = new CommonResponse<>(data);
        commonResponse.setCode(ResponseCodeConstants.SUCCESS_CODE);
        return commonResponse;
    }
    
    public Boolean isSuccess(){
        return ResponseCodeConstants.SUCCESS_CODE.equals(this.code);
    }
    
    public CommonResponse() {
    }
    
    
    public Integer getCode() {
        return code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
