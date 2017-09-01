package top.inject.dada.protocol;

import com.alibaba.fastjson.annotation.JSONField;

public class RequestContainer {
    /**
     * 应用Key，对应开发者账号中的app_key
     */
    @JSONField(name = "app_key")
    private String appKey;
    /**
     * 签名Hash值，参见：接口签名规则
     */
    private String signature;
    /**
     * 时间戳,单位秒，即unix-timestamp
     */
    private String timestamp;
    /**
     * 请求格式，暂时只支持json
     */
    private String format;
    /**
     * API版本
     */
    private String v;
    /**
     * 商户编号（创建商户账号分配的编号）
     */
    @JSONField(name = "source_id")
    private String sourceId;
    /**
     * 业务参数 json
     */
    private String body;

    public String getAppKey() {
        return appKey;
    }

    public String getSignature() {
        return signature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getFormat() {
        return format;
    }

    public String getV() {
        return v;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getBody() {
        return body;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setV(String v) {
        this.v = v;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public RequestContainer setBody(String body) {
        this.body = body;
        return this;
    }
}
