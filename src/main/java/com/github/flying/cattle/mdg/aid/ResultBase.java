package com.github.flying.cattle.mdg.aid;

import java.io.Serializable;

/**
 * @description: 通用结果类
 * @author: wujian
 * @create: 2019年9月23日
 */
public class ResultBase<T> implements Serializable {
    
    private static final long serialVersionUID = 2057948781441813066L;
    private boolean isSuccess = false;
    private String errorMsg = "";
    private String errorCode = "";
    private T value;

    public ResultBase() {
        super();
    }

    public ResultBase(T value) {
        super();
        this.isSuccess = true;
        this.value = value;
    }

    public ResultBase(String errorCode, String errorMsg) {
        super();
        this.isSuccess = false;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public ResultBase(boolean success, String errorCode, String errorMsg) {
        super();
        this.isSuccess = success;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }
    
    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
   
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public static <T extends Object> ResultBase<T> success(T value) {
        ResultBase<T> result = new ResultBase<T>(true, ResultEnum.SUCESS.getCode(), ResultEnum.SUCESS.getMsg());
        result.setValue(value);
        return result;
    }
    
    public static <T extends Object> ResultBase<T> success(String message) {
        ResultBase<T> result = new ResultBase<T>(true, ResultEnum.SUCESS.getCode(), message);
        return result;
    }
    
    public static <T extends Object> ResultBase<T> error(String errorMessage) {
        return new ResultBase<T>(ResultEnum.FAILE.getCode(), errorMessage);
    }
    
    public static <T extends Object> ResultBase<T> error(String errorCode, String errorMessage) {
        return new ResultBase<T>(errorCode, errorMessage);
    }
    
}

