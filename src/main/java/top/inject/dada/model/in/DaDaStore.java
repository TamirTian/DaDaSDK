package top.inject.dada.model.in;

import com.alibaba.fastjson.annotation.JSONField;

public class DaDaStore {
    /**
     * 门店名称
     * 必填：是
     */
    @JSONField(name = "station_name")
    private String stationName;
    /**
     * 业务类型(食品小吃-1,饮料-2,鲜花-3,文印票务-8,便利店-9,水果生鲜-13,同城电商-19, 医药-20,蛋糕-21,酒品-24,小商品市场-25,服装-26,汽修零配-27,数码-28,小龙虾-29, 其他-5)
     * 必填：是
     */
    private Integer business;
    /**
     * 城市名称(如,上海)
     * 必填：是
     */
    @JSONField(name = "city_name")
    private String cityName;
    /**
     * 区域名称(如,浦东新区)
     * 必填：是
     */
    @JSONField(name = "area_name")
    private String areaName;
    /**
     * 门店地址
     * 必填：是
     */
    @JSONField(name = "station_address")
    private String stationAddress;
    /**
     * 门店经度
     * 必填：是
     */
    private Double lng;
    /**
     * 门店纬度
     * 必填：是
     */
    private Double lat;
    /**
     * 联系人姓名
     * 必填：是
     */
    @JSONField(name = "contact_name")
    private String contactName;
    /**
     * 联系人电话
     * 必填：是
     */
    private String phone;
    /**
     * 门店编码,可自定义,但必须唯一;若不填写,则系统自动生成
     */
    @JSONField(name = "origin_shop_id")
    private String originShopId;
    /**
     * 联系人身份证
     */
    @JSONField(name = "id_card")
    private String idCard;
    /**
     * 达达商家app账号(若不需要登陆app,则不用设置)
     */
    private String username;
    /**
     * 达达商家app密码(若不需要登陆app,则不用设置)
     */
    private String password;

    public String getStationName() {
        return stationName;
    }

    public Integer getBusiness() {
        return business;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public Double getLng() {
        return lng;
    }

    public Double getLat() {
        return lat;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhone() {
        return phone;
    }

    public String getOriginShopId() {
        return originShopId;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setBusiness(Integer business) {
        this.business = business;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOriginShopId(String originShopId) {
        this.originShopId = originShopId;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DaDaStore{" +
                "stationName='" + stationName + '\'' +
                ", business=" + business +
                ", cityName='" + cityName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", stationAddress='" + stationAddress + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", contactName='" + contactName + '\'' +
                ", phone='" + phone + '\'' +
                ", originShopId='" + originShopId + '\'' +
                ", idCard='" + idCard + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
