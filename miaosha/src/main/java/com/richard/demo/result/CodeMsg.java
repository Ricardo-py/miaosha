package com.richard.demo.result;

public class CodeMsg {
    private int code;
    private String codeMsg;

    public CodeMsg(int code, String codemsg){
        this.code = code;
        this.codeMsg = codemsg;
    }

    public static CodeMsg SUCCESS = new CodeMsg(200, "成功了");
    public static CodeMsg ERROR = new CodeMsg(500, "失败了");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }

}
