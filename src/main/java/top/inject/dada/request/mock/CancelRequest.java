package top.inject.dada.request.mock;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/api/order/cancel")
public class CancelRequest {
    @JSONField(name = "order_id")
    private String orderId;
    private String reason;

    public String getOrderId() {
        return orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
