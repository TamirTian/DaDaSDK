package top.inject.dada.request;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/api/order/reAddOrder")
public class OrderRecreateRequest {
    /**
     * 门店编号，门店创建后可在门店列表和单页查看
     * 必传
     */
    @JSONField(name = "shop_no")
    private String shopNo;
    /**
     * 第三方订单ID
     * 必传
     */
    @JSONField(name = "origin_id")
    private String originId;
    /**
     * 订单所在城市的code
     * 必传
     */
    @JSONField(name = "city_code")
    private String cityId;
    /**
     * 订单金额
     * 必传
     */
    @JSONField(name = "cargo_price")
    private Double cargoPrice;
    /**
     * 是否需要垫付 1:是 0:否 (垫付订单金额，非运费)
     * 必传
     */
    @JSONField(name = "is_prepay")
    private Integer isPrepay;
    /**
     * 期望取货时间（1.时间戳,以秒计算时间，即unix-timestamp; 2.该字段的设定，不会影响达达正常取货; 3.订单被接单后,该时间往后推半小时后，配送员还未取货会自动被系统取消，;4.建议取值为当前时间往后推10~15分钟）
     * 必传
     */
    @JSONField(name = "expected_fetch_time")
    private Long expectedFetchTime;
    /**
     * 收货人姓名
     * 必传
     */
    @JSONField(name = "receiver_name")
    private String receiverName;
    /**
     * 收货人地址
     * 必传
     */
    @JSONField(name = "receiver_address")
    private String receiverAddress;
    /**
     * 收货人地址维度（高德坐标系）
     * 必传
     */
    @JSONField(name = "receiver_lat")
    private Double receiverLat;
    /**
     * 收货人地址经度（高德坐标系）
     * 必传
     */
    @JSONField(name = "receiver_lng")
    private Double receiverLng;
    /**
     * 回调URL（查看回调说明）
     * 必传
     */
    private String callback;
    /**
     * 收货人手机号（手机号和座机号必填一项）
     */
    @JSONField(name = "receiver_phone")
    private String receiverPhone;
    /**
     * 收货人座机号（手机号和座机号必填一项）
     */
    @JSONField(name = "receiver_tel")
    private String receiverTel;
    /**
     * 小费（单位：元，精确小数点后一位）
     */
    private Double tips;
    /**
     * 订单备注
     */
    private String info;
    /**
     * 订单商品类型：食品小吃-1,饮料-2,鲜花-3,文印票务-8,便利店-9,水果生鲜-13,同城电商-19, 医药-20,蛋糕-21,酒品-24,小商品市场-25,服装-26,汽修零配-27,数码-28,小龙虾-29, 其他-5
     */
    @JSONField(name = "cargo_type")
    private Integer cargoType;
    /**
     * 订单重量（单位：Kg）
     */
    @JSONField(name = "cargo_weight")
    private Double cargoWeight;
    /**
     * 订单商品数量
     */
    @JSONField(name = "cargo_num")
    private Integer cargoNum;
    /**
     * 发票抬头
     */
    @JSONField(name = "invoice_title")
    private String invoiceTitle;
    /**
     * 送货开箱码
     */
    @JSONField(name = "deliver_locker_code")
    private String deliverLockerCode;
    /**
     * 取货开箱码
     */
    @JSONField(name = "pickup_locker_code")
    private String pickupLockerCode;
    /**
     * 订单来源标示（该字段可以显示在达达app订单详情页面，只支持字母，最大长度为10）
     */
    @JSONField(name = "origin_mark")
    private String originMark;
    /**
     * 订单来源编号（该字段可以显示在达达app订单详情页面，只支持数字，最大长度为15）
     */
    @JSONField(name = "origin_mark_no")
    private String originMarkNo;

    public String getShopNo() {
        return shopNo;
    }

    public String getOriginId() {
        return originId;
    }

    public String getCityId() {
        return cityId;
    }

    public Double getCargoPrice() {
        return cargoPrice;
    }

    public Integer getIsPrepay() {
        return isPrepay;
    }

    public Long getExpectedFetchTime() {
        return expectedFetchTime;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public Double getReceiverLat() {
        return receiverLat;
    }

    public Double getReceiverLng() {
        return receiverLng;
    }

    public String getCallback() {
        return callback;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public Double getTips() {
        return tips;
    }

    public String getInfo() {
        return info;
    }

    public Integer getCargoType() {
        return cargoType;
    }

    public Double getCargoWeight() {
        return cargoWeight;
    }

    public Integer getCargoNum() {
        return cargoNum;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public String getDeliverLockerCode() {
        return deliverLockerCode;
    }

    public String getPickupLockerCode() {
        return pickupLockerCode;
    }

    public String getOriginMark() {
        return originMark;
    }

    public String getOriginMarkNo() {
        return originMarkNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCargoPrice(Double cargoPrice) {
        this.cargoPrice = cargoPrice;
    }

    public void setIsPrepay(Integer isPrepay) {
        this.isPrepay = isPrepay;
    }

    public void setExpectedFetchTime(Long expectedFetchTime) {
        this.expectedFetchTime = expectedFetchTime;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public void setReceiverLat(Double receiverLat) {
        this.receiverLat = receiverLat;
    }

    public void setReceiverLng(Double receiverLng) {
        this.receiverLng = receiverLng;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public void setTips(Double tips) {
        this.tips = tips;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCargoType(Integer cargoType) {
        this.cargoType = cargoType;
    }

    public void setCargoWeight(Double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setCargoNum(Integer cargoNum) {
        this.cargoNum = cargoNum;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public void setDeliverLockerCode(String deliverLockerCode) {
        this.deliverLockerCode = deliverLockerCode;
    }

    public void setPickupLockerCode(String pickupLockerCode) {
        this.pickupLockerCode = pickupLockerCode;
    }

    public void setOriginMark(String originMark) {
        this.originMark = originMark;
    }

    public void setOriginMarkNo(String originMarkNo) {
        this.originMarkNo = originMarkNo;
    }
}
