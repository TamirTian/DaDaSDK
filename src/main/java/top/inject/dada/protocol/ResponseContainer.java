package top.inject.dada.protocol;

/**
 * Created by Tamir on 2017/8/16.
 */
public class ResponseContainer {
    /**
     * 响应状态，成功为"success"，失败为"fail"
     */
    private String status;
    /**
     * 响应返回吗，参考 {@see <a href="http://newopen.imdada.cn/#/development/file/code?_k=pmog92"></a>}
     */
    private Integer code;
    /**
     * 响应描述
     */
    private String msg;
    /**
     * 响应结果，JSON对象，详见具体的接口描述
     */
    private String result;
    /**
     * 错误编码，与code一致
     */
    private Integer errorCode;

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getResult() {
        return result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
