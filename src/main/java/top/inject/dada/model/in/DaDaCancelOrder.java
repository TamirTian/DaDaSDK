package top.inject.dada.model.in;

public class DaDaCancelOrder {
    /**
     * 第三方订单编号
     */
    private String orderId;
    /**
     * 取消原因ID（取消原因列表）
     */
    private Integer cancelReasonId;
    /**
     * 取消原因(当取消原因ID为其他时，此字段必填)
     */
    private String cancelReason;

    public String getOrderId() {
        return orderId;
    }

    public Integer getCancelReasonId() {
        return cancelReasonId;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCancelReasonId(Integer cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
}