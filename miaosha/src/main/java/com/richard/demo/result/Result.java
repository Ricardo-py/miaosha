package com.richard.demo.result;

public class Result<T> {
    private int code;
    private String codeMsg;
    private T data;

    public Result(T data){
        this.code = 200;
        this.codeMsg = "成功了";
        this.data = data;
    }

    public Result(CodeMsg codemsg){
        if (codemsg == null)
            return ;
        this.code = codemsg.getCode();
        this.codeMsg = codemsg.getCodeMsg();
    }

    public static <T> Result<T> Success(T data){
        return new Result(data);
    }

    public static <T> Result<T> Error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

    public int getCode() {
        return code;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public T getData() {
        return data;
    }
}
