package top.inject.dada.request;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/api/order/formalCancel")
public class OrderCancelRequest {
    /**
     * 第三方订单编号
     */
    @JSONField(name = "order_id")
    private String orderId;
    /**
     * 取消原因ID（取消原因列表）
     */
    @JSONField(name = "cancel_reason_id")
    private Integer cancelReasonId;
    /**
     * 取消原因(当取消原因ID为其他时，此字段必填)
     */
    @JSONField(name = "cancel_reason")
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
