package top.inject.dada.request.mock;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/api/order/expire")
public class ExpireRequest {
    @JSONField(name = "order_id")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
