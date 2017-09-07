package top.inject.dada.service;

import top.inject.dada.config.Config;
import top.inject.dada.protocol.ResponseContainer;
import top.inject.dada.request.mock.*;
import top.inject.dada.response.DaDaResponse;

public class MockService extends DaDaService {

    private final Config config;

    public MockService(Config config) {
        this.config = config;
    }

    /**
     * 接受订单(仅在测试环境供调试使用)
     *
     * @param sourceId 商户
     * @param orderId  订单号
     * @return
     */
    public DaDaResponse accept(Long sourceId, String orderId) {
        AcceptRequest request = new AcceptRequest();
        request.setOrderId(orderId);

        ResponseContainer container = call(config, sourceId, request);

        return new DaDaResponse<>(container);
    }

    /**
     * 完成取货(仅在测试环境供调试使用)
     *
     * @param sourceId 商户
     * @param orderId  订单号
     * @return
     */
    public DaDaResponse fetch(Long sourceId, String orderId) {
        FetchRequest request = new FetchRequest();
        request.setOrderId(orderId);

        ResponseContainer container = call(config, sourceId, request);

        return new DaDaResponse<>(container);
    }

    /**
     * 完成订单
     *
     * @param sourceId 商户
     * @param orderId  订单号
     * @return
     */
    public DaDaResponse finish(Long sourceId, String orderId) {
        FinishRequest request = new FinishRequest();
        request.setOrderId(orderId);

        ResponseContainer container = call(config, sourceId, request);

        return new DaDaResponse<>(container);
    }

    /**
     * 取消订单(仅在测试环境供调试使用)
     *
     * @param sourceId 商户
     * @param orderId  订单号
     * @return
     */
    public DaDaResponse cancel(Long sourceId, String orderId, String reason) {
        CancelRequest request = new CancelRequest();
        request.setOrderId(orderId);
        request.setReason(reason);

        ResponseContainer container = call(config, sourceId, request);

        return new DaDaResponse<>(container);
    }

    /**
     * 订单过期(仅在测试环境供调试使用)
     *
     * @param sourceId 商户
     * @param orderId  订单号
     * @return
     */
    public DaDaResponse expire(Long sourceId, String orderId) {
        ExpireRequest request = new ExpireRequest();
        request.setOrderId(orderId);

        ResponseContainer container = call(config, sourceId, request);

        return new DaDaResponse<>(container);
    }

}
