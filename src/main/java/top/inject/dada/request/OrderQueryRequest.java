package top.inject.dada.request;

import com.alibaba.fastjson.annotation.JSONField;
import top.inject.dada.protocol.Request;

@Request(url = "/api/order/status/query")
public class OrderQueryRequest {
    /**
     * 第三方订单编号
     */
    @JSONField(name = "order_id")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public OrderQueryRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
}
