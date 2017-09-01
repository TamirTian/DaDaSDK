package top.inject.dada.config;

public class Config {
    /**
     * application key
     */
    private String appKey;
    /**
     * application secret
     */
    private String appSecret;
    /**
     * 测试环境
     */
    private boolean sandbox;
    /**
     * 请求格式
     */
    private String format;
    /**
     * 版本
     */
    private String version;

    public Config(String appKey, String appSecret, boolean sandbox) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.sandbox = sandbox;
        this.format = "json";
        this.version = "1.0";
    }

    public Config(String appKey, String appSecret, boolean sandbox, String format, String version) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.sandbox = sandbox;
        this.format = format;
        this.version = version;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public boolean isSandbox() {
        return sandbox;
    }

    public String getFormat() {
        return format;
    }

    public String getVersion() {
        return version;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
