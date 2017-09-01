package top.inject.dada.model.out;

public class DaDaOrder {
    /**
     * 第三方订单编号
     */
    private String orderId;
    /**
     * 状态编码(待接单＝1 待取货＝2 配送中＝3 已完成＝4 已取消＝5 已过期＝7 指派单=8)
     */
    private Integer statusCode;
    /**
     * 订单状态
     */
    private String statusMsg;
    /**
     * 骑手姓名
     */
    private String transporterName;
    /**
     * 骑手电话
     */
    private String transporterPhone;
    /**
     * 骑手经度
     */
    private String transporterLng;
    /**
     * 骑手纬度
     */
    private String transporterLat;
    /**
     * 配送费,单位为元
     */
    private String deliveryFee;
    /**
     * 小费,单位为元
     */
    private String tips;
    /**
     * 配送距离,单位为米
     */
    private String distance;
    /**
     * 发单时间
     */
    private String createTime;
    /**
     * 接单时间,若未接单,则为空
     */
    private String acceptTime;
    /**
     * 取货时间,若未取货,则为空
     */
    private String fetchTime;
    /**
     * 送达时间,若未送达,则为空
     */
    private String finishTime;
    /**
     * 取消时间,若未取消,则为空
     */
    private String cancelTime;

    public String getOrderId() {
        return orderId;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public String getTransporterName() {
        return transporterName;
    }

    public String getTransporterPhone() {
        return transporterPhone;
    }

    public String getTransporterLng() {
        return transporterLng;
    }

    public String getTransporterLat() {
        return transporterLat;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public String getTips() {
        return tips;
    }

    public String getDistance() {
        return distance;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public String getFetchTime() {
        return fetchTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public void setTransporterName(String transporterName) {
        this.transporterName = transporterName;
    }

    public void setTransporterPhone(String transporterPhone) {
        this.transporterPhone = transporterPhone;
    }

    public void setTransporterLng(String transporterLng) {
        this.transporterLng = transporterLng;
    }

    public void setTransporterLat(String transporterLat) {
        this.transporterLat = transporterLat;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }
}
