package top.inject.dada.request;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/merchantApi/merchant/add")
public class MerchantCreateRequest {
    /**
     * 注册商户手机号,用于登陆商户后台
     */
    private String mobile;
    /**
     * 商户城市名称(如,上海)
     */
    @JSONField(name = "city_name")
    private String cityName;
    /**
     * 企业全称
     */
    @JSONField(name = "enterprise_name")
    private String enterpriseName;
    /**
     * 企业地址
     */
    @JSONField(name = "enterprise_address")
    private String enterpriseAddress;
    /**
     * 联系人姓名
     */
    @JSONField(name = "contact_name")
    private String contactName;
    /**
     * 联系人电话
     */
    @JSONField(name = "contact_phone")
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

    public MerchantCreateRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public MerchantCreateRequest setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public MerchantCreateRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }

    public MerchantCreateRequest setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
        return this;
    }

    public MerchantCreateRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public MerchantCreateRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public MerchantCreateRequest setEmail(String email) {
        this.email = email;
        return this;
    }
}
