package cn.yadao.springcloud.util;

public class AjaxResult {

    private Boolean success;
    private String message;

    private Object returnObj;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnObj() {
        return returnObj;
    }

    public AjaxResult setReturnObj(Object returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    //创建自己的一个实列
    public static AjaxResult me(){
        return new AjaxResult();
    }


}
