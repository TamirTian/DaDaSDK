package top.inject.dada.response;


import top.inject.dada.protocol.ResponseContainer;

import java.util.Objects;

public class DaDaResponse<T> {
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
     * 结果
     */
    private T result;
    /**
     * 错误编码，与code一致
     */
    private Integer errorCode;

    public DaDaResponse(ResponseContainer payload) {
        this.status = payload.getStatus();
        this.code = payload.getCode();
        this.msg = payload.getMsg();
        this.errorCode = payload.getErrorCode();
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getResult() {
        return result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public DaDaResponse<T> setStatus(String status) {
        this.status = status;
        return this;
    }

    public DaDaResponse<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public DaDaResponse<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public DaDaResponse<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public DaDaResponse<T> setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public boolean isSuccessful() {
        return Objects.equals(this.status, "success");
    }

    public boolean isFail() {
        return !Objects.equals(this.status, "success");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DaDaResponse{");
        sb.append("status='").append(status).append('\'');
        sb.append(", code=").append(code);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", result=").append(result);
        sb.append(", errorCode=").append(errorCode);
        sb.append('}');
        return sb.toString();
    }
}
