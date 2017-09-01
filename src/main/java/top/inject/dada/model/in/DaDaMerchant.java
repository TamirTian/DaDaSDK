package top.inject.dada.model.in;

public class DaDaMerchant {
    /**
     * 注册商户手机号,用于登陆商户后台
     */
    private String mobile;
    /**
     * 商户城市名称(如,上海)
     */
    private String cityName;
    /**
     * 企业全称
     */
    private String enterpriseName;
    /**
     * 企业地址
     */
    private String enterpriseAddress;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人电话
     */
    private String contactPhone;
    /**
     * 邮箱地址
     */
    private String email;

    public String getMobile() {
        return mobile;
    }

    public String getCityName() {
        return cityName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public DaDaMerchant setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public DaDaMerchant setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public DaDaMerchant setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }

    public DaDaMerchant setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
        return this;
    }

    public DaDaMerchant setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public DaDaMerchant setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public DaDaMerchant setEmail(String email) {
        this.email = email;
        return this;
    }
}
